package com.exercise.configs;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Doc {
    @Bean
    public OpenAPI springDoc() {
        return new OpenAPI()
                .info(new Info().title("JPA Exercise")
                        .description("Documents")
                        .version("v1.0"));
    }
}
