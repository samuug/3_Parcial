package org.example;

public class Arista {
    protected Vertex origen;
    protected Vertex destino;
    protected int peso;

    public Arista(Vertex origen, Vertex destino) {
        this.origen = origen;
        this.destino = destino;
        this.peso = origen.getDato().getTamano() + destino.getDato().getTamano();
    }

    public Vertex getOrigen() {
        return origen;
    }

    public void setOrigen(Vertex origen) {
        this.origen = origen;
    }

    public Vertex getDestino() {
        return destino;
    }

    public void setDestino(Vertex destino) {
        this.destino = destino;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Arista{Origen: "+ getOrigen().getDato() + " - Destino: " + getDestino().getDato() + " - Peso: " + getPeso() + '}';
    }
}
