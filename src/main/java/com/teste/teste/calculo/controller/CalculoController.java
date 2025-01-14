package com.teste.teste.calculo.controller;


import com.teste.teste.calculo.service.CalculoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/calculo")
public class CalculoController {
    private final CalculoService service;

    public CalculoController(CalculoService service) {
        this.service = service;
    }

    @GetMapping("/{number}")
    public Integer getResultCalculo(@PathVariable Integer number) {
        return service.getCalculoByNumber(number);
    }
}
