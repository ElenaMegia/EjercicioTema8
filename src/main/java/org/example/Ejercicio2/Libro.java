package org.example.Ejercicio2;

public class Libro extends Obra {
    private int numeroPaginas;

    public Libro(String titulo, String autor, int numeroPaginas) {
        super(titulo, autor);
        this.numeroPaginas = numeroPaginas;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + getTitulo() + '\'' +
                ", autor='" + getAutor() + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                '}';
    }
}
