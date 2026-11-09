# Actividad 2: Spring Boot - Patrón MVC, Thymeleaf y DTOs

Desarrollado por: **Jonathan René**

---

## 📌 Descripción del Proyecto
Aplicación web desarrollada en **Spring Boot** implementando el patrón arquitectónico **MVC (Modelo-Vista-Controlador)**, transferencia de datos mediante **DTOs** (`ProductoDTO`), renderizado dinámico con **Thymeleaf**, y despliegue en un servidor VPS Ubuntu independiente en el puerto `8083`.

---

## 📸 Evidencias y Capturas de Pantalla (Rúbrica)

### 1. Vista con el Listado (`th:each` funcionando)
Muestra el catálogo de productos renderizado dinámicamente desde el controlador hacia la vista HTML mediante Thymeleaf.


### 2. Formulario con `@ModelAttribute`
Formulario web vinculado a un objeto DTO vacío para el registro de nuevos elementos en la aplicación.


### 3. Resultado del endpoint con `@RequestParam`
Prueba del parámetro de consulta implementado en el controlador (`/buscar?q=...`).


### 4. Resultado del endpoint con `@PathVariable`
Prueba de la variable de ruta dinámica implementada para consultar detalles (`/detalle/{id}`).


### 5. Petición POST probada en Postman / Bruno
Envío exitoso de datos por método POST hacia el endpoint `/guardar` utilizando un cliente HTTP.


---

## 🌐 Enlaces de Despliegue y Pruebas
* **Repositorio en GitHub:** [TUSINICIALESact2_t4](https://github.com/JonathanRene/-TUSINICIALESact2_t4)
* **Proyecto en el VPS (Actividad 2 - Puerto 8083):** `http://157.230.89.112:8083/productos`
* **Confirmación Actividad 1 (Puerto 8080):** Corriendo de forma simultánea y sin conflictos.
