package com.jonathanrene.act1_t4.dto;

public class ProductoDTO {
    private Long id;
    private String nombre;
    private String categoria;

    // Constructor vacío (necesario para Spring)
    public ProductoDTO() {}
    
    // Constructor con parámetros
    public ProductoDTO(Long id, String nombre, String categoria) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
}