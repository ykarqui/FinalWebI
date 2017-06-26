package ar.edu.iua.model;


public class Direccion {

    private Integer idDireccion;
    private String calle;
    private Integer numero;
    private Integer piso;
    private String departamento;
    private Barrio idBarrio;

    public Direccion() {
    }

    public Direccion(String calle, Integer numero, Integer piso, String departamento) {
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.departamento = departamento;
    }

    public Direccion(String calle, Integer numero, Integer piso, String departamento, Barrio idBarrio) {
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.departamento = departamento;
        this.idBarrio = idBarrio;
    }

    public Direccion(Integer idDireccion, String calle, Integer numero, Integer piso, String departamento, Barrio idBarrio) {
        this.idDireccion = idDireccion;
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.departamento = departamento;
        this.idBarrio = idBarrio;
    }
    
    

    public Integer getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(Integer idDireccion) {
        this.idDireccion = idDireccion;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getPiso() {
        return piso;
    }

    public void setPiso(Integer piso) {
        this.piso = piso;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Barrio getIdBarrio() {
        return idBarrio;
    }

    public void setIdBarrio(Barrio idBarrio) {
        this.idBarrio = idBarrio;
    }
    
    
}
