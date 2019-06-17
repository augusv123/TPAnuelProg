package edu.usal.negocio.dominio;



import java.util.Date;

public class Ventas {
    private Cliente cliente;
    private Vuelos vuelo;
    private LineasAereas aerolinea;
    private Date fechaHoraVenta;
    private String formaDePago;

    public Ventas(Cliente cliente, Vuelos vuelo, LineasAereas aerolinea, Date fechaHoraVenta, String formaDePago) {
        this.cliente = cliente;
        this.vuelo = vuelo;
        this.aerolinea = aerolinea;
        this.fechaHoraVenta = fechaHoraVenta;
        this.formaDePago = formaDePago;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vuelos getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelos vuelo) {
        this.vuelo = vuelo;
    }

    public LineasAereas getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(LineasAereas aerolinea) {
        this.aerolinea = aerolinea;
    }

    public Date getFechaHoraVenta() {
        return fechaHoraVenta;
    }

    public void setFechaHoraVenta(Date fechaHoraVenta) {
        this.fechaHoraVenta = fechaHoraVenta;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }
}
