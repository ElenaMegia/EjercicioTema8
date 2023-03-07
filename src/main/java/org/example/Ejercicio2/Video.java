package org.example.Ejercicio2;
public class Video extends Obra {
    private int duracion;

    public Video(String titulo, String autor, int duracion) {
        super(titulo, autor);
        this.duracion = duracion;
    }

    public int getDuracion() {
        return duracion;
    }

    @Override
    public String toString() {
        return "Video{" +
                "titulo='" + getTitulo() + '\'' +
                ", autor='" + getAutor() + '\'' +
                ", duracion=" + duracion +
                '}';
    }
}
