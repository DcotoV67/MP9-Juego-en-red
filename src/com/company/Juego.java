package com.company;

import java.util.Scanner;

public class Juego {
    void jugar(){
        Partida partida = new Partida();

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        int opcion = 0;

        while (continuar){
            System.out.println("------------------");
            System.out.println("1. Nueva partida");
            System.out.println("0. Salir del juego");
            System.out.println("------------------");

            opcion = scanner.nextInt();

            if (opcion == 1){
                partida.nuevaPartida();
            }else if (opcion == 0){
                continuar = false;
            }
        }
        return;
    }
}
