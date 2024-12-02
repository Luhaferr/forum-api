package br.com.forumhub.forum_api.infra.springdoc;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfiguration {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components()
                        .addSecuritySchemes("bearer-key",
                                new SecurityScheme()
                                        .type(SecurityScheme.Type.HTTP)
                                        .scheme("bearer")
                                        .bearerFormat("JWT")))
                .info(new Info()
                        .title("Forum Hub API")
                        .description("API Rest da aplicação Forum Hub Api, contendo as funcionalidades de CRUD de tópicos em um forum, além de autenticação de usuários com Spring Security e JWT Token")
                        .contact(new Contact()
                                .name("Luiz Ferreira")
                                .email("luhaferr@gmail.com")));
    }
}
