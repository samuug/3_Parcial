package org.example;

public class Vertex {
    protected Ship dato;

    public Vertex(Ship dato) {
        this.dato = dato;
    }

    public Ship getDato() {
        return dato;
    }

    @Override
    public String toString() {
        return "Vertex{"+getDato()+'}';
    }
}
