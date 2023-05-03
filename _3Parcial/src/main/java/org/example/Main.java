package org.example;

public class Main {
    public static void menu() {
        Grafo grafo = new Grafo();

        Ship ship1 = new Ship(new Point(1, 1), 5);
        Ship ship2 = new Ship(new Point(2, 2), 1);
        Ship ship3 = new Ship(new Point(3, 3), 3);

        grafo.agregarBarco(ship1);
        grafo.agregarBarco(ship2);
        grafo.agregarBarco(ship3);

        grafo.agregarArista(grafo.buscarVertice(ship1), grafo.buscarVertice(ship2));
        grafo.agregarArista(grafo.buscarVertice(ship2), grafo.buscarVertice(ship3));
        grafo.agregarArista(grafo.buscarVertice(ship3), grafo.buscarVertice(ship1));

        grafo.imprimirGrafos();
    }
    public static void main(String[] args) {
        menu();
    }
}