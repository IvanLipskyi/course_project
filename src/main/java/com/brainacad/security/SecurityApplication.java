package com.brainacad.security;

import com.brainacad.security.dao.BicycleRepository;
import com.brainacad.security.entity.Bicycle;
import com.brainacad.security.service.BicycleLibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.math.BigDecimal;

@SpringBootApplication
public class SecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);

	}
}
