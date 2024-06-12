package com.devtopia.community

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.context.ApplicationListener

@SpringBootApplication
class BootstrapApplication: ApplicationListener<ApplicationReadyEvent> {
    private val environments = arrayOf("local", "prod")

    override fun onApplicationEvent(event: ApplicationReadyEvent) {
        if (!ensureValidEnvironment(event.applicationContext.environment.activeProfiles)) {
            throw IllegalStateException("환경 변수가 올바르지 않습니다. ${environments.joinToString(", ")} 중 하나를 선택해주세요. 현재 env: ${event.applicationContext.environment.activeProfiles.joinToString(", ")}")
        }
    }

    private fun ensureValidEnvironment(activeProfiles: Array<String>): Boolean {
        return activeProfiles.any { it in environments }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            SpringApplication.run(BootstrapApplication::class.java, *args)
        }
    }
}
