package com.jonathanrene.act1_t4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/universidad")
public class UniversidadController {

    @GetMapping("/materias")
    public List<String> obtenerMaterias() {
        return Arrays.asList(
            "Teoría de Autómatas",
            "Diseño de Bases de Datos",
            "Desarrollo de Aplicaciones Web",
            "Redes de Computadoras"
        );
    }
}