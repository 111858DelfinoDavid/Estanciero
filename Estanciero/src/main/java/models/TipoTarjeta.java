package models;

public abstract class TipoTarjeta {
    private int id;
    private String nombre;

    public int getId() {
        return id;
    }

    public TipoTarjeta setId(int id) {
        this.id = id;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public TipoTarjeta setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public TipoTarjeta(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    @Override
    public String toString() {
        return "TipoTarjeta{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
