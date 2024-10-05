package com.upiiz.ventas.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/productos")
public class ProductosController {

        //Respuesta para todos los productos - GET
        @GetMapping
        public String listarProductos(){
            return "listado de todos los productos - GET";
        }

        //Respuesta para un producto por su Id - GET
        @GetMapping("/{id}")
        public String listarProducto(@PathVariable int id){
            return "Obtener producto por id - GET";
        }

        //Agregar un producto  - POST
        @PostMapping
        public String agregarProducto(@RequestBody String producto){
            return "Agregar un producto - POST" + producto;
        }

        //Actualizar un producto  - PUT
        @PutMapping("{id}")
        public String editarProducto(@PathVariable int id, @RequestBody String producto){
            return "Editar un producto por id - PUT"+producto +"Con id: "+id;
        }


        //Eliminar un producto - DELETE
        @DeleteMapping("{id}")
        public String eliminarProducto(@PathVariable int id){
            return "Eliminar un producto - DELETE" + id;
        }


}
