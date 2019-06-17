package edu.usal.negocio.dominio;

import java.util.Date;

public class Vuelos {
    private int numeroDeVuelo;
    private int cantAsientos;
    private AeroPuerto aeroPuertoDeSalida;
    private AeroPuerto aeropueroDeLlegada;
    private Date fechaSalida;
    private Date fechaLlegada;
    private String tiempoDeVuelo;

    public Vuelos(int numeroDeVuelo, int cantAsientos, AeroPuerto aeroPuertoDeSalida, AeroPuerto aeropueroDeLlegada, Date fechaSalida, Date fechaLlegada, String tiempoDeVuelo) {
        this.numeroDeVuelo = numeroDeVuelo;
        this.cantAsientos = cantAsientos;
        this.aeroPuertoDeSalida = aeroPuertoDeSalida;
        this.aeropueroDeLlegada = aeropueroDeLlegada;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
        this.tiempoDeVuelo = tiempoDeVuelo;
    }

    public int getNumeroDeVuelo() {
        return numeroDeVuelo;
    }

    public void setNumeroDeVuelo(int numeroDeVuelo) {
        this.numeroDeVuelo = numeroDeVuelo;
    }

    public int getCantAsientos() {
        return cantAsientos;
    }

    public void setCantAsientos(int cantAsientos) {
        this.cantAsientos = cantAsientos;
    }

    public AeroPuerto getAeroPuertoDeSalida() {
        return aeroPuertoDeSalida;
    }

    public void setAeroPuertoDeSalida(AeroPuerto aeroPuertoDeSalida) {
        this.aeroPuertoDeSalida = aeroPuertoDeSalida;
    }

    public AeroPuerto getAeropueroDeLlegada() {
        return aeropueroDeLlegada;
    }

    public void setAeropueroDeLlegada(AeroPuerto aeropueroDeLlegada) {
        this.aeropueroDeLlegada = aeropueroDeLlegada;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public String getTiempoDeVuelo() {
        return tiempoDeVuelo;
    }

    public void setTiempoDeVuelo(String tiempoDeVuelo) {
        this.tiempoDeVuelo = tiempoDeVuelo;
    }
}
