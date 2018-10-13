package org.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by estifen on 10/12/2018.
 */
@SpringBootApplication
public class OpenWeatherMap extends SpringBootServletInitializer{

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(OpenWeatherMap.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(OpenWeatherMap.class, args);
    }
}
