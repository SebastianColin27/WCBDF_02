package com.upiiz.ventas.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/clientes")

public class ClienteController {
        //Respuesta para todos los clientes  - GET
        @GetMapping
        public String listarClientes(){
            return "listado de todos los clientes - GET";
        }

        //Respuesta para un cliente por su Id - GET
        @GetMapping("/{id}")
        public String listarCliente(@PathVariable int id){
            return "Obtener clientes por id - GET";
        }

        //Agregar un cliente - POST
        @PostMapping
        public String agregarClientes(@RequestBody String cliente){
            return "Agregar un cliente - POST" + cliente;
        }

        //Actualizar un cliente - PUT
        @PutMapping("{id}")
        public String editarCliente(@PathVariable int id, @RequestBody String cliente){
            return "Editar un cliente por id - PUT"+cliente +"Con id: "+id;
        }


        //Eliminar un cliente - DELETE
        @DeleteMapping("{id}")
        public String eliminarCliente(@PathVariable int id){
            return "Eliminar un cliente - DELETE" + id;
        }

    }
