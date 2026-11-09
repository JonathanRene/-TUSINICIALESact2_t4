package com.jonathanrene.act1_t4.dto;

public class ProductoDTO {
    
    private Long id;
    private String nombre;
    private String categoria;

    // 1. Constructor vacío (Obligatorio para el formulario y @ModelAttribute)
    public ProductoDTO() {
    }

    // 2. Constructor con parámetros (Para tu lista de prueba)
    public ProductoDTO(Long id, String nombre, String categoria) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
    }

    // --- GETTERS Y SETTERS ---

    public Long getId() { 
        return id; 
    }
    
    public void setId(Long id) { 
        this.id = id; 
    }

    public String getNombre() { 
        return nombre; 
    }
    
    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    }

    public String getCategoria() { 
        return categoria; 
    }
    
    public void setCategoria(String categoria) { 
        this.categoria = categoria; 
    }
}