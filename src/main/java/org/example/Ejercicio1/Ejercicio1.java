package org.example.Ejercicio1;

public class Ejercicio1 {


    public  void Ejercicio1metodo() {
        JugadorGuerra jugador1 = new JugadorGuerra(10, new Dado(6), "Jimena");
        JugadorGuerra jugador2 = new JugadorGuerra(10, new Dado(6), "Lucía");
        int turno = 1;
         do{
            System.out.println("Turno " + turno);
            int dado1 = jugador1.getDado().tirarDado();
            int dado2 = jugador2.getDado().tirarDado();
             jugador1.getDado().setUltimacara(dado1);
             jugador2.getDado().setUltimacara(dado2);
            System.out.println(jugador1.getNombreJugador() + " ha sacado un " + dado1 );
            System.out.println(jugador1.getNombreJugador() + " ha sacado un " + dado2);
            if (jugador1.getDado().getUltimacara() > jugador2.getDado().getUltimacara()) {
                jugador1.setNumeroFichas(jugador1.getNumeroFichas() + 1);
                jugador2.setNumeroFichas(jugador2.getNumeroFichas() - 1);
                System.out.println(jugador1.getNombreJugador() + " gana");
            } else if (jugador1.getDado().getUltimacara() < jugador2.getDado().getUltimacara()) {
                jugador1.setNumeroFichas(jugador1.getNumeroFichas() - 1);
                jugador2.setNumeroFichas(jugador2.getNumeroFichas() + 1);
                System.out.println(jugador2.getNombreJugador() + " gana");
            } else {
                System.out.println("empate");
            }
            System.out.println("Marcador: " + jugador1.getNombreJugador() + " " + jugador1.getNumeroFichas() + " - " + jugador2.getNombreJugador() + " " + jugador2.getNumeroFichas());
            System.out.println();
            turno++;
        }while (jugador1.getNumeroFichas() > 0 && jugador2.getNumeroFichas() > 0);
        if (jugador1.getNumeroFichas() > 0) {
            System.out.println(jugador1.getNombreJugador() + " ha ganado");
        } else {
            System.out.println(jugador2.getNombreJugador() + " ha ganado");
        }
    }


}
