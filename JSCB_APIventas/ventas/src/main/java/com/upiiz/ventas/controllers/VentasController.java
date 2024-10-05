package com.upiiz.ventas.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/ventas")
public class VentasController {

    //Respuesta para todos las ventas - GET
    @GetMapping
    public String listarVentas(){
        return "listado de todos las ventas - GET";
    }

    //Respuesta para una venta por su Id - GET
    @GetMapping("/{id}")
    public String listarVentas(@PathVariable int id){
        return "Obtener ventas por id - GET";
    }

    //Agregar una venta  - POST
    @PostMapping
    public String agregarVenta(@RequestBody String venta){
        return "Agregar una venta - POST" + venta;
    }

    //Actualizar una venta  - PUT
    @PutMapping("{id}")
    public String editarVenta(@PathVariable int id, @RequestBody String venta){
        return "Editar una venta por id - PUT"+ venta +"Con id: "+id;
    }


    //Eliminar una venta- DELETE
    @DeleteMapping("{id}")
    public String eliminarVenta(@PathVariable int id){
        return "Eliminar una venta - DELETE" + id;
    }

}
