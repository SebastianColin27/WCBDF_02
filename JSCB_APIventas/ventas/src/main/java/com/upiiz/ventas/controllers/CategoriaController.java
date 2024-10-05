package com.upiiz.ventas.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/api/v1/categorias")
public class CategoriaController {
    //Respuesta para todas las categorias  - GET
    @GetMapping
    public String listarCategorias(){
        return "listado de todas las categorias - GET";
    }

    //Respuesta para una categoría por su Id - GET
    @GetMapping("/{id}")
    public String listarCotegoria(@PathVariable int id){
        return "Obtener categoría por id - GET";
    }

    //Agregar una categoría - POST
    @PostMapping
    public String agregarCategoria(@RequestBody String categoria){
        return "Agregar una categoria - POST" + categoria;
    }

    //Actualizar una categoría - PUT
    @PutMapping("{id}")
    public String editarCategoria(@PathVariable int id, @RequestBody String categoria){
        return "Editar una categoria por id - PUT"+categoria +"Con id: "+id;
    }


    //Eliminar una categoría - DELETE
    @DeleteMapping("{id}")
    public String eliminarCategoria(@PathVariable int id){
        return "Eliminar una categoria - DELETE" + id;
    }

}
