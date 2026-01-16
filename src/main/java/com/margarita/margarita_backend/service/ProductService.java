package com.margarita.margarita_backend.service;

import com.margarita.margarita_backend.ayudas.Categoria;
import com.margarita.margarita_backend.model.Product;
import com.margarita.margarita_backend.model.dtos.ProductoGenericoDTO;
import com.margarita.margarita_backend.model.mapas.IMapaProducto;
import com.margarita.margarita_backend.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repositorio;

    @Autowired
    private IMapaProducto mapa;

    public ProductoGenericoDTO guardarProducto(Product producto) throws Exception {
        if (producto.getCategoria() == null) {
            throw new Exception("Categoría inválida");
        }
        return mapa.convertirDTO(repositorio.save(producto));
    }

    public List<ProductoGenericoDTO> buscarTodos() {
        return mapa.convertirListaADTO(repositorio.findAll());
    }

    public List<ProductoGenericoDTO> buscarPorCategoria(String categoriaStr) throws Exception {
        Categoria categoriaEnum;
        try {
            categoriaEnum = Categoria.valueOf(categoriaStr.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new Exception("Categoría inválida: " + categoriaStr);
        }
        return mapa.convertirListaADTO(repositorio.findByCategoria(categoriaEnum));
    }
}
