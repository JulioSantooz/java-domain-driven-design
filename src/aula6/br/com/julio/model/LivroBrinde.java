package aula6.br.com.julio.model;

import aula6.br.com.julio.pillarsPOO.abstracts.Livro;
import aula6.br.com.julio.pillarsPOO.enums.TipoCapaEnum;

public class LivroBrinde extends Livro {

    public void setPreco(double preco) {
        super.setPreco(0.0);
    }

    public double getPreco() {return 0;}

    public void setTipoCapa(TipoCapaEnum tipoCapa) {
        super.setTipoCapa(TipoCapaEnum.COMUM);
    }

    @Override
    protected void exibrDetalhe() {

    }

}
