package com.app.electronicsStore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.r2dbc.connection.init.CompositeDatabasePopulator;
import org.springframework.r2dbc.connection.init.ConnectionFactoryInitializer;
import org.springframework.r2dbc.connection.init.ResourceDatabasePopulator;

import io.r2dbc.spi.ConnectionFactory;

@SpringBootApplication
public class ElectronicsStoreApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(ElectronicsStoreApplication.class, args);
	}

	@Bean
	ConnectionFactoryInitializer initializer(ConnectionFactory connectionFactory){
		ConnectionFactoryInitializer initializer= new ConnectionFactoryInitializer();
		initializer.setConnectionFactory(connectionFactory);

		CompositeDatabasePopulator composite= new CompositeDatabasePopulator();
		composite.addPopulators(new ResourceDatabasePopulator(new ClassPathResource("schema.sql")));
		composite.addPopulators(new ResourceDatabasePopulator(new ClassPathResource("data.sql") ));
		initializer.setDatabasePopulator(composite);
		return initializer;
		
	}

}
