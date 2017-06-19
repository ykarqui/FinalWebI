package ar.edu.iua.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author yamil
 */
public class DireccionDAO {

    /*
    public void guardarD() throws Exception {
        Connection c = GCon.getInstance().getConnection();
        PreparedStatement insert = c.prepareStatement("INSERT INTO Direccion "
                + "(idDireccion,calle,numero,piso,departamento,idBarrio) "
                + "VALUES( ?,  ?,  ?,  ?,  ?,  ?)");

        insert.setInt(1, 6);
        insert.setString(2, "Maestro Vidal");
        insert.setInt(3, 3422);
        insert.setInt(4, 3);
        insert.setString(5, "B");
        insert.setString(6, "pabloescobar@gmail.com");
        insert.setInt(6, 2);
        insert.execute();
    }*/
    /*
    public void deleteByIdD() throws Exception {
        try {
            Connection c = GCon.getInstance().getConnection();
            PreparedStatement srt = c.prepareStatement("DELETE FROM mydb.Direccion WHERE idDireccion =?;");
            //Los parametros se cuentan desde 1.
            srt.setInt(1, 6);
            srt.executeUpdate();
            System.out.println("Direccion Borrado");

        } catch (Exception e) {
            System.out.println("No se pudo actualizar ");
        }

    }*/
    /*
    public void modificarD() throws Exception {
        Connection c = GCon.getInstance().getConnection();
        PreparedStatement insert = c.prepareStatement("UPDATE Direccion SET calle = ? , numero = ?,piso = ?,departamento =?,idBarrio=? WHERE idDireccion = ?");    //donde guardo el idBarrio
        
        insert.setString(1, "Rondeau");
        insert.setString(2, "5060");
        insert.setInt(3, 8);
        insert.setString(4, "A");
        insert.setInt(5, 4);
        insert.setInt(6,3);
        insert.executeUpdate();
     

    }

*/


}
