package aula5.br.com.julio.model;

import aula5.br.com.julio.pillarsPOO.enums.TipoCapaEnum;
import aula5.br.com.julio.pillarsPOO.abstracts.Livro;

public class LivroBrinde extends Livro {

    public void setPreco(double preco) {
        super.setPreco(0.0);
    }

    public double getPreco() {return 0;}

    public void setTipoCapa(TipoCapaEnum tipoCapa) {
        super.setTipoCapa(TipoCapaEnum.COMUM);
    }

    @Override
    public void aplicarDesconto(double percentual) {}

    @Override
    protected void exibrDetalhe() {

    }

}
