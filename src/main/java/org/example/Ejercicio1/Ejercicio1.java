package org.example.Ejercicio1;

public class Ejercicio1 {

    //Ejemplo de ejecución:
    //
    //¿Nombre del jugador?
    //
    //Jimena
    //
    //¿Nombre del jugador?
    //
    //Lucía
    //
    //Jimena ha sacado un 4
    //
    //Lucía ha sacado un 1
    //
    //Jimena gana
    //
    //Marcador: Jimena 11 - Lucía 9
    //
    //Jimena ha sacado un 1
    //
    //Lucía ha sacado un 5
    //
    //Lucía gana
    //
    //Marcador: Jimena 10 - Lucía 10
    //
    //Jimena ha sacado un 5
    //
    //Lucía ha sacado un 2
    //
    //Jimena gana
    //
    //Marcador: Jimena 11 - Lucía 9
    //
    //Jimena ha sacado un 1
    //
    //Lucía ha sacado un 6
    //
    //Lucía gana
    //
    //Marcador: Jimena 10 - Lucía 10
    //
    //Jimena ha sacado un 3
    //
    //Lucía ha sacado un 6
    //
    //Lucía gana
    //
    //Marcador: Jimena 9 - Lucía 11
    //
    //Jimena ha sacado un 5
    //
    //Lucía ha sacado un 6
    //
    //Lucía gana
    //
    //Marcador: Jeanne 8 - Lucía 12
    //
    //Jimena ha sacado un 2
    //
    //Lucía ha sacado un 2
    //
    //empate
    //
    //Marcador: Jimena 8 - Lucía 12
    //
    //Jimena ha sacado un 6
    //
    //Lucía ha sacado un 6
    //
    //empate
    //
    //Marcador: Jimena 8 - Lucía 12
    //
    //Jimena ha sacado un 3
    //
    //Lucía ha sacado un 6
    //
    //Lucía gana
    //
    //Marcador: Jimena 7 - Lucía 13
    //
    //Jimena ha sacado un 1
    //
    //Lucía ha sacado un 5
    //
    //Lucía gana
    //
    //Marcador: Jimena 6 - Lucía 14
    //
    //Jimena ha sacado un 2
    //
    //Lucía ha sacado un 5
    //
    //Lucía gana
    //
    //Marcador: Jimena 5 - Lucía 15
    //
    //Jimena ha sacado un 3
    //
    //Lucía ha sacado un 5
    //
    //Lucía gana
    //
    //Marcador: Jimena 4 - Lucía 16
    //
    //Jimena ha sacado un 2
    //
    //Lucía ha sacado un 3
    //
    //Lucía gana
    //
    //Marcador: Jimena 3 - Lucía 17
    //
    //Lucía ha sacado un 5
    //
    //Lucía gana
    //
    //Marcador: Jimena 2 - Lucía 18
    //
    //Jimena ha sacado un 1
    //
    //Lucía ha sacado un 6
    //
    //Lucía gana
    //
    //Marcador: Jimena 1 - Lucía 19
    //
    //Jimena ha sacado un 1
    //
    //Lucía ha sacado un 2
    //
    //Lucía gana
    //
    //Marcador: Jimena 0 - Lucía 20
    //
    //Lucía ha ganado
    //

    public static void main(String[] args) {
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
