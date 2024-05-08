package aula6.br.com.julio.model;

import aula6.br.com.julio.pillarsPOO.interfaces.Cupom;

public class CupomPercentual implements Cupom {

    private double percentual;

    public CupomPercentual(double percentual) {
        this.percentual = percentual > 1 ? 1 : percentual;
    }

    @Override
    public double aplicar(double preco) {
        return preco - (preco * this.percentual);
    }
}
