package aula8.br.com.julio.model;

import aula8.br.com.julio.pillarsPOO.interfaces.Cupom;

public class CupomFixo implements Cupom {

    private double valor;

    public CupomFixo(double valor) {
        this.valor = valor;
    }

    @Override
    public double aplicar(double preco) {
        double valorNovo = preco - valor;
        return valorNovo < 0 ? 0 : valorNovo;
    }
}
