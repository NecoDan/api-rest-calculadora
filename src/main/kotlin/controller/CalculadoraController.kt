package app.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/calculadora")
class CalculadoraController {

    @GetMapping("/somar")
    fun somar(valorA: Int, valorB: Int): Int {
        return Math.addExact(valorA, valorB)
    }

    @GetMapping("/somaValores")
    fun somarValores(valorA: Int, valorB: Int) = Math.addExact(valorA, valorB)

    @GetMapping("/somar")
    fun subtrair(valorA: Int, valorB: Int): Int {
        return Math.subtractExact(valorA, valorB)
    }

    @GetMapping("/subtraiValores")
    fun subrairValores(valorA: Int, valorB: Int) = Math.subtractExact(valorA, valorB)
}
