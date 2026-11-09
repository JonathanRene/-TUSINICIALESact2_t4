package com.jonathanrene.act1_t4.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jonathanrene.act1_t4.dto.ProductoDTO;
import java.util.Arrays;
import java.util.List;

@Controller
public class ProductoController {

    @Value("${proyecto.autor}")
    private String autorProyecto;

    @GetMapping("/productos")
    public String listarProductos(Model model) {
        // Creamos una lista simulada usando DTOs
        List<ProductoDTO> productos = Arrays.asList(
            new ProductoDTO(1L, "Laptop Lenovo", "Tecnología"),
            new ProductoDTO(2L, "Mouse Inalámbrico", "Accesorios"),
            new ProductoDTO(3L, "Teclado Mecánico", "Accesorios")
        );

        // Pasamos los datos a la vista HTML
        model.addAttribute("titulo", "Lista de Productos - MVC");
        model.addAttribute("autor", autorProyecto);
        model.addAttribute("productos", productos);

        return "productos"; // Busca un archivo llamado productos.html en templates
    }
}