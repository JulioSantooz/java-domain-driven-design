package aula3.br.com.julio.test;

import aula3.br.com.julio.enums.TipoCapaEnum;
import aula3.br.com.julio.model.*;

public class CadastroLivros {
    public static void main(String[] args) {

        //Editora harperCollins = new Editora("Harper Collins", "https://harpercollins.com.br");
        Editora harperCollins = new Editora();
        harperCollins.setNome("Harper Collins");
        harperCollins.setSite("https://harpercollins.com.br");

        Livro favorito = new Livro();
        favorito.setTitulo("O Hobbit");
        favorito.setAutor("J. R. R.  Tolkien");
        favorito.setResumo("etc...");
        favorito.setPaginas(50);
        favorito.setTipoCapa(TipoCapaEnum.PERSONALIZADA);
        favorito.setPreco(60.45);
        favorito.editora = harperCollins;
        //favorito.aplicarDesconto(0.10);

        favorito.exibir();

        LivroDigital favoritoDigital = new LivroDigital();
        favoritoDigital.setTitulo("O Hobbit");
        favoritoDigital.setAutor("J. R. R.  Tolkien");
        favoritoDigital.setResumo("etc...");
        favoritoDigital.setPaginas(50);
        favoritoDigital.setTipoCapa(TipoCapaEnum.PERSONALIZADA);
        favoritoDigital.setPreco(60.45);
        favoritoDigital.editora = harperCollins;
        favoritoDigital.setMarcaDAgua("julio@gmail.com");
        //favoritoDigital.aplicarDesconto(0.10);

        favoritoDigital.exibir();
    }
}
