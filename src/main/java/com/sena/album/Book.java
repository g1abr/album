package com.sena.album;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "books")

public class Book {
@Id

private Integer id ; 
private String titulo ;
private String autor ;
private Integer edicion;

public Book() {
}

public Integer getId() {
    return id;
}

public void setId(Integer id) {
    this.id = id;
}

public String getTitulo() {
    return titulo;
}

public void setTitulo(String titulo) {
    this.titulo = titulo;
}

public String getAutor() {
    return autor;
}

public void setAutor(String autor) {
    this.autor = autor;
}

public Integer getEdicion() {
    return edicion;
}

public void setEdicion(Integer edicion) {
    this.edicion = edicion;
}



    
}
