package aula4.br.com.julio.model;

import aula4.br.com.julio.enums.TipoCapaEnum;

public abstract class Livro {
    protected String titulo, resumo, autor;
    protected double preco;
    private int paginas;
    protected TipoCapaEnum tipoCapa;
    public Editora editora;
    static final double PRECO_CAPA_PERSONALIZADA = 20.0;
    static final double PRECO_CAPA_DURA = 10.0;
    static final double MAXIMO_DESCONTO = 0.2;

    public Livro() {
        this.tipoCapa = TipoCapaEnum.COMUM;
    }

    public Livro(TipoCapaEnum tipoCapa) {
        this.tipoCapa = tipoCapa;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPreco(double preco) {
        this.preco = preco;
        atualizarPrecoComCapa();
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void setTipoCapa(TipoCapaEnum tipoCapa) {
        this.tipoCapa = tipoCapa;
        atualizarPrecoComCapa();
    }

    public double getPreco() {
        return this.preco;
    }

    public void exibir() {
        System.out.println("\n=============== INFO. LIVRO ===============\n"+
                "Autor: "+this.autor+"\n"+
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

    public void aplicarDesconto(double percentual) {
        if(percentual > this.MAXIMO_DESCONTO) {
            System.out.println("\nDesconto não aplicado!");
        } else {
            this.preco = this.preco - (this.preco * percentual);
        }
    }

    void atualizarPrecoComCapa() {
        if (tipoCapa == TipoCapaEnum.PERSONALIZADA)
            this.preco = this.preco + PRECO_CAPA_PERSONALIZADA;
        if (tipoCapa == TipoCapaEnum.DURA)
            this.preco = this.preco + PRECO_CAPA_DURA;
    }

}
