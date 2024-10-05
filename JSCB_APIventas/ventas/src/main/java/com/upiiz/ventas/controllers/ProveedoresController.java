package com.upiiz.ventas.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/proveedores")
public class ProveedoresController {

        //Respuesta para todos los proveedores  - GET
        @GetMapping
        public String listarProveedores(){
            return "listado de todos los proveedores - GET";
        }

        //Respuesta para un proveedor por su Id - GET
        @GetMapping("/{id}")
        public String listarProveedor(@PathVariable int id){
            return "Obtener proveedor por id - GET";
        }

        //Agregar un proveedor - POST
        @PostMapping
        public String agregarProveedor(@RequestBody String proveedor){
            return "Agregar un proveedor - POST" + proveedor;
        }

        //Actualizar un cliente - PUT
        @PutMapping("{id}")
        public String editarProveedor(@PathVariable int id, @RequestBody String proveedor){
            return "Editar un proveedor por id - PUT"+proveedor +"Con id: "+id;
        }


        //Eliminar un cliente - DELETE
        @DeleteMapping("{id}")
        public String eliminarProveedor(@PathVariable int id){
            return "Eliminar un proveedor - DELETE" + id;
        }

    }

