package aula6.br.com.julio.model;

import aula6.br.com.julio.pillarsPOO.abstracts.Livro;
import aula6.br.com.julio.pillarsPOO.interfaces.Cupom;
import aula6.br.com.julio.pillarsPOO.interfaces.Oferta;
import aula6.br.com.julio.utils.AppUtils;

public class LivroImpresso extends Livro implements Oferta {

    private static final double taxaEnvio = 0.07;
    private static final double MAXIMO_DESCONTO = 0.2;

    public double obterTaxaEnvio() {
        return preco * this.taxaEnvio;
    }

    @Override
    public void aplicarDesconto(Cupom cupom) {
        this.preco = cupom.aplicar(this.preco);
    }

    @Override
    protected void exibrDetalhe() {
        System.out.printf("Envio: "+ AppUtils.getValorRS(obterTaxaEnvio()));
    }

}
