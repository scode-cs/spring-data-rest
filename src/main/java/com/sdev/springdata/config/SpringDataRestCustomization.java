package com.sdev.springdata.config;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Component
public class SpringDataRestCustomization implements RepositoryRestConfigurer {

//	@Override
//	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
//		config.getCorsRegistry().addMapping("/api/repository/**")
//			.allowedOrigins("*")
//			.allowedMethods("OPTIONS", "GET", "POST", "PUT", "PATCH", "DELETE");
//	}

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        config.setBasePath("/api/v1");
        cors.addMapping("/api").allowedOrigins("*").allowedMethods("OPTIONS", "GET", "POST", "PUT", "DELETE");
    }
}
