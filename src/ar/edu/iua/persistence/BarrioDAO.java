package ar.edu.iua.persistence;

import ar.edu.iua.bo.BarrioBO;
import ar.edu.iua.model.Barrio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BarrioDAO {
    
    
    public void obtenerBarrioDAO(Barrio barrio) throws Exception {
        Connection c = GCon.getInstance().getConnection();
        PreparedStatement buscar = c.prepareStatement("SELECT * FROM Barrio WHERE Barrio=?");
        
        buscar.setString(1, barrio.getBarrio());

        ResultSet rs = buscar.executeQuery();

        try {
            while (rs.next()) {
                System.out.println(rs.getInt(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getInt(3));
            }
           
        } catch (Exception e) {
            System.out.println("Error en Persistencia");
        }
        
        barrio.setIdBarrio(rs.getInt(1));
        barrio.setBarrio(rs.getString(2));
        barrio.setCP(rs.getInt(3));
        
        BarrioBO bbo = new BarrioBO();
        bbo.devolverIdB(barrio);
    }
    
    /*
    public void guardarB() throws Exception {
        Connection c = GCon.getInstance().getConnection();
        PreparedStatement insert = c.prepareStatement("INSERT INTO Barrio (idBarrio, Barrio, "
                + "CP) VALUES( ?,  ?,  ?)");

        insert.setInt(1, 7);
        insert.setString(2, "fmghfhg");
        insert.setInt(3, 5000);

        try {
            insert.execute();
        } catch (Exception e) {
            System.out.println("No se pudo actualizar ");
        }
    }*/

    
    /*
    public void modificarB() throws Exception {
        Connection c = GCon.getInstance().getConnection();
        PreparedStatement insert = c.prepareStatement("UPDATE Barrio "
                + "SET Barrio = ? , CP = ? "
                + "WHERE idBarrio = ?");    //donde guardo el idBarrio
        
        insert.setString(1, "Mendiolaza");
        insert.setInt(2, 5060);
        insert.setInt(3, 8);
        insert.executeUpdate();
     

    }*/
    
    /*
    public void deleteByIdB() throws Exception {
        try {
            Connection c = GCon.getInstance().getConnection();
            PreparedStatement srt = c.prepareStatement("DELETE FROM mydb.Barrio WHERE idBarrio =?;");
            //Los parametros se cuentan desde 1.
            srt.setInt(1, 7);
            srt.executeUpdate();
            System.out.println("Barrio Borrado");

        } catch (Exception e) {
            System.out.println("No se pudo actualizar ");
        }

    }*/

}
