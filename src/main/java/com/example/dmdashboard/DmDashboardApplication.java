package com.example.dmdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class DmDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(DmDashboardApplication.class, args);
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/rolls").allowedOrigins("http://localhost:3000");
                registry.addMapping("/rolls/history").allowedOrigins("http://localhost:3000");
                registry.addMapping("/calculations").allowedOrigins("http://localhost:3000");
                registry.addMapping("/calculations/history").allowedOrigins("http://localhost:3000");
                registry.addMapping("/clips").allowedOrigins("http://localhost:3000");
            }
        };
    }

}
