package com.example.spring.config;

import org.springframework.boot.actuate.autoconfigure.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@Import({
        EndpointAutoConfiguration.class,
        PublicMetricsAutoConfiguration.class,
        HealthIndicatorAutoConfiguration.class,
        ManagementServerPropertiesAutoConfiguration.class,
        EndpointWebMvcAutoConfiguration.class
})
@PropertySource("classpath:application.properties")
public class MyActuatorConfig {}