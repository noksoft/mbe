package mx.com.nok.core.excepcion;

public class SessionException extends RuntimeException {
	static final long serialVersionUID = 2334545;
	
    public SessionException(String msgError){
        super(msgError);
    } 
}
