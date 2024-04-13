package aula2;

public class Editora {
    String nome, site;

    public Editora(String nome, String site) {
        this.nome = nome;
        this.site = site;
    }

    void exibir() {
        System.out.println("Editora: "+this.nome+" " +
                "("+this.site+")");
    }
}
