package models;

import models.escritura.Escritura;
import models.propiedad.Mejora;
import models.propiedad.Propiedad;

import java.util.List;
import java.util.Map;

public class Banco {
    private Map<Propiedad, List<Mejora>> propiedadesMejoras;
    private List<Escritura> escrituras;
    private float dineroBanco;

    public Banco(Map<Propiedad, List<Mejora>> propiedadesMejoras, float dineroBanco) {
        this.propiedadesMejoras = propiedadesMejoras;
        this.dineroBanco = dineroBanco;
    }

    public Map.Entry<Propiedad,List<Mejora>> venderPropiedadConMejorasPorId(int id){
        for(Map.Entry<Propiedad,List<Mejora>> entry:propiedadesMejoras.entrySet()){
            if(entry.getKey().getId()==id){
                return entry;
            }
        }
        return null;
    }

    //Ver como solucionar este metodo cuando el jugador hipoteca una propiedad o se la vende al banco
    /*public void comprarPropiedadConMejoras(Map<Propiedad,List<Mejora>> propiedadesMejoras){
        propiedadesMejoras.
    }*/
}
