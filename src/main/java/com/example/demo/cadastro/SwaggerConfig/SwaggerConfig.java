package com.example.demo.cadastro.SwaggerConfig;
/**
 *
 * Trecho desativado por não inicializar a aplicação.
 * A configuração foi realizada
 * Dependência utilizadas SpringFox Swagger2 » 3.0.0 e SpringFox-UI » 3.0.0
 *
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.demo.cadastro"))
                .paths(regex("/api.*"))
                .build()
                .apiInfo(metaInfo());
    }

    private ApiInfo metaInfo() {

        ApiInfo apiInfo = new ApiInfo(
                "Cadastro API REST",
                "API REST de cadastro de Usuários/Medico",
                "1.0",
                "Terms of Service",
                new Contact("Felipe Chagas", "https://www.linkedin.com/in/felipe-chagas",
                        "felipechagasferreira@gmail.com"),
                "Apache License Version 2.0",
                "https://www.apache.org/licesen.html", new ArrayList<VendorExtension>()
        );

        return apiInfo;
    }
}
*/
