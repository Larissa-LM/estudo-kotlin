package br.com.alura.forum

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hello") // url
class HelloController {
    @GetMapping
    fun hello(): String {
        return "Hello World!Alterado"
    }
}
