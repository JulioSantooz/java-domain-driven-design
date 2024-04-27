package aula4.br.com.julio.model;

public class LivroDigital extends Livro {

    private String marcaDAgua;

    static final double MAXIMO_DESCONTO = 0.1;

    public void setMarcaDAgua(String marcaDAgua) {
        this.marcaDAgua = marcaDAgua;
    }

    @Override
    public void aplicarDesconto(double percentual) {
        if(percentual > this.MAXIMO_DESCONTO) {
            System.out.println("\nDesconto não aplicado!");
        } else {
            this.preco = this.preco - (this.preco * percentual);
        }
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("Marca D'Agua: "+this.marcaDAgua);
    }

}
