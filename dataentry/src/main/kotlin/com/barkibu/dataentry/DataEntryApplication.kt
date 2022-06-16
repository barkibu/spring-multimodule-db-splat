package com.barkibu.dataentry

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DataEntryApplication

fun main(args: Array<String>) {
    runApplication<DataEntryApplication>(*args)
}
