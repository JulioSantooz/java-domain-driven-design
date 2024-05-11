package aula8.br.com.julio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GravacaoArquivoTeste {
    public static void main(String[] args) {
        try  {
            Path path = Paths.get("./src/aula8/br/com/julio/utils/teste.txt");
            Files.writeString(path, "Teste de gravação.");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro: "+e.getMessage());
        }
    }
}
