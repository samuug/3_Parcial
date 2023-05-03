package org.example;

public class Ship {
    protected Point puntoInicial ;
    protected int tamano;

    public Ship(Point puntoInicial, int tamano) {
        this.puntoInicial = puntoInicial;
        this.tamano = tamano;
    }

    public Point getPuntoInicial() {
        return puntoInicial;
    }

    public void setPuntoInicial(Point puntoInicial) {
        this.puntoInicial = puntoInicial;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Ship{"+getPuntoInicial()+" - Tamaño: "+getTamano()+'}';
    }
}
