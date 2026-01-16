package com.margarita.margarita_backend.model;

import com.margarita.margarita_backend.ayudas.Categoria;
import jakarta.persistence.*;
import org.springframework.data.repository.cdi.Eager;

@Entity
@Table(name = "productos")

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", length = 50, nullable = false, unique = false)
    private String nombre;

    @Column(name = "descripcion", length = 100, nullable = false, unique = false)
    private String descripcion;

    @Column(name = "precio", length = 50, nullable = false, unique = false)
    private Double precio;

    @Column(name = "categoria", nullable = false)
    @Enumerated(EnumType.STRING)
    private Categoria categoria;

    @Column(name = "imagen", length = 1000, nullable = false, unique = false)
    private String imagen;

    //constructores
    public Product() {
    }

    public Product(Long id, String nombre, String descripcion, Double precio, Categoria categoria, String imagen) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.categoria = categoria;
        this.imagen = imagen;
    }
    //getters y setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Categoria getCategoria() { return  categoria;}
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getImagen() {
        return imagen;
    }
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
