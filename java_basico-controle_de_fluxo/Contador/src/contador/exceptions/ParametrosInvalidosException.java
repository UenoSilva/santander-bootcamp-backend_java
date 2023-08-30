package contador.exceptions;

/**
 *
 * @author Ueno
 */
public class ParametrosInvalidosException extends Exception{
    
    private final String mensagem;
    
    public ParametrosInvalidosException(String mensagem){
        this.mensagem = mensagem;
    }
    
    // método para retorno do tipo de excessão
    @Override
    public String getMessage(){
        return this.mensagem;
    }
}
