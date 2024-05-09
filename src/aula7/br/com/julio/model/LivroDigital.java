package aula7.br.com.julio.model;

import aula7.br.com.julio.pillarsPOO.abstracts.Livro;
import aula7.br.com.julio.pillarsPOO.interfaces.Cupom;
import aula7.br.com.julio.pillarsPOO.interfaces.Oferta;

public class LivroDigital extends Livro implements Oferta {

    private String marcaDAgua;

    private static final double MAXIMO_DESCONTO = 0.1;

    public void setMarcaDAgua(String marcaDAgua) {
        this.marcaDAgua = marcaDAgua;
    }

    @Override
    public void aplicarDesconto(Cupom cupom) {
        this.preco = cupom.aplicar(this.preco);
    }

    @Override
    protected void exibrDetalhe() {
        System.out.println("Marca D'Agua: "+this.marcaDAgua);
    }

}
