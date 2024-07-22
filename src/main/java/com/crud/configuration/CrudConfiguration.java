package com.crud.configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import jakarta.annotation.PostConstruct;

@Configuration
public class CrudConfiguration {

	@Value("${spring.datasource.url}")
	private String pgDbURL;
	
	@Value("${spring.datasource.username}")
	private String pgDbUserName;
	
	@Value("${spring.datasource.password}")
	private String pgDbPassword;
	
	@Value("${spring.datasource.name}")
	private String pgDbName;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CrudConfiguration.class);

    @PostConstruct
    void createDataBase() {
    	Connection connection = null;
    	Statement statement = null;
		try {
			connection = DriverManager.getConnection(pgDbURL, pgDbUserName, pgDbPassword);
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT COUNT(*) "
											+ "FROM pg_database WHERE "
											+ "datName='\"+pgDbName+\"'");
			resultSet.next();
			int count = resultSet.getInt(1);
			if(count<=0) {
				statement.executeUpdate("CREATE DATABASE " + pgDbName);
				LOGGER.info("Database "+pgDbName+ " is created.");
			} else {
				LOGGER.info("Database "+pgDbName+ " is already exists.");
			}
		} catch (SQLException e) {
			LOGGER.error(e.toString());
		}finally {
			try {
				if(connection!=null) {
					connection.close();
					LOGGER.info("Closed the Connection");
				}
				if(statement!=null) {
					statement.close();
					LOGGER.info("Closed the Statement");
				}
			}catch(SQLException e){
				LOGGER.error(e.toString());
			}
		}
	}
	
}
