package aula7.br.com.julio.test;

import aula7.br.com.julio.exception.FalhaValidacaoException;
import aula7.br.com.julio.model.*;
import aula7.br.com.julio.pillarsPOO.enums.TipoCapaEnum;

public class CadastroLivros {
    public static void main(String[] args) {

        try {
            System.out.println("===========> INÍCIO DA EXECUÇÃO DO REGISTRO DE LIVROS <===========");
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

            Revista revista = new Revista();
            revista.setTitulo("O extraordinário mundo da P.O.O");
            revista.setEditora(harperCollins);
            revista.setPreco(100.00);
            revista.setPaginas(25);

            Livreto livroDeBolsoFavorito = new Livreto();
            livroDeBolsoFavorito.setTitulo("O Hobbit");
            livroDeBolsoFavorito.setAutor("J. R. R.  Tolkien");
            livroDeBolsoFavorito.setResumo("etc...");
            livroDeBolsoFavorito.setPaginas(100);
            livroDeBolsoFavorito.setTipoCapa(TipoCapaEnum.COMUM);
            livroDeBolsoFavorito.setPreco(80);
            livroDeBolsoFavorito.editora = harperCollins;

            Carrinho carrinho = new Carrinho();
            // Polimorfismo
            carrinho.adicionar(favorito);
            carrinho.adicionar(favoritoDigital);
            carrinho.adicionar(brinde);
            carrinho.adicionar(revista);
//        carrinho.adicionar(livroDeBolsoFavorito);

            System.out.println("Total: R$ "+carrinho.total());
        } catch (FalhaValidacaoException e) {
            System.out.println("Verifique os dados: "+e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Verifique os dados: "+e.getMessage());
        } catch(Exception e) {
            System.out.println("Erro inesperado: "+e.getMessage());
        } finally {
            System.out.println("===========> FIM DA EXECUÇÃO DO REGISTRO DE LIVROS <===========");
        }
    }
}
