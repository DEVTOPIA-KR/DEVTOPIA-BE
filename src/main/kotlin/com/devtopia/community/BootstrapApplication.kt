package com.devtopia.community

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class BootstrapApplication{
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            SpringApplication.run(BootstrapApplication::class.java, *args)
        }
    }
}
