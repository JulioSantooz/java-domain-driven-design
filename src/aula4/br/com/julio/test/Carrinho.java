package aula4.br.com.julio.test;

import aula4.br.com.julio.model.Livro;

import java.util.ArrayList;
import java.util.List;

public class Carrinho extends Livro {

    private List<Livro> livros = new ArrayList<>();

    public void adicionar(Livro livro) {
        livro.aplicarDesconto(0.15);
        livros.add(livro);
    }

    public double total() {
        return livros.stream().mapToDouble(Livro::getPreco).sum();
    }

}
