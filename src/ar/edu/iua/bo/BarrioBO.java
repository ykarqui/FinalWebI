/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.edu.iua.bo;

import ar.edu.iua.persistence.BarrioDAO;
import ar.edu.iua.model.Barrio;
import ar.edu.iua.presentation.cargarSocio;

/**
 *
 * @author giuliano
 */
public class BarrioBO {
    
    
    public void obtenerIdBarrioBO(Barrio b){
        
        BarrioDAO bdao = new BarrioDAO();
        
        try{
        bdao.obtenerBarrioDAO(b);
        }catch(Exception e){
            
        }
    }
    
    public void devolverIdB(Barrio b){
        
        cargarSocio cs = new cargarSocio();
        
        cs.devolverIdBP(b);
        
    }
    
}
