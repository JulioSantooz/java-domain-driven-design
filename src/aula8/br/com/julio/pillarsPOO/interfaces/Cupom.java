package aula8.br.com.julio.pillarsPOO.interfaces;

/**
 * Interface para a manipulação de cupons de desconto.
 *
 * @author Julio Santos
 * @version 1.0
 */
public interface Cupom {

    /**
     * Método que aplica descontro sobre o preço informado.
     *
     * @param preco preço do exemplar da livraria
     * @return o preço atualizado com desconto
     */
    double aplicar(double preco);

}
