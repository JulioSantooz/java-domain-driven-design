package aula5.br.com.julio.model;

import aula5.br.com.julio.pillarsPOO.abstracts.Livro;

public class LivroDigital extends Livro {

    private String marcaDAgua;

    static final double MAXIMO_DESCONTO = 0.1;

    public void setMarcaDAgua(String marcaDAgua) {
        this.marcaDAgua = marcaDAgua;
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
        System.out.println("Marca D'Agua: "+this.marcaDAgua);
    }

}
