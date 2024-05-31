package models;

public class Casilla {
    private int id;
    private Tarjeta tarjeta;

    public int getId() {
        return id;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public Casilla() {
    }

    public Casilla(int id, Tarjeta tarjeta) {
        this.id = id;
        this.tarjeta = tarjeta;
    }

    @Override
    public String toString() {
        return "Casilla{" +
                "id=" + id +
                ", tarjeta=" + tarjeta +
                '}';
    }
}
