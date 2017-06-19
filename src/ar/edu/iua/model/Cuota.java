package ar.edu.iua.model;

import java.sql.Date;


public class Cuota {
    
    private Integer idCuota;
    private Integer monto;
    private Integer recargp;
    private String mes;
    private String fechaVencimiento;

    public Integer getIdCuota() {
        return idCuota;
    }

    public void setIdCuota(Integer idCuota) {
        this.idCuota = idCuota;
    }

    public Integer getMonto() {
        return monto;
    }

    public void setMonto(Integer monto) {
        this.monto = monto;
    }

    public Integer getRecargp() {
        return recargp;
    }

    public void setRecargp(Integer recargp) {
        this.recargp = recargp;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    
    
    
}
