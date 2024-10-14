package org.generics.ejercicio1;

public class Main {
    public static void main(String[] args) {
        Pila<Integer> pila = new Pila<>();

        System.out.println("Esta vacia: " + pila.estaVacia());

        pila.aniadir(5);
        pila.aniadir(4);
        pila.aniadir(3);
        pila.aniadir(2);
        pila.aniadir(1);

        System.out.println("Esta vacia: " + pila.estaVacia());
        System.out.println("Primero (extraido): " + pila.extraer());
        System.out.println("Primero: " + pila.primero());
        System.out.println(pila);
    }
}