package app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class App

fun main(){
    println("API Rest Em Kotlin - Inicializada com sucesso...")
    runApplication<App>()
}
