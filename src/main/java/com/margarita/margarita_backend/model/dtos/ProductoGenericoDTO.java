package com.margarita.margarita_backend.model.dtos;

import com.margarita.margarita_backend.ayudas.Categoria;

public class ProductoGenericoDTO {
    private  String nombre;
    private  String descripcion;
    private Double precio;
    private Categoria categoria;
    private String imagen;

    public ProductoGenericoDTO() {
    }

    public ProductoGenericoDTO(String nombre, String descripcion, Double precio, Categoria categoria, String imagen) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.categoria = categoria;
        this.imagen = imagen;
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

    public Categoria getCategoria() {
        return categoria;
    }
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
