package aula8.br.com.julio.model;

import aula8.br.com.julio.pillarsPOO.interfaces.Cupom;

/**
 * Implementação da interface {@link Cupom}, para aplicação de percentual de desconto sobre o exemplar.
 *
 * @author Julio Santos
 * @version 1.0
 */
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
