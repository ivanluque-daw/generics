package org.generics.ejercicio3;

public class Main {
    public static void main(String[] args) {
        Matriz<Integer> matriz = new Matriz<>(5, 5);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz.set(i, j, (int)(Math.random() * 10 + 1));
            }
        }

        System.out.println(matriz);

        System.out.println("Posicion (2,4): " + matriz.get(2, 4));
        System.out.println("Filas: " + matriz.filas());
        System.out.println("Columnas: " + matriz.columnas());
    }
}
