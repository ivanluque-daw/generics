package org.generics.ejercicio1;

import java.util.LinkedList;

public class Pila<T> {
    private LinkedList<T> elementos;

    public Pila() {
        this.elementos = new LinkedList<>();
    }

    public boolean estaVacia() {
        return elementos.isEmpty();
    }

    public T extraer() {
        if (estaVacia()) return null;
        return elementos.removeFirst();
    }

    public T primero() {
        if (estaVacia()) return null;
        return elementos.getFirst();
    }

    public void aniadir(T elemento) {
        elementos.addFirst(elemento);
    }

    @Override
    public String toString() {
        return elementos.toString();
    }
}