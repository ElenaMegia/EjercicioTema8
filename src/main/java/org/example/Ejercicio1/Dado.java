package org.example.Ejercicio1;

public class Dado {
    private int numeroCaras;
    private int ultimacara;

    public Dado() {
    }

    public Dado(int numeroCaras, int ultimacara) {
        this.numeroCaras = numeroCaras;
        this.ultimacara = ultimacara;
    }

    public Dado(int numeroCaras) {
        this.numeroCaras = numeroCaras;
    }

    public int getNumeroCaras() {
        return numeroCaras;
    }

    public void setNumeroCaras(int numeroCaras) {
        this.numeroCaras = numeroCaras;
    }

    public int getUltimacara() {
        return ultimacara;
    }

    public void setUltimacara(int ultimacara) {
        this.ultimacara = ultimacara;
    }

    public int tirarDado() {
        int numero = (int) (Math.random() * numeroCaras + 1);
        return numero;
    }
}