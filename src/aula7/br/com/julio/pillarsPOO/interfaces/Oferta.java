package aula7.br.com.julio.pillarsPOO.interfaces;

import aula7.br.com.julio.model.CupomPercentual;

public interface Oferta {

    void aplicarDesconto(Cupom cupom);

    default void aplicarDescontoFimDeAno() {
        aplicarDesconto(new CupomPercentual(0.3));
    }

}
