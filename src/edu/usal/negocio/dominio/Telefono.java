package edu.usal.negocio.dominio;

public class Telefono {
    private String numeroPersonal;
    private String numeroCelular;
    private String numeroLaboral;

    public Telefono(String numeroPersonal, String numeroCelular, String numeroLaboral) {
        this.numeroPersonal = numeroPersonal;
        this.numeroCelular = numeroCelular;
        this.numeroLaboral = numeroLaboral;
    }

    public String getNumeroPersonal() {
        return numeroPersonal;
    }

    public void setNumeroPersonal(String numeroPersonal) {
        this.numeroPersonal = numeroPersonal;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public String getNumeroLaboral() {
        return numeroLaboral;
    }

    public void setNumeroLaboral(String numeroLaboral) {
        this.numeroLaboral = numeroLaboral;
    }
}
