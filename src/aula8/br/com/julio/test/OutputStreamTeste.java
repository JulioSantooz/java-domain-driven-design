package aula8.br.com.julio.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamTeste {
    public static void main(String[] args) {
        try (OutputStream stream = new FileOutputStream("hello-arquivo.txt")) {
            String texto = "Hello OutputStream";
            byte[] bytes = texto.getBytes();
            stream.write(bytes);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
