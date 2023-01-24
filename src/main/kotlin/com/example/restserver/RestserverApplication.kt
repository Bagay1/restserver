package com.example.restserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RestserverApplication

fun main(args: Array<String>) {
	runApplication<RestserverApplication>(*args)
}
