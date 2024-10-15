package org.generics.ejercicio3;

import java.util.Arrays;

public class Matriz<T> {
    private T[][] matriz;
    private int filas;
    private int columnas;

    public Matriz(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.matriz = (T[][]) new Object[filas][columnas];
    }

    public void set(int fila, int columna, T elemento) {
        if (fila >= 0 && fila < filas && columna >= 0 && columna < columnas) {
            matriz[fila][columna] = elemento;
        }
    }

    public T get(int fila, int columna) {
        if (fila >= 0 && fila - 1 < filas && columna >= 0 && columna - 1 < columnas) {
            return matriz[fila - 1][columna - 1];
        }

        return null;
    }

    public int columnas() {
        return columnas;
    }

    public int filas() {
        return filas;
    }

    @Override
    public String toString() {
        return Arrays.deepToString(matriz);
    }
}

