package com.jonathanrene.act1_t4.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jonathanrene.act1_t4.dto.ProductoDTO;

@Controller
public class ProductoController {

    // Simulamos una lista en memoria con IDs tipo Long (agregando la "L")
    private List<ProductoDTO> listaProductos = new ArrayList<>(List.of(
            new ProductoDTO(1L, "Laptop Lenovo", "Tecnología"),
            new ProductoDTO(2L, "Mouse Inalámbrico", "Accesorios"),
            new ProductoDTO(3L, "Teclado Mecánico", "Accesorios")
    ));

    // 1. Mostrar la vista principal con la tabla y el formulario vacío
    @GetMapping("/productos")
    public String listarProductos(Model model) {
        model.addAttribute("productos", listaProductos); // Envía la lista a la tabla
        model.addAttribute("producto", new ProductoDTO()); // Envía un DTO vacío para el formulario
        return "productos"; 
    }

    // 2. Endpoint para @ModelAttribute (Recibe el POST del formulario y de Postman)
    @PostMapping("/guardar")
    public String guardarProducto(@ModelAttribute("producto") ProductoDTO producto) {
        System.out.println("Nuevo producto recibido: " + producto.getNombre());
        listaProductos.add(producto); // Agrega el producto a la lista para que aparezca en la vista
        return "redirect:/productos"; // Recarga la página mostrando el nuevo producto
    }

    // 3. Endpoint con @RequestParam (Ejemplo: /buscar?q=Laptop)
    @GetMapping("/buscar")
    @ResponseBody
    public String buscarProducto(@RequestParam(name = "q") String query) {
        return "Endpoint @RequestParam funcionando. Buscando coincidencia para: " + query;
    }

    // 4. Endpoint con @PathVariable (Ajustado a Long para coincidir con el DTO)
    @GetMapping("/detalle/{id}")
    @ResponseBody
    public String verDetalleProducto(@PathVariable("id") Long id) {
        return "Endpoint @PathVariable funcionando. Mostrando detalles del ID: " + id;
    }
}