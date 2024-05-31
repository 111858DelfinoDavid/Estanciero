package models.propiedad;

public class Mejora {
    private int id;
    private String nombre;
    private float costoMejora;
    private float plusMejoraAlquiler;
    private boolean activada;

    public boolean isActivada() {
        return activada;
    }

    public void setActivada(boolean activada) {
        this.activada = activada;

    }

    public float getPlusMejoraAlquiler() {
        return plusMejoraAlquiler;
    }

    public Mejora setPlusMejoraAlquiler(float plusMejoraAlquiler) {
        this.plusMejoraAlquiler = plusMejoraAlquiler;
        return this;
    }

    public Mejora(int id, String nombre, float costoMejora,float plusMejoraAlquiler) {
        this.id = id;
        this.nombre = nombre;
        this.costoMejora = costoMejora;
        this.plusMejoraAlquiler=plusMejoraAlquiler;
        this.activada=false;


    }

    public int getId() {
        return id;
    }

    public Mejora setId(int id) {
        this.id = id;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public Mejora setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public float getCostoMejora() {
        return costoMejora;
    }

    public Mejora setCostoMejora(float costoMejora) {
        this.costoMejora = costoMejora;
        return this;
    }

    public Mejora() {
    }

    @Override
    public String toString() {
        return "Mejora{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", costoMejora=" + costoMejora +
                '}';
    }
}
