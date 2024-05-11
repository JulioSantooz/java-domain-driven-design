package aula8.br.com.julio.pillarsPOO.interfaces;

import aula8.br.com.julio.model.CupomPercentual;
import aula8.br.com.julio.utils.LogUtils;

public interface Oferta {

    void aplicarDesconto(Cupom cupom);

    default void aplicarDescontoFimDeAno() {
        LogUtils.info("Aplicação de desconto - Fim de ano");
        aplicarDesconto(new CupomPercentual(0.3));
    }

}
