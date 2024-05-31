package models.tarjetasEspeciales;

import models.TipoTarjeta;

public class Suerte extends TipoTarjeta {
    private String decripcion;

    public String getDecripcion() {
        return decripcion;
    }

    public Suerte setDecripcion(String decripcion) {
        this.decripcion = decripcion;
        return this;
    }

    public Suerte(String nombre, int id, String descripcion) {
        super(nombre, id);
        this.decripcion = descripcion;

    }

    public void accionar() {
        System.out.println("acción de la tarjeta suerte");
    }
}
