package com.zitrus.backendproject.configs;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    public OpenAPI customOpenApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("RestFul Api com Java e Spring Boot")
                        .version("v1")
                        .description("Projeto realizado para a Zitrus HealthTech")
                        .termsOfService("http://swagger.io/terms/")
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")));

    }
}
