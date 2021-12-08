package com.villavoemprende.apirestcluster.models;

public class CategoriaModel {
    private String nombreCategoria;

    public CategoriaModel() {
    }


    public CategoriaModel(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }


    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

}
