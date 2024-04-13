package aula2;

public class CadastroLivros {
    public static void main(String[] args) {

        Editora harperCollins = new Editora("Harper Collins", "https://harpercollins.com.br");

        Livro favorito = new Livro("O Hobbit", "etc...", "J. R. R. Tolkien", 60.5, 30, TipoCapaEnum.DURA);
        favorito.editora = harperCollins;
        //favorito.aplicarDesconto(0.10);

        favorito.exibir();
    }
}
