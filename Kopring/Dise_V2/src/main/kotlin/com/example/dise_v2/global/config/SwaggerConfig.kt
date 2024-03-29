package com.example.dise_v2.global.config

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class SwaggerConfig {
    @Bean
    fun openApi(): OpenAPI {
        return OpenAPI()
            .info(
                Info().title("Dise.. API")
                    .description("Dise Api 명세서")
                    .version("v1")
            )
    }
 }