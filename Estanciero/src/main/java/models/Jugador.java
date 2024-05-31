package models;

import models.propiedad.Mejora;
import models.propiedad.Propiedad;

import java.util.List;
import java.util.Map;

public class Jugador {
    private String nombre;
    private Map<Propiedad, List<Mejora>> propiedadesConMejoras;
}
