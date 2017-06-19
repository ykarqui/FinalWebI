package ar.edu.iua.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReservaDAO {

    /*
    public void guardarR() throws Exception {

        Connection c = GCon.getInstance().getConnection();
        PreparedStatement insert = c.prepareStatement("INSERT INTO Reserva (idSocio, fecha, hora, codReserva,"
                + " idUsuario, idActividad) VALUES( ?,  ?,  ?,  ?,  ?,  ?)");

        String date = "2011-5-3";
        java.sql.Time time = new java.sql.Time(8, 05, 00);

        insert.setInt(1, 0001);
        insert.setString(2, date);
        insert.setTime(3, time);
        insert.setInt(4, 57);
        insert.setInt(5, 01);
        insert.setString(6, "F1");

        try {
            insert.execute();
            System.out.println("Reserva Realizada");
        } catch (Exception e) {
            System.out.println("Error al realizar reserva");
        }
    }
     */
 /*    
    public void eliminarPorIdR() throws Exception {
        
            Connection c = GCon.getInstance().getConnection();
            PreparedStatement srt = c.prepareStatement("DELETE FROM Reserva WHERE codReserva=?;");
            //Los parametros se cuentan desde 1.
            srt.setInt(1, 57);
        try {
            srt.executeUpdate();
            System.out.println("Reserva Borrada");

        } catch (Exception e) {
            System.out.println("Error al borrar reserva ");
        }

    }
     */
 /*
    public void actualizar() throws Exception {
        Connection c = GCon.getInstance().getConnection();
        PreparedStatement insert = c.prepareStatement("UPDATE Reserva SET fecha=?,"
                + " hora=?, idUsuario=?, idActividad=? WHERE codReserva=?");

        String date = "2017-05-17";
        java.sql.Time time = new java.sql.Time(12, 05, 00);
        
        
        insert.setString(1, date);
        insert.setTime(2, time);
        insert.setInt(3, 01);
        insert.setString(4, "F2");
        insert.setInt(5, 57);
        try{
            insert.executeUpdate();
            System.out.println("Reserva Actulizada");
        } catch (Exception e) {
            System.out.println("Error al Actualizar Reserva");
        }
        
    }
     */
 /*
    public ResultSet buscarReservas() throws ClassNotFoundException, SQLException {
        Connection c = GCon.getInstance().getConnection();
        PreparedStatement stm = c.prepareStatement("SELECT * FROM Reserva ORDER BY fecha");
        ResultSet rs = stm.executeQuery();

        while (rs.next()) {
            System.out.println(rs.getInt(1));
            System.out.println(rs.getInt(2));
            System.out.println(rs.getInt(3));
            System.out.println(rs.getDate(4));
            System.out.println(rs.getTime(5));
            System.out.println(rs.getString(6));
            
        }

        return rs;
    }
     */
    /*
    public ResultSet buscarR() throws Exception {

        Connection c = GCon.getInstance().getConnection();
        PreparedStatement buscar = c.prepareStatement("SELECT * FROM Reserva WHERE codReserva=?");

        buscar.setInt(1, 57);

        ResultSet rs = buscar.executeQuery();

        while (rs.next()) {
            System.out.println(rs.getInt(1));
            System.out.println(rs.getInt(2));
            System.out.println(rs.getInt(3));
            System.out.println(rs.getDate(4));
            System.out.println(rs.getTime(5));
            System.out.println(rs.getString(6));
        }
        return rs;
    }
*/
}
