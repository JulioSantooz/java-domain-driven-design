package aula4.br.com.julio.model;

public class LivroImpresso extends Livro{

    static final double taxaEnvio = 0.07;

    public double obterTaxaEnvio() {
        return preco * this.taxaEnvio;
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.printf("Envio: R$ %.2f",obterTaxaEnvio());
    }

}
