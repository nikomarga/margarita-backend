package com.margarita.margarita_backend.controller;

import com.margarita.margarita_backend.model.Product;
import com.margarita.margarita_backend.model.dtos.ProductoGenericoDTO;
import com.margarita.margarita_backend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/productos")

public class ProductController {
    @Autowired
    private ProductService service;

    @PostMapping
    public ResponseEntity<?> guardar(@RequestBody Product producto) {
        try {
            return ResponseEntity.ok(service.guardarProducto(producto));
        } catch (IllegalArgumentException e) {
            return ResponseEntity
                    .badRequest()
                    .body("Categoría inválida. Verifique los valores permitidos.");
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error al guardar el producto.");
        }
    }

    @GetMapping
    public ResponseEntity<List<ProductoGenericoDTO>> listar() {
        return ResponseEntity.ok(service.buscarTodos());
    }

    @GetMapping("/categoria/{categoria}")
    public ResponseEntity<?> buscarPorCategoria(@PathVariable String categoria) throws Exception {
        return ResponseEntity.ok(service.buscarPorCategoria(categoria));
    }

}
