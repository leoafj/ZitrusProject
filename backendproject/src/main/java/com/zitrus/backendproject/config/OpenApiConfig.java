package com.zitrus.backendproject.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    public OpenAPI customOpenApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("Api com Java e Spring Boot")
                        .version("v1")
                        .description("Projeto de Api para Zitrus HealthTech")
                        .termsOfService("http://swagger.io/terms/")
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")));
    }
}
