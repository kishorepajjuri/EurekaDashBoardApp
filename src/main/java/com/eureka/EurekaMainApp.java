package com.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaMainApp extends SpringBootServletInitializer {
 
<<<<<<< HEAD
    protected SpringApplicationBuilder configure(
      SpringApplicationBuilder builder) {
        return builder.sources(EurekaMainApp.class);
    }
 
=======
    @Override
    protected SpringApplicationBuilder configure(
      SpringApplicationBuilder builder) {
        return builder.sources(EurekaMainApp.class);
    {
>>>>>>> 6120dc857e8899592a688f10da1b335eb5c96c0b

	public static void main(String[] args) {
		SpringApplication.run(EurekaMainApp.class, args);
	}

}
