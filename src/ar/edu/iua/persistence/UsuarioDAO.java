package ar.edu.iua.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {

    /*
    public void guardarU() throws Exception {
        Connection c = GCon.getInstance().getConnection();
        PreparedStatement insert = c.prepareStatement("INSERT INTO Usuario "
                + "(idUsuario,usuario,contrasena,nombre,apellido) "
                + "VALUES( ?,  ?,  ?,  ?,  ?)");

        insert.setInt(1, 3);
        insert.setString(2, "panteraRosa");
        insert.setString(3, "laPantera");
        insert.setString(4, "Rosa");
        insert.setString(5, "Flor");
        insert.execute();
    }*/
 /*
    public void deleteByIdU() throws Exception {
        try {
            Connection c = GCon.getInstance().getConnection();
            PreparedStatement srt = c.prepareStatement("DELETE FROM mydb.Usuario WHERE idUsuario =?;");
            //Los parametros se cuentan desde 1.
            srt.setInt(1, 3);
            srt.executeUpdate();
            System.out.println("Usuario Borrado");

        } catch (Exception e) {
            System.out.println("No se pudo actualizar ");
        }

    }*/
 /*
    public void modificarU() throws Exception {
        Connection c = GCon.getInstance().getConnection();
        PreparedStatement insert = c.prepareStatement("UPDATE Usuario "
                + "SET usuario = ? , contrasena = ? , nombre = ? , apellido = ?"
                + "WHERE idUsuario = ?");    //donde guardo el idBarrio
        
        insert.setString(1, "ykarqui");
        insert.setString(2, "ykarqui");
        insert.setString(3, "Yamil");
        insert.setString(4, "Karqui");
        insert.setInt(5,2);
        insert.executeUpdate();
    }*/
    
    /*
    public void modificarUContra() throws Exception {
        Connection c = GCon.getInstance().getConnection();
        PreparedStatement insert = c.prepareStatement("UPDATE Usuario "
                + "SET contrasena = ? "
                + "WHERE idUsuario = ?");    //donde guardo el idBarrio
        
        insert.setString(1, "ykarqui123");
        insert.setInt(2,2);
        insert.executeUpdate();

    }*/
    
    /*
    public ResultSet buscarUsuarios() throws ClassNotFoundException, SQLException {
        Connection c = GCon.getInstance().getConnection();
        PreparedStatement stm = c.prepareStatement("SELECT * FROM Usuario ORDER BY usuario");
        ResultSet rs = stm.executeQuery();

        while (rs.next()) {
            System.out.println(rs.getInt(1));
            System.out.println(rs.getString(2));            
            System.out.println(rs.getString(3));
            System.out.println(rs.getString(4));
            System.out.println(rs.getString(5));
        }

        return rs;
    }*/
    
    /*
    public ResultSet buscarUsuario() throws ClassNotFoundException, SQLException {
        Connection c = GCon.getInstance().getConnection();
        PreparedStatement stm = c.prepareStatement("SELECT * FROM Usuario WHERE idUsuario = ?");

        stm.setInt(1, 2);
        
       ResultSet rs = stm.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getInt(1));
            System.out.println(rs.getString(2));            
            System.out.println(rs.getString(3));
            System.out.println(rs.getString(4));
            System.out.println(rs.getString(5));
        }

        return rs;
    }*/
}
