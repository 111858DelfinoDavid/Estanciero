package models;

public class Tarjeta {
    private TipoTarjeta tipoTarjeta;

    public TipoTarjeta getTipoTarjeta() {
        return tipoTarjeta;
    }

    public Tarjeta() {
    }

    public Tarjeta(TipoTarjeta tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }
}
