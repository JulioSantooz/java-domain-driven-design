package aula6.br.com.julio.pillarsPOO.interfaces;

import aula6.br.com.julio.model.CupomFixo;
import aula6.br.com.julio.model.CupomPercentual;

public interface Oferta {

    void aplicarDesconto(Cupom cupom);

    default void aplicarDescontoFimDeAno() {
        aplicarDesconto(new CupomPercentual(0.3));
    }

}
