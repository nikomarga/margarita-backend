package com.margarita.margarita_backend.repository;


import com.margarita.margarita_backend.ayudas.Categoria;
import com.margarita.margarita_backend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository  extends JpaRepository <Product, Long>{
    List<Product> findByCategoria(Categoria categoria);
}
