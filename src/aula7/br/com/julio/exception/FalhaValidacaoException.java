package aula7.br.com.julio.exception;

import java.text.MessageFormat;
import java.util.Objects;

public class FalhaValidacaoException extends Exception {

    private Object[] parametros;

    public FalhaValidacaoException(String message, Object... parametros) {
        super(message);
        this.parametros = parametros;
    }

    @Override
    public String getMessage() {
        if(Objects.isNull(parametros)) {
            return super.getMessage();
        }
        return MessageFormat.format(super.getMessage(), this.parametros);
    }
}
