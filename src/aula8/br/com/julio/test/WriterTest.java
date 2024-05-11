package aula8.br.com.julio.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterTest {
    public static void main(String[] args) {
        try (Writer writer = new BufferedWriter(new FileWriter("hello-arquivo.txt"))) {
            String texto = "Hello BufferedWriter";
            writer.write(texto);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
