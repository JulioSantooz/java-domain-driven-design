package aula4.br.com.julio.test;

import aula4.br.com.julio.enums.TipoCapaEnum;
import aula4.br.com.julio.model.*;

import java.util.ArrayList;
import java.util.List;

public class CadastroLivros {
    public static void main(String[] args) {

        List<LivroImpresso> carrinhoLivroImpresso = new ArrayList<>();
        List<LivroDigital> carrinhoLivroDigital = new ArrayList<>();

        //Editora harperCollins = new Editora("Harper Collins", "https://harpercollins.com.br");
        Editora harperCollins = new Editora();
        harperCollins.setNome("Harper Collins");
        harperCollins.setSite("https://harpercollins.com.br");

        LivroImpresso favorito = new LivroImpresso();
        favorito.setTitulo("O Hobbit");
        favorito.setAutor("J. R. R.  Tolkien");
        favorito.setResumo("etc...");
        favorito.setPaginas(50);
        favorito.setTipoCapa(TipoCapaEnum.COMUM);
        favorito.setPreco(100);
        favorito.editora = harperCollins;
        //favorito.aplicarDesconto(0.2);

        favorito.exibir();

        LivroDigital favoritoDigital = new LivroDigital();
        favoritoDigital.setTitulo("O Hobbit");
        favoritoDigital.setAutor("J. R. R.  Tolkien");
        favoritoDigital.setResumo("etc...");
        favoritoDigital.setPaginas(50);
        favoritoDigital.setTipoCapa(TipoCapaEnum.COMUM);
        favoritoDigital.setPreco(100);
        favoritoDigital.editora = harperCollins;
        favoritoDigital.setMarcaDAgua("aula4.br.com.julio@gmail.com");
        //favoritoDigital.aplicarDesconto(0.20);

        favoritoDigital.exibir();

        LivroBrinde favoritoDemo = new LivroBrinde();
        favoritoDemo.setTitulo("O Hobbit - Demo");
        favoritoDemo.setAutor("J. R. R.  Tolkien");
        favoritoDemo.setResumo("Esta é uma demo do livro");
        favoritoDemo.setPaginas(10);
        favoritoDemo.setTipoCapa(TipoCapaEnum.COMUM);
        favoritoDemo.setPreco(100);
        favoritoDemo.editora = harperCollins;

        favoritoDemo.exibir();

        Carrinho carrinho = new Carrinho();
        // Polimorfismo
        carrinho.adicionar(favorito);
        carrinho.adicionar(favoritoDigital);
        carrinho.adicionar(favoritoDemo);

        System.out.println("Total: R$ "+carrinho.total());


    }
}
