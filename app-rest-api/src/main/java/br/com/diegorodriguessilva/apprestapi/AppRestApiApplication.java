package br.com.diegorodriguessilva.apprestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = { "br.com.diegorodriguessilva.appdata.entities" })
@EntityScan(basePackages = {"br.com.diegorodriguessilva.appdata.entities"})
public class AppRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppRestApiApplication.class, args);
	}

}
