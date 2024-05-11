package aula8.br.com.julio.utils;

import aula8.br.com.julio.pillarsPOO.enums.NivelLogEnum;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.stream.Stream;

public class LogUtils {

    static final private String CAMINHO = "./src/aula8/br/com/julio/utils/teste.txt";

    public static void info(String mensagem) {
        log(NivelLogEnum.INFO, mensagem);
    }

    public static void warn(String mensagem) {
        log(NivelLogEnum.WARN, mensagem);
    }

    public static void error(String mensagem) {
        log(NivelLogEnum.ERROR, mensagem);
    }

    private static void log(NivelLogEnum nivel, String mensagem) {
        String data = AppUtils.formatarParaDDMMYYYYHHMMSS(LocalDateTime.now());
        String log = String.format("%s - %s - %s", data, nivel, mensagem);
        AppUtils.gravaArquivo(CAMINHO, log);
    }

    public static void exibirLog() {
        Path path = Paths.get(CAMINHO);
        try (Stream<String> leitor = Files.lines(path)){
            leitor.forEach(linhaAtual -> System.out.println(linhaAtual));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
