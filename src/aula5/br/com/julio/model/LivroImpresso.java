package aula5.br.com.julio.model;

import aula5.br.com.julio.pillarsPOO.abstracts.Livro;

public class LivroImpresso extends Livro {

    static final double taxaEnvio = 0.07;
    static final double MAXIMO_DESCONTO = 0.2;

    public double obterTaxaEnvio() {
        return preco * this.taxaEnvio;
    }

    @Override
    public void aplicarDesconto(double percentual) {
        if(percentual > this.MAXIMO_DESCONTO) {
            System.out.println("Desconto não aplicado - "+getClass().getSimpleName());
        } else {
            System.out.println("Aplicando desconto de: "+this.MAXIMO_DESCONTO+" - "+getClass().getSimpleName());
            this.preco = this.preco - (this.preco * percentual);
        }
    }

    @Override
    protected void exibrDetalhe() {
        System.out.printf("Envio: R$ %.2f",obterTaxaEnvio());
    }

}
