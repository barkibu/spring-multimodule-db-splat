package com.barkibu.api

import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class Runner(/*val repository: UserRepository*/) : CommandLineRunner {
    companion object {
        private val logger = LoggerFactory.getLogger(Runner::class.java)
    }

    override fun run(vararg args: String) {
//        repository.findAll().forEach { user -> logger.info("{}", user) }
    }
}