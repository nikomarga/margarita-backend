package com.margarita.margarita_backend.model.mapas;

import com.margarita.margarita_backend.model.Product;
import com.margarita.margarita_backend.model.dtos.ProductoGenericoDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-26T14:15:03-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 25 (Oracle Corporation)"
)
@Component
public class IMapaProductoImpl implements IMapaProducto {

    @Override
    public ProductoGenericoDTO convertirDTO(Product producto) {
        if ( producto == null ) {
            return null;
        }

        ProductoGenericoDTO productoGenericoDTO = new ProductoGenericoDTO();

        productoGenericoDTO.setNombre( producto.getNombre() );
        productoGenericoDTO.setDescripcion( producto.getDescripcion() );
        productoGenericoDTO.setPrecio( producto.getPrecio() );
        productoGenericoDTO.setCategoria( producto.getCategoria() );
        productoGenericoDTO.setImagen( producto.getImagen() );

        return productoGenericoDTO;
    }

    @Override
    public List<ProductoGenericoDTO> convertirListaADTO(List<Product> products) {
        if ( products == null ) {
            return null;
        }

        List<ProductoGenericoDTO> list = new ArrayList<ProductoGenericoDTO>( products.size() );
        for ( Product product : products ) {
            list.add( convertirDTO( product ) );
        }

        return list;
    }
}
