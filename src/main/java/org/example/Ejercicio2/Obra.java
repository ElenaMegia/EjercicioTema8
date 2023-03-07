package org.example.Ejercicio2;

public abstract class Obra {
    private String titulo;
    private String autor;

    public Obra(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Obra{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}