package models.propiedad;

import models.TipoTarjeta;

import java.util.List;

public class Propiedad extends TipoTarjeta {

    private List<Mejora> mejoras;
    private float precioCampo;
    private float precioAlquiler;




    public List<Mejora> getMejoras() {
        return mejoras;
    }

    public Propiedad setMejoras(List<Mejora> mejoras) {
        this.mejoras = mejoras;
        return this;
    }

    public float getPrecioCampo() {
        return precioCampo;
    }

    public Propiedad setPrecioCampo(float precioCampo) {
        this.precioCampo = precioCampo;
        return this;
    }

    public float getPrecioAlquiler() {
        return precioAlquiler;
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public TipoTarjeta setId(int id) {
        return super.setId(id);
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public TipoTarjeta setNombre(String nombre) {
        return super.setNombre(nombre);
    }

    public Propiedad(String nombre, int id, float precioCampo) {
        super(nombre, id);
        this.precioCampo = precioCampo;

    }
    //Metodo para cacular el precio del alquiler

    public void calcularAlquiler(){
        float precio=0;
        for(Mejora mejora:mejoras){
            precio+=mejora.getPlusMejoraAlquiler();
        }
        precioAlquiler=precio;
    }



}
