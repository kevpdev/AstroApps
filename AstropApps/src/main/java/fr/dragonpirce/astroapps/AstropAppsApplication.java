package fr.dragonpirce.astroapps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
public class AstropAppsApplication {

	public static void main(String[] args) {
		System.out.println("test debug");
		SpringApplication.run(AstropAppsApplication.class, args);
	}

}

