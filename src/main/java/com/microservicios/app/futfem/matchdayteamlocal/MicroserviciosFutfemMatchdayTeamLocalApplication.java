package com.microservicios.app.futfem.matchdayteamlocal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroserviciosFutfemMatchdayTeamLocalApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviciosFutfemMatchdayTeamLocalApplication.class, args);
	}

}
