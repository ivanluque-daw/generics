package org.generics.ejercicio4;

import org.generics.ejercicio3.Matriz;

public class Main {
    public static void main(String[] args) {
        Matriz<Integer> matriz = new Matriz<>(4, 2);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz.set(i, j, i * 2 + j);
            }
        }

        System.out.println(matriz);
        System.out.println("Posicion (1,2): " + matriz.get(1, 2));
    }
}
