package com.aluracursos.DesafioAppRerpoduccionAudioPOO.modelos;

import com.aluracursos.DesafioAppReproduccionAudioPOO.Calculos.Clasificacion;

public class Podcast extends Audio implements Clasificacion {
    private int numeroDeEpisodio;
    private String nombre;
    private String serie;
    private int totalReproducciones;

    public void setTotalReproducciones(int totalReproducciones) {
        this.totalReproducciones = totalReproducciones;
    }

    public int getNumeroDeEpisodio() {
        return numeroDeEpisodio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public void setNumeroDeEpisodio(int episodios) {
        this.numeroDeEpisodio = episodios;
    }

    @Override
    public int getClasificacion() {
        if (totalReproducciones > 101) {
            return 5;
        } else if (totalReproducciones >= 100) {
            return 4;
        } else if (totalReproducciones <= 61) {
            return 3;
        } else {
            return 0;
        }
    }
}
