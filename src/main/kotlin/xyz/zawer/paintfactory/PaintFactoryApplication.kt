package xyz.zawer.paintfactory

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
class PaintFactoryApplication

fun main(args: Array<String>) {
    runApplication<PaintFactoryApplication>(*args)
}
