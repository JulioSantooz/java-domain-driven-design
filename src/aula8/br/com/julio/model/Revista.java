package aula8.br.com.julio.model;

import aula8.br.com.julio.pillarsPOO.interfaces.Cupom;
import aula8.br.com.julio.pillarsPOO.interfaces.Exemplar;
import aula8.br.com.julio.pillarsPOO.interfaces.Oferta;

public class Revista implements Exemplar, Oferta {

    private String titulo;
    private double preco;
    private int paginas;
    private Editora editora;
    private static final double MAXIMO_DESCONTO = 0.05;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    @Override
    public double getPreco() {
        return this.preco;
    }

    @Override
    public void aplicarDesconto(Cupom cupom) {
        this.preco = cupom.aplicar(this.preco);
    }
}
