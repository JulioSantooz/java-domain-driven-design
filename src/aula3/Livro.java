package aula3;

import aula2.Editora;
import aula2.TipoCapaEnum;

public class Livro {
    String titulo, resumo, autor;
    private double preco;
    int paginas;
    private TipoCapaEnum tipoCapa;
    Editora editora;

    static final double PRECO_CAPA_PERSONALIZADA = 20.0;
    static final double PRECO_CAPA_DURA = 10.0;

    public Livro() {
        this.tipoCapa = TipoCapaEnum.COMUM;
    }

    public Livro(String titulo, String resumo, String autor, double preco, int paginas) {
        this.titulo = titulo;
        this.resumo = resumo;
        this.autor = autor;
        this.preco = preco;
        this.paginas = paginas;
        this.tipoCapa = TipoCapaEnum.COMUM;
    }

    public Livro(String titulo, String resumo, String autor, double preco, int paginas, TipoCapaEnum tipoCapa) {
        this.titulo = titulo;
        this.resumo = resumo;
        this.autor = autor;
        this.preco = preco;
        this.paginas = paginas;
        this.tipoCapa = tipoCapa;

        atualizarPrecoComCapa();
    }

    public Livro(TipoCapaEnum tipoCapa) {
        this.tipoCapa = tipoCapa;
    }

    public void exibir() {
        System.out.println("Autor: "+this.autor+"\n"+
                "Titulo: "+this.titulo+"\n"+
                "Resumo: "+this.resumo+"\n"+
                "Preço: "+obterPrecoFormatado()+"\n"+
                "Quantidade de páginas: "+this.paginas+"\n"+
                "Capa: "+this.tipoCapa);

        if (editora != null)
            editora.exibir();
    }

    public String obterPrecoFormatado() {
        return String.format("R$ %.2f", this.preco);
    }

    void aplicarDesconto(double percentual) {
        this.preco = this.preco - (this.preco * percentual);
    }

    void atualizarPrecoComCapa() {
        if (tipoCapa == TipoCapaEnum.PERSONALIZADA)
            this.preco = this.preco + PRECO_CAPA_PERSONALIZADA;
        if (tipoCapa == TipoCapaEnum.DURA)
            this.preco = this.preco + PRECO_CAPA_DURA;
    }

}
