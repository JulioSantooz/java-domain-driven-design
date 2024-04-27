package aula5.br.com.julio.model;

import aula5.br.com.julio.pillarsPOO.interfaces.Exemplar;

public class Revista implements Exemplar {

    private String titulo;
    private double preco;
    private int paginas;
    private Editora editora;

    @Override
    public double getPreco() {
        return this.preco;
    }
}
