package edu.usal.negocio.dominio;

import java.util.Date;

public class Pasaporte {
    private String numeroDePasaporte;
    private String paisDeEmision;
    private String autoridadDeEmision;
    private Date fechaDeEmision;
    private Date fechaDeVencimiento;

    public Pasaporte(String numeroDePasaporte, String paisDeEmision, String autoridadDeEmision, Date fechaDeEmision, Date fechaDeVencimiento) {
        this.numeroDePasaporte = numeroDePasaporte;
        this.paisDeEmision = paisDeEmision;
        this.autoridadDeEmision = autoridadDeEmision;
        this.fechaDeEmision = fechaDeEmision;
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    public String getNumeroDePasaporte() {
        return numeroDePasaporte;
    }

    public void setNumeroDePasaporte(String numeroDePasaporte) {
        this.numeroDePasaporte = numeroDePasaporte;
    }

    public String getPaisDeEmision() {
        return paisDeEmision;
    }

    public void setPaisDeEmision(String paisDeEmision) {
        this.paisDeEmision = paisDeEmision;
    }

    public String getAutoridadDeEmision() {
        return autoridadDeEmision;
    }

    public void setAutoridadDeEmision(String autoridadDeEmision) {
        this.autoridadDeEmision = autoridadDeEmision;
    }

    public Date getFechaDeEmision() {
        return fechaDeEmision;
    }

    public void setFechaDeEmision(Date fechaDeEmision) {
        this.fechaDeEmision = fechaDeEmision;
    }

    public Date getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }

    public void setFechaDeVencimiento(Date fechaDeVencimiento) {
        this.fechaDeVencimiento = fechaDeVencimiento;
    }
}
