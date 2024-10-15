package org.generics.ejercicio2;

import java.util.Arrays;

public class PilaArray<T> {
    private T[] elementos;
    private int countElementos;

    public PilaArray() {
        this.elementos = (T[]) new Object[0];
        this.countElementos = 0;
    }

    public boolean estaVacia() {
        return countElementos == 0;
    }

    public T extraer() {
        if (estaVacia()) return null;

        T elemento = elementos[0];
        acortarArray();

        return elemento;
    }

    public T primero() {
        if (estaVacia()) return null;
        return elementos[0];
    }

    public void aniadir(T elemento) {
        extenderArray();

        this.elementos[0] = elemento;
        countElementos += 1;
    }

    private void extenderArray() {
        T[] tempElementos = (T[]) new Object[countElementos + 1];

        for (int i = 1; i < tempElementos.length; i++) {
            tempElementos[i] = elementos[i - 1];
        }

        this.elementos = tempElementos;
    }

    private void acortarArray() {
        T[] tempElementos = (T[]) new Object[countElementos - 1];

        for (int i = 0; i < tempElementos.length; i++) {
            tempElementos[i] = elementos[i + 1];
        }

        this.elementos = tempElementos;
    }

    @Override
    public String toString() {
        return Arrays.toString(elementos);
    }
}
