package edu.usal.negocio.dominio;

import java.io.Serializable;
import java.util.Date;

public class Cliente implements Serializable {
    private String nombreYApellido;
    private String dni;
    private Pasaporte pasaporte;
    private String cuit;
    private Date fecha_nacimiento;
    private String email;
    private Telefono telefono;
    private PasajeroFrecuente pasajeroFrecuente;
    private Direccion direccionCompleta;


    public Cliente(String nombreYApellido, String dni, Pasaporte pasaporte, String cuit, Date fecha_nacimiento, String email, Telefono telefono, PasajeroFrecuente pasajeroFrecuente, Direccion direccionCompleta) {
        this.nombreYApellido = nombreYApellido;
        this.dni = dni;
        this.pasaporte = pasaporte;
        this.cuit = cuit;
        this.fecha_nacimiento = fecha_nacimiento;
        this.email = email;
        this.telefono = telefono;
        this.pasajeroFrecuente = pasajeroFrecuente;
        this.direccionCompleta = direccionCompleta;
    }

    public Cliente() {
	}
    public Cliente(String nombreYApellido, String dni ) {
        this.nombreYApellido = nombreYApellido;
        this.dni = dni;
    }

	public String getNombreYApellido() {
        return nombreYApellido;
    }

    public void setNombreYApellido(String nombreYApellido) {
        this.nombreYApellido = nombreYApellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public void setTelefono(Telefono telefono) {
        this.telefono = telefono;
    }

    public PasajeroFrecuente getPasajeroFrecuente() {
        return pasajeroFrecuente;
    }

    public void setPasajeroFrecuente(PasajeroFrecuente pasajeroFrecuente) {
        this.pasajeroFrecuente = pasajeroFrecuente;
    }

    public Direccion getDireccionCompleta() {
        return direccionCompleta;
    }

    public void setDireccionCompleta(Direccion direccionCompleta) {
        this.direccionCompleta = direccionCompleta;
    }


    @Override
    public String toString() {
        return "Name:" + this.nombreYApellido + "\ndni: " + this.dni + "Direccioon:" + this.direccionCompleta + "\nTelefono: " + this.telefono + "Mail:" + this.email + "\nCuit: " + this.cuit ;
    }

}
