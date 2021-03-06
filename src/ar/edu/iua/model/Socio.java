package ar.edu.iua.model;


public class Socio {
    
    private Integer idSocio;
    private String socio;
    private String telefono;
    private String mail;
    private Integer dni;
    private Direccion idDireccion;

    public Socio() {
    }

    public Socio(String socio, String telefono, String mail, Integer dni) {
        this.socio = socio;
        this.telefono = telefono;
        this.mail = mail;
        this.dni = dni;
    }

    public Socio(Integer idSocio, String socio, String telefono, String mail, Integer dni, Direccion idDireccion) {
        this.idSocio = idSocio;
        this.socio = socio;
        this.telefono = telefono;
        this.mail = mail;
        this.dni = dni;
        this.idDireccion = idDireccion;
    }
    
    

    public Integer getIdSocio() {
        return idSocio;
    }

    public void setIdSocio(Integer idSocio) {
        this.idSocio = idSocio;
    }

    public String getSocio() {
        return socio;
    }

    public void setSocio(String socio) {
        this.socio = socio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Direccion getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(Direccion idDireccion) {
        this.idDireccion = idDireccion;
    }
    
    
}
