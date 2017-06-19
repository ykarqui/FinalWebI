package ar.edu.iua.bo;

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

    public void buscarSocioBO(Socio s) {
        
            if (s.getIdSocio() > 0) {
                
                
                try {
                    //sdao.buscarS(s);
                    System.out.println("Negocio: " + s.getIdSocio());
                    SocioDAO sdao = new SocioDAO();
                    sdao.buscarS(s);
                    
                } catch (Exception e) {
                    System.out.println("Error en negocio");
                }
            }
        
    }
    
    /*public void devolverSocioBO(Socio s){
        sdao.buscarS(s);
    }*/
  

}
