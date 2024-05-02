package com.aluracursos.DesafioAppReproduccionAudioPOO.Calculos;
import com.aluracursos.DesafioAppRerpoduccionAudioPOO.modelos.Audio;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void agregar(Audio audio){
        this.tiempoTotal += audio.getDuracion();
    }

}
