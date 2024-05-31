package models.escritura;

public class TipoEscritura {
    private int id;
    private String nombre;

    public int getId() {
        return id;
    }

    public TipoEscritura setId(int id) {
        this.id = id;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public TipoEscritura setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public TipoEscritura() {
    }

    public TipoEscritura(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "TipoEscritura{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
