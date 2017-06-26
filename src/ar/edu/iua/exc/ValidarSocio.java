
package ar.edu.iua.exc;

import ar.edu.iua.model.Socio;
import javax.swing.JOptionPane;

/**
 *
 * @author yamil
 */
public class ValidarSocio {
    
    public ValidarSocio(){
        
    }
    
    public void validarBusqueda(Socio s) throws CustomException{
        if(s.getIdSocio() < 0){
            JOptionPane.showMessageDialog(null, "Numero menor a 0");
        }
        
    }
    
}
