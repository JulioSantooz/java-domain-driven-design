package aula8.br.com.julio.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class AppUtils {

    public static String getValorRS(double valor) {
        return String.format("R$ %.2f", valor);
    }

    public static String abreviaTexto(String texto, int maxCaracteres) {
        if(texto == null || texto.length() <= maxCaracteres) {
            return texto;
        }

        return texto.substring(0, texto.length() - 3) + "...";
    }

    public static String formatarParaDDMMYYYYHHMMSS(LocalDateTime data) {
        if(Objects.isNull(data)) {
            return null;
        }
        return data.format(DateTimeFormatter.ofPattern("dd/mm/yyyy HH:mm:ss"));
    }

    public static void gravaArquivo(String path, String mensagem) {
        try  {
            Path caminho = Paths.get(path);
            mensagem = mensagem + System.lineSeparator();
            Files.writeString(caminho, mensagem, StandardOpenOption.APPEND, StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
