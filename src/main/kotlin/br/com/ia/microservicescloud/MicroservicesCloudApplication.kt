package br.com.ia.microservicescloud

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
class MicroservicesCloudApplication

fun main(args: Array<String>) {
	runApplication<MicroservicesCloudApplication>(*args)
}

