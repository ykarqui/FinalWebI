package ar.edu.iua.bo;

import ar.edu.iua.exc.CustomException;
import ar.edu.iua.exc.ValidarSocio;
import ar.edu.iua.model.Socio;
import ar.edu.iua.persistence.SocioDAO;
import ar.edu.iua.presentation.buscarSocio;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SocioBO extends GenericBO<Socio> {

    private List<Socio> socs = new ArrayList<>();
    //SocioDAO sdao;
    

    buscarSocio bs = new buscarSocio();

    public void buscarSocioBO(Socio s) throws CustomException, Exception {
        
                    System.out.println("Negocio: " + s.getIdSocio());
            
                //ValidarSocio v = new ValidarSocio();
                SocioDAO sdao = new SocioDAO();
                
                
                if(s.getIdSocio() < 0){
                    throw new CustomException("El numero de socio debe ser positivo.");
                }
                    //sdao.buscarS(s);
                   // v.validarBusqueda(s);
                    
                    sdao.buscarS(s);
                    
                
            
        
    }
    
    public void devolverSocioBO(Socio s) throws CustomException{
        
        if(s.getDni() == null){
            throw new CustomException("El socio no existe");
        }
        System.out.println("vuelta del BO: ");
        System.out.println("Nombre: "+s.getSocio());
        System.out.println("id: "+s.getIdSocio());
        
        buscarSocio bs = new buscarSocio();
        bs.mostrarSocio(s);
    
    }
    
    

    
  

}
