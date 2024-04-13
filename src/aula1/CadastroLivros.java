package aula1;

public class CadastroLivros {
    public static void main(String[] args) {

        Livro favorito = new Livro();

        favorito.titulo = "O Hobbit";
        favorito.autor = "J. R. R. Tolkien";
        favorito.resumo = "etc...";
        favorito.preco = 59.7;

        favorito.exibir();
    }
}
