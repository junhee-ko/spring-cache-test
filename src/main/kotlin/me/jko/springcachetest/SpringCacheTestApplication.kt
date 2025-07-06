package me.jko.springcachetest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching

@SpringBootApplication
@EnableCaching
class SpringCacheTestApplication

fun main(args: Array<String>) {
    runApplication<SpringCacheTestApplication>(*args)
}
