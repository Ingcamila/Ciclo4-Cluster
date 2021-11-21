package com.villavoemprende.apirestcluster.models;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;

public class ClienteModel {

    @Id
    private Long id;
    private String nombreRepresentante;
    private String tipoDoc;
    private String doc;
    private String tipoEmpresa;
    private String nit;
    private String email;
    private String razonSocial;
    private String telefono;
    private String categoria;
    private String target;
    private String sector;
    private String direccion;
    private String departamento;
    private String municipio;
    private LocalDate fRegistro;

    public ClienteModel() {
    }

    public ClienteModel(Long id, String nombreRepresentante, String tipoDoc, String doc, String tipoEmpresa, String nit,
            String email, String razonSocial, String telefono, String categoria, String target, String sector,
            String direccion, String departamento, String municipio, LocalDate fRegistro) {
        this.id = id;
        this.nombreRepresentante = nombreRepresentante;
        this.tipoDoc = tipoDoc;
        this.doc = doc;
        this.tipoEmpresa = tipoEmpresa;
        this.nit = nit;
        this.email = email;
        this.razonSocial = razonSocial;
        this.telefono = telefono;
        this.categoria = categoria;
        this.target = target;
        this.sector = sector;
        this.direccion = direccion;
        this.departamento = departamento;
        this.municipio = municipio;
        this.fRegistro = fRegistro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreRepresentante() {
        return nombreRepresentante;
    }

    public void setNombreRepresentante(String nombreRepresentante) {
        this.nombreRepresentante = nombreRepresentante;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public String getTipoEmpresa() {
        return tipoEmpresa;
    }

    public void setTipoEmpresa(String tipoEmpresa) {
        this.tipoEmpresa = tipoEmpresa;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public LocalDate getfRegistro() {
        return fRegistro;
    }

    public void setfRegistro(LocalDate fRegistro) {
        this.fRegistro = fRegistro;
    }
  
    
}
