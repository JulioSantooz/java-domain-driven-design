package aula6.br.com.julio.test;

import aula6.br.com.julio.pillarsPOO.interfaces.Exemplar;
import aula6.br.com.julio.pillarsPOO.interfaces.Oferta;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private List<Exemplar> exemplares = new ArrayList<>();

    public void adicionar(Exemplar exemplar) {
        if(exemplar instanceof Oferta) {
            ((Oferta)exemplar).aplicarDescontoFimDeAno();
        }
        exemplares.add(exemplar);
    }

    public double total() {
        return exemplares.stream().mapToDouble(Exemplar::getPreco).sum();
    }

}
