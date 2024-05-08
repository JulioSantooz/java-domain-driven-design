package aula6.br.com.julio.model;

public class Editora {
    private String nome, site;

    public Editora() {

    }

    public Editora(String nome, String site) {
        this.nome = nome;
        this.site = site;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public void exibir() {
        System.out.println("Editora: "+this.nome+" " +
                "("+this.site+")");
    }
}
