package org.example.Ejercicio1;

public class JugadorGuerra {
    //Cree una clase JugadorGuerra, que tenga como atributos de instancia el número de fichas, un dado (una instancia de la clase Dado) y el nombre del jugador. Agregue dentro de esta clase el resto de elementos necesarios. Cree un algoritmo principal usando esta clase.
    private int numeroFichas;
    private Dado dado;
    private String nombreJugador;

    public JugadorGuerra() {
    }

    public JugadorGuerra(int numeroFichas, Dado dado, String nombreJugador) {
        this.numeroFichas = numeroFichas;
        this.dado = dado;
        this.nombreJugador = nombreJugador;
    }

    public int getNumeroFichas() {
        return numeroFichas;
    }

    public void setNumeroFichas(int numeroFichas) {
        this.numeroFichas = numeroFichas;
    }

    public Dado getDado() {
        return dado;
    }

    public void setDado(Dado dado) {
        this.dado = dado;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    @Override
    public String toString() {
        return "JugadorGuerra{" +
                "numeroFichas=" + numeroFichas +
                ", dado=" + dado +
                ", nombreJugador='" + nombreJugador + '\'' +
                '}';
    }
}
