package com.margarita.margarita_backend.model.mapas;

import com.margarita.margarita_backend.model.Product;
import com.margarita.margarita_backend.model.dtos.ProductoGenericoDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IMapaProducto {

    ProductoGenericoDTO convertirDTO(Product producto);
    List<ProductoGenericoDTO> convertirListaADTO(List<Product> products);

}
