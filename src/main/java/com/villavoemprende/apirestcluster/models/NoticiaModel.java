package com.villavoemprende.apirestcluster.models;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;

public class NoticiaModel {
    @Id
    private Long id;
    private String titulo;
    private String vistaPreviaDescripcion;
    private String descripcion;
    private LocalDate fPublicacion;

    public NoticiaModel() {

    }

    public NoticiaModel(Long id, String titulo, String vistaPreviaDescripcion, String descripcion,
            LocalDate fPublicacion) {
        this.id = id;
        this.titulo = titulo;
        this.vistaPreviaDescripcion = vistaPreviaDescripcion;
        this.descripcion = descripcion;
        this.fPublicacion = fPublicacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getVistaPreviaDescripcion() {
        return vistaPreviaDescripcion;
    }

    public void setVistaPreviaDescripcion(String vistaPreviaDescripcion) {
        this.vistaPreviaDescripcion = vistaPreviaDescripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getfPublicacion() {
        return fPublicacion;
    }

    public void setfPublicacion(LocalDate fPublicacion) {
        this.fPublicacion = fPublicacion;
    }

}
