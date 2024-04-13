package aula3.br.com.julio.model;

public class LivroDigital extends Livro {

    private String marcaDAgua;

    public void setMarcaDAgua(String marcaDAgua) {
        this.marcaDAgua = marcaDAgua;
    }
    @Override
    public void exibir() {
        super.exibir();
        System.out.println("Marca D'Agua: "+this.marcaDAgua);
    }

}
