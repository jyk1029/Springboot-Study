package com.example.dise_v2

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@ConfigurationPropertiesScan
@SpringBootApplication
class DiseV2Application

fun main(args: Array<String>) {
    runApplication<DiseV2Application>(*args)
}
