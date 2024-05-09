package aula7.br.com.julio.pillarsPOO.abstracts;

import aula7.br.com.julio.exception.FalhaValidacaoException;
import aula7.br.com.julio.model.Editora;
import aula7.br.com.julio.utils.AppUtils;
import aula7.br.com.julio.pillarsPOO.enums.TipoCapaEnum;
import aula7.br.com.julio.pillarsPOO.interfaces.Exemplar;

import java.util.Objects;

public abstract class Livro implements Exemplar {
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

    public void setPreco(double preco) throws FalhaValidacaoException {
        if(preco < 0) {
            throw new FalhaValidacaoException("Preço não pode ser menor que zero.", preco);
        }

        this.preco = preco;
        atualizarPrecoComCapa();
    }

    public void setPaginas(int paginas) throws FalhaValidacaoException {
        if(paginas <= 0) {
            throw new FalhaValidacaoException("O número de páginas informado foi ''{0}'', não pode ser menor ou igual a zero. Ex: {1}", paginas, 10);
        }
        this.paginas = paginas;
    }

    public void setTipoCapa(TipoCapaEnum tipoCapa) {
        this.tipoCapa = tipoCapa;
        atualizarPrecoComCapa();
    }

    public double getPreco() {
        return this.preco;
    }

    public String getTipo() {
        return getClass().getSimpleName();
    }

    /**
     * Exibi os dados de um livro, conforme o formato a seguir:
     * <ul>
     *     <li>Titulo</li>
     *     <li>Autor</li>
     *     <li>Tipo</li>
     *     <li>Resumo</li>
     *     <li>Páginas</li>
     *     <li>Capa</li>
     *     <li>Preço</li>
     *     <li>Detalhes {@link #exibrDetalhe()}</li>
     * </ul>
     */
    public void exibir() {
        System.out.println("\n=============== INFO. LIVRO ===============\n"+
                "Titulo: "+this.titulo+"\n"+
                "Autor: "+this.autor+"\n"+
                "Tipo: "+getTipo()+"\n"+
                "Resumo: "+AppUtils.abreviaTexto(this.resumo, 80)+"\n"+
                "Páginas: "+this.paginas+"\n"+
                "Capa: "+this.tipoCapa+"\n"+
                "Preço: "+AppUtils.getValorRS(this.preco));

        if(Objects.isNull(editora)) {
            throw new RuntimeException("Editora não pode ser nula!");
        }

        exibrDetalhe();

        System.out.println("\n---------------------------------------");
    }

    /**
     * Exibição detalhada das info. de cada livro
     */
    protected abstract void exibrDetalhe();

    void atualizarPrecoComCapa() {
        if (tipoCapa == TipoCapaEnum.PERSONALIZADA)
            this.preco = this.preco + PRECO_CAPA_PERSONALIZADA;
        if (tipoCapa == TipoCapaEnum.DURA)
            this.preco = this.preco + PRECO_CAPA_DURA;
    }

}
