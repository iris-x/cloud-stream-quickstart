package com.example.cloudstreamquickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jms.DefaultJmsListenerContainerFactoryConfigurer;

@SpringBootApplication
public class CloudStreamQuickstartApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudStreamQuickstartApplication.class, args);

	}
}
