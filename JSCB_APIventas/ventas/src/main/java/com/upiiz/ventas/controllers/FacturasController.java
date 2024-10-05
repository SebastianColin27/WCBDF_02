package com.upiiz.ventas.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/facturas")
public class FacturasController {

    //Respuesta para todos las facturas - GET
    @GetMapping
    public String listarFacturas(){
        return "listado de todos las facturas - GET";
    }

    //Respuesta para una factura por su Id - GET
    @GetMapping("/{id}")
    public String listarFactura(@PathVariable int id){
        return "Obtener factura por id - GET";
    }

    //Agregar una factura  - POST
    @PostMapping
    public String agregarFactura(@RequestBody String factura){
        return "Agregar un factura - POST" + factura;
    }

    //Actualizar una factura  - PUT
    @PutMapping("{id}")
    public String editarFactura(@PathVariable int id, @RequestBody String factura){
        return "Editar una factura por id - PUT"+factura +"Con id: "+id;
    }


    //Eliminar una factura - DELETE
    @DeleteMapping("{id}")
    public String eliminarFactura(@PathVariable int id){
        return "Eliminar una factura - DELETE" + id;
    }

}
