package ar.edu.iua.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PagoDAO {

    /*
    public void guardarP() throws Exception {
        Connection c = GCon.getInstance().getConnection();
        PreparedStatement insert = c.prepareStatement("INSERT INTO Pago (fechaPago, idPago, idCuota,"
                + " idSocio) VALUES( ?,  ?,  ?,  ?)");

        insert.setString(1, "2017-02-12");
        insert.setInt(2, 1);
        insert.setInt(3, 2);
        insert.setInt(4, 1);
        try {
            insert.execute();
            System.out.println("Pago guardado con exito");
        } catch (Exception e) {
            System.out.println("Error al guardar Pago");
        }
    }*/

    /*    
    public void eliminarPorIdC() throws Exception {

        Connection c = GCon.getInstance().getConnection();
        PreparedStatement srt = c.prepareStatement("DELETE FROM mydb.Pago WHERE idPago =?;");
        //Los parametros se cuentan desde 1.
        srt.setInt(1, 1111);
        try {
            srt.executeUpdate();
            System.out.println("Pago Borrado");

        } catch (Exception e) {
            System.out.println("No se pudo Eliminar ");
        }

    }*/

    /*
    public ResultSet buscarPagos() throws ClassNotFoundException, SQLException {
        Connection c = GCon.getInstance().getConnection();
        PreparedStatement stm = c.prepareStatement("SELECT * FROM Pago ORDER BY idPago");
        ResultSet rs = stm.executeQuery();
        try {
            while (rs.next()) {
                System.out.println(rs.getString(1));
                System.out.println(rs.getInt(2));
                System.out.println(rs.getInt(3));
                System.out.println(rs.getInt(4));
            }
        } catch (Exception e) {
            System.out.println("Error al buscar los Socios ");
        }
        return rs;
    }*/

    /*
    public void actualizarP() throws Exception {
        Connection c = GCon.getInstance().getConnection();
        PreparedStatement insert = c.prepareStatement("UPDATE Pago SET fechaPago=?,"
                + " idCuota=?, idSocio=? WHERE idPago=?");

        insert.setString(1, "2017-05-10");
        insert.setInt(2, 3);
        insert.setInt(3, 2);
        insert.setInt(4, 3);
        try {
            insert.executeUpdate();
            System.out.println("Pago Actulizado");

        } catch (Exception e) {
            System.out.println("No se pudo actualizar ");
        }
    }*/

}
