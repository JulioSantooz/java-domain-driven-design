package aula8.br.com.julio.test;

import java.io.*;

public class ReaderTeste {
    public static void main(String[] args) {

        try(Reader reader = new FileReader("./src/aula8/br/com/julio/utils/teste.txt")) {
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
