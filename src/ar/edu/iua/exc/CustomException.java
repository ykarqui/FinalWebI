
package ar.edu.iua.exc;

/**
 *
 * @author yamil
 */
public class CustomException extends Exception{
    
    public static final long serialVersionUID = 700L;
    
    public CustomException(String mensaje){
        super(mensaje);
    }
    
}
