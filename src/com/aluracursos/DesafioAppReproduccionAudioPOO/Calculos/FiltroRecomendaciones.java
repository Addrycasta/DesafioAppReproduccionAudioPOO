package com.aluracursos.DesafioAppReproduccionAudioPOO.Calculos;

public class FiltroRecomendaciones {

    public void filtro(Clasificacion clasificacion){
        if (clasificacion.getClasificacion() >= 5){
            System.out.println("Muy popular");
        } else if (clasificacion.getClasificacion() >=4 ) {
            System.out.println("Popular");
        } else {
            System.out.println("Buena");
        }
    }
}
