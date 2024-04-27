package aula5.br.com.julio.test;

import aula5.br.com.julio.pillarsPOO.abstracts.Livro;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private List<Livro> livros = new ArrayList<>();

    public void adicionar(Livro livro) {
        livro.aplicarDesconto(0.2);
        livros.add(livro);
    }

    public double total() {
        return livros.stream().mapToDouble(Livro::getPreco).sum();
    }

}
