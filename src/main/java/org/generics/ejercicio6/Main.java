package org.generics.ejercicio6;

public class Main {
    public static void main(String[] args) {
        ListaOrdenada<Integer> listaEnteros = new ListaOrdenada<>();

        listaEnteros.add(8);
        listaEnteros.add(4);
        listaEnteros.add(8);
        listaEnteros.add(7);
        listaEnteros.add(1);

        System.out.println(listaEnteros);
    }
}
