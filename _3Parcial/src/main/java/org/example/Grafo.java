package org.example;

import java.util.ArrayList;
import java.util.List;

public class Grafo {
    protected List<Vertex> vertices;
    protected List<Arista> aristas;

    public Grafo() {
        this.vertices = new ArrayList<>();
        this.aristas = new ArrayList<>();
    }

    public void agregarBarco(Ship barco) {
        Vertex vertice = new Vertex(barco);
        vertices.add(vertice);
    }

    public void agregarArista(Vertex vertice1, Vertex vertice2) {
        Arista arista = new Arista(vertice1, vertice2);
        aristas.add(arista);
    }

    public Vertex buscarVertice(Ship barco) {
        for (Vertex vertice : vertices){
        if (vertice.getDato().equals(barco)) {
            return vertice;
        }
    }
    return null;
    }

    public void imprimirGrafos() {
        System.out.println("Vertices: ");
        for (Vertex vertice : vertices) {
            System.out.println(vertice.toString());
        }
        System.out.println();
        System.out.println("Aristas: ");
        for (Arista arista : aristas) {
            System.out.println(arista.toString());
        }
    }
}