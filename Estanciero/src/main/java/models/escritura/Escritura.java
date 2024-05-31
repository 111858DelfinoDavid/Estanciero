package models.escritura;

import models.TipoTarjeta;

public class Escritura extends TipoTarjeta {
    private int id;
    private String nombre;
    private  float precioCompra;
    private TipoEscritura tipoEscritura;

    public Escritura(String nombre, int id,float precioCompra) {
        super(nombre, id);
        this.precioCompra=precioCompra;
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

    public float getPrecioCompra() {
        return precioCompra;
    }

    public Escritura setPrecioCompra(float precioCompra) {
        this.precioCompra = precioCompra;
        return this;
    }

    public TipoEscritura getTipoEscritura() {
        return tipoEscritura;
    }

    public Escritura setTipoEscritura(TipoEscritura tipoEscritura) {
        this.tipoEscritura = tipoEscritura;
        return this;
    }



    @Override
    public String toString() {
        return "Escritura{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precioCompra=" + precioCompra +
                ", tipoEscritura=" + tipoEscritura +
                '}';
    }
}
