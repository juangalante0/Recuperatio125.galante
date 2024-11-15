
package navesespaciales;


public class NaveRepetidaException extends RuntimeException{
    
    private static final String MENSAJE = "La nave ya se encuentra en la lista";
    
    public NaveRepetidaException() {
        super(MENSAJE);
    }
    
}
