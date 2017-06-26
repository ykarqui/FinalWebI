package ar.edu.iua.persistence;

import ar.edu.iua.bo.SocioBO;
import ar.edu.iua.model.Direccion;
import ar.edu.iua.model.Socio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SocioDAO {
    SocioBO sbo = new SocioBO();
    Socio socio = new Socio();

    /*
     public void guardarS() throws Exception {
        Connection c = GCon.getInstance().getConnection();
        PreparedStatement insert = c.prepareStatement("INSERT INTO Socio (idSocio, Socio,"
                + " telefono, mail, dni, idDireccion) VALUES( ?,  ?,  ?,  ?,  ?,  ?)");
        
            insert.setInt(1, 1);
            insert.setString(2, "Giuliano Alessandro");
            insert.setInt(3, 154789652);
            insert.setString(4, "giuliano@gmail.com");
            insert.setInt(5, 1254785);
            insert.setInt(6, 123);
        try{
            insert.execute();
            System.out.println("Socio guardado con exito");
        }catch (Exception e) {
            System.out.println("Error al guardar Socio");
        }
    }
     */
    public void buscarS(Socio s) throws Exception {

        System.out.println("DAO:"+s.getIdSocio());

        Connection c = GCon.getInstance().getConnection();
        PreparedStatement buscar = c.prepareStatement("SELECT * FROM Socio WHERE idSocio=?");

        buscar.setInt(1, s.getIdSocio());

        ResultSet rs = buscar.executeQuery();

        try {
            while (rs.next()) {
                System.out.println(rs.getInt(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getInt(3));
                System.out.println(rs.getString(4));
                System.out.println(rs.getInt(5));
                System.out.println(rs.getInt(6));
            }
           // devolverS((Socio) rs);
        } catch (Exception e) {
            System.out.println("Error en Persistencia");
        }
        socio.setIdSocio(rs.getInt(1));
        socio.setSocio(rs.getString(2));
        socio.setTelefono(rs.getString(3));
        socio.setMail(rs.getString(4));
        socio.setDni(rs.getInt(5));
        Direccion d = new Direccion();
        d.setIdDireccion(rs.getInt(6));
        socio.setIdDireccion(d);
        sbo.devolverSocioBO(socio);
    }

    

    /*    
    public void eliminarPorIdS() throws Exception {
        
            Connection c = GCon.getInstance().getConnection();
            PreparedStatement srt = c.prepareStatement("DELETE FROM mydb.Socio WHERE idSocio =?;");
            //Los parametros se cuentan desde 1.
            srt.setInt(1, 1);
        try {
            srt.executeUpdate();
            System.out.println("Socio Borrado");

        } catch (Exception e) {
            System.out.println("No se pudo Eliminar ");
        }

    }
     */
 /*
    public void actualizarS() throws Exception {
        Connection c = GCon.getInstance().getConnection();
        PreparedStatement insert = c.prepareStatement("UPDATE Socio SET Socio=?,"
                + " telefono=?, mail=?, dni=?, idDireccion=? WHERE idSocio=?");
        
            insert.setString(1, "Alessandro Giuliano");
            insert.setInt(2, 1155115511);
            insert.setString(3, "alessandro@gmail.com");
            insert.setInt(4, 38628515);
            insert.setInt(5, 123);
            insert.setInt(6, 1);
        try{
            insert.executeUpdate();
            System.out.println("Socio Actulizado");
            
        }catch (Exception e) {
            System.out.println("No se pudo actualizar ");
        }
    }
     */
 
    public ResultSet buscarSocios() throws ClassNotFoundException, SQLException {
        Connection c = GCon.getInstance().getConnection();
        PreparedStatement stm = c.prepareStatement("SELECT * FROM Socio ORDER BY Socio");
        ResultSet rs = stm.executeQuery();
        try{
            while (rs.next()) {
                System.out.println(rs.getInt(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getInt(3));
                System.out.println(rs.getString(4));
                System.out.println(rs.getInt(5));
                System.out.println(rs.getInt(6));
            }
        }catch (Exception e) {
            System.out.println("Error al buscar los Socios ");
        }
        return rs;
    }
     
}
