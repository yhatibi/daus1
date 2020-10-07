package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        //Genera un numero aleatorio entre el 1 y el 6.
        Random ran = new Random();
        int x = ran.nextInt(7 - 1) + 1;

        //Imprimir el dado seleccionado
        System.out.println("Dado: " + x);
    }
}
