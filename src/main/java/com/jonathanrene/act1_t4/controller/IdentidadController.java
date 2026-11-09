package com.jonathanrene.act1_t4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/identidad")
public class IdentidadController {

    @GetMapping("/autor")
    public String obtenerAutor() {
        return "Proyecto de: Jonathan René (JRact1_t4) - Actividad 1";
    }

    @GetMapping("/estado")
    public String obtenerEstado() {
        return "El servidor Spring Boot está corriendo correctamente. Código de estado: 200 OK.";
    }
}