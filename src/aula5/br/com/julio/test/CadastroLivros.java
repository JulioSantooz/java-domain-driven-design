package aula5.br.com.julio.test;

import aula5.br.com.julio.pillarsPOO.enums.TipoCapaEnum;
import aula5.br.com.julio.model.LivroDigital;
import aula5.br.com.julio.model.LivroImpresso;
import aula5.br.com.julio.model.Editora;
import aula5.br.com.julio.model.LivroBrinde;

public class CadastroLivros {
    public static void main(String[] args) {

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
        //favorito.aplicarDesconto(0.4);

        favorito.exibir();

        LivroDigital favoritoDigital = new LivroDigital();
        favoritoDigital.setTitulo("O Hobbit Digital");
        favoritoDigital.setAutor("J. R. R.  Tolkien");
        favoritoDigital.setResumo("etc...");
        favoritoDigital.setPaginas(50);
        favoritoDigital.setTipoCapa(TipoCapaEnum.COMUM);
        favoritoDigital.setPreco(100);
        favoritoDigital.editora = harperCollins;
        favoritoDigital.setMarcaDAgua("julio@gmail.com");
        //favoritoDigital.aplicarDesconto(0.1);

        favoritoDigital.exibir();

        LivroBrinde brinde = new LivroBrinde();
        brinde.setTitulo("O Hobbit - 7 Volume");
        brinde.setAutor("J. R. R.  Tolkien");
        brinde.setResumo("etc...");
        brinde.setPaginas(10);
        brinde.setTipoCapa(TipoCapaEnum.COMUM);
        brinde.setPreco(100);
        brinde.editora = harperCollins;

        brinde.exibir();

        Carrinho carrinho = new Carrinho();
        // Polimorfismo
        carrinho.adicionar(favorito);
        carrinho.adicionar(favoritoDigital);
        carrinho.adicionar(brinde);

        System.out.println("Total: R$ "+carrinho.total());


    }
}
