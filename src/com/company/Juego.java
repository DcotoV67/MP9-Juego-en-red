package com.company;

public class Juego {
    void jugar(){
        Partida partida = new Partida();

        boolean continuar = true;

        while (continuar){
            partida.nuevaPartida();
        }
        return;
    }
}
