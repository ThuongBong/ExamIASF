package com.example.examiasf;

import com.example.examiasf.config.WebMvcConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@SpringBootApplication
public class ExamIasfApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamIasfApplication.class, args);
	}

	@Autowired
	private WebMvcConfig config;

	@Bean
	public DataSource getDataSource() {
		DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
		dataSourceBuilder.driverClassName(config.databaseDriver);
		dataSourceBuilder.url(config.databaseUrl);
		dataSourceBuilder.driverClassName(config.databaseUsername);
		dataSourceBuilder.password(config.databasePassword);
		return dataSourceBuilder.build();
	}

}
