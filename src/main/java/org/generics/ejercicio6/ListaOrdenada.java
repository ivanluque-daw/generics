package org.generics.ejercicio6;

import java.util.ArrayList;
import java.util.Collections;

public class ListaOrdenada<E extends Comparable<E>> {
    private ArrayList<E> lista;

    public ListaOrdenada() {
        this.lista = new ArrayList<>();
    }

    public void add(E o) {
        if (isEmpty()) {
            lista.add(o);
        } else {
            int pos = lista.size();

            for (int i = 0; i < lista.size(); i++) {
                if (o.compareTo(lista.get(i)) <= 0) {
                    pos = i;
                    break;
                }
            }

            lista.add(pos, o);
        }
    }

    public E get(int index) {
        if (index < 0 || index >= size()) return null;
        return lista.get(index);
    }

    public int size() {
        return lista.size();
    }

    public boolean isEmpty() {
        return lista.isEmpty();
    }

    public boolean remove(E o) {
        return lista.remove(o);
    }

    public int indexOf(E o) {
        return lista.indexOf(o);
    }

    @Override
    public String toString() {
        return lista.toString();
    }
}
