package aula7.br.com.julio.utils;

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

}
