package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // Indica que esta clase es una tabla de base de datos
@Table(name = "books") // Opcional: define el nombre de la tabla en MySQL
public class Book {

    @Id // Marca este campo como la llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // El ID será autoincremental en MySQL
    private Long id;

    private String title;
    private String author;

    // 1. CONSTRUCTOR VACÍO (Obligatorio para JPA)
    public Book() {
    }

    // 2. CONSTRUCTOR CON PARÁMETROS
    public Book(Long id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    // 3. GETTERS Y SETTERS
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
}