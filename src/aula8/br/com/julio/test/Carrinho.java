package aula8.br.com.julio.test;

import aula8.br.com.julio.pillarsPOO.interfaces.Exemplar;
import aula8.br.com.julio.pillarsPOO.interfaces.Oferta;
import aula8.br.com.julio.utils.LogUtils;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private List<Exemplar> exemplares = new ArrayList<>();

    public void adicionar(Exemplar exemplar) {
        if(exemplar instanceof Oferta) {
            ((Oferta)exemplar).aplicarDescontoFimDeAno();
        }
        exemplares.add(exemplar);
        LogUtils.info("Item adicionado no carrinho");
    }

    public double total() {
        return exemplares.stream().mapToDouble(Exemplar::getPreco).sum();
    }

}
