package com.matiar.api.explore.config;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.flyway.FlywayDataSource;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration //It tells that this is a configuration class
public class PersistenceConfiguration {
	/*
	 * @Bean tells spring and spring boot that the returning value of this method
	 * which is a DataSource needs to be set up as a spring Bean in Spring context
	 */
	@Bean

	/*
	 * @ConfigurationProperties tells the DataSourceBuilder to use a connection and
	 * pulling properties located in application.properties file when the property
	 * begin with spring.datasource prefix
	 */
	@ConfigurationProperties(prefix = "spring.datasource")
	@Primary // then spring boot will recognize it as default datasource (avoids any ambiguity)
	public DataSource dataSource() {
		return DataSourceBuilder.create().build();
	}

	@Bean
	@ConfigurationProperties(prefix = "spring.flyway")
	@FlywayDataSource
	// method name doesn't matter
	public DataSource flywayDataSource() {
		return DataSourceBuilder.create().build();
	}
}
