package edu.usal.negocio.dominio;

public class Direccion {
    private String calle;
    private String altura;
    private String ciudad;
    private String codiPostal;

    public Direccion(String calle, String altura, String ciudad, String codiPostal) {
        this.calle = calle;
        this.altura = altura;
        this.ciudad = ciudad;
        this.codiPostal = codiPostal;
    }
}
