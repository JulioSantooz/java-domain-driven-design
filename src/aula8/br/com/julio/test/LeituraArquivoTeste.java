package aula8.br.com.julio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class LeituraArquivoTeste {
    public static void main(String[] args) {

        Path path = Paths.get("./src/aula7/br/com/julio/utils/teste.txt");
        try (Stream<String> leitor = Files.lines(path)){
            leitor.forEach(linhaAtual -> System.out.println(linhaAtual));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
