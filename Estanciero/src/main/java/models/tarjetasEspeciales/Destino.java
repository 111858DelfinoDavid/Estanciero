package models.tarjetasEspeciales;

import models.TipoTarjeta;

public class Destino extends TipoTarjeta {
    private String descripcion;

    public Destino(String nombre, int id, String descripcion) {
        super(nombre, id);
        this.descripcion=descripcion;
    }

    public void accion(){
        System.out.println("acción de la tarjeta destino");
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Destino setDescripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }

    @Override
    public String toString() {
        return "Destino{" +
                "descripcion='" + descripcion + '\'' +
                '}';
    }
}
