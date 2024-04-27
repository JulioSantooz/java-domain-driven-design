package aula4.br.com.julio.model;

import aula4.br.com.julio.enums.TipoCapaEnum;

public class LivroBrinde extends Livro {

    public void setPreco(double preco) {}

    public double getPreco() {return 0;}

    public void setTipoCapa(TipoCapaEnum tipoCapa) {
        this.tipoCapa = TipoCapaEnum.COMUM;
    }

}
