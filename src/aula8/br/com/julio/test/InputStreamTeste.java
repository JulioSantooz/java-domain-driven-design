package aula8.br.com.julio.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamTeste {
    public static void main(String[] args) {

        try(InputStream is = new FileInputStream("./src/aula8/br/com/julio/utils/teste.txt")) {
            int dadoByte;
            while ((dadoByte = is.read()) != -1) {
                System.out.print((char) dadoByte);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
