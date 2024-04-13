package aula1;

public class Livro {

    String titulo, resumo, autor;
    double preco;
    int paginas;

    public void exibir() {
        System.out.println("Autor: "+autor+"\n" +
                "Titulo: "+titulo+"\n" +
                "Resumo: "+resumo+"\n" +
                "Preço: "+obterPrecoFormatado()+"\n" +
                "Quantidade de páginas: "+paginas);
    }

    public String obterPrecoFormatado() {
        return String.format("R$ %.2f", preco);
    }
}
