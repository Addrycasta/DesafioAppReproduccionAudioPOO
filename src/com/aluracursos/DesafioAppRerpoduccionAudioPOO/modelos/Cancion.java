package com.aluracursos.DesafioAppRerpoduccionAudioPOO.modelos;

import com.aluracursos.DesafioAppReproduccionAudioPOO.Calculos.Clasificacion;

public class Cancion extends Audio implements Clasificacion {
    private String interpretes;
    private String compositor;
    private int canciones;
    private double minutosPorCancion;

    public void setCanciones(int canciones) {
        this.canciones = canciones;
    }

    public void setMinutosPorCancion(double minutosPorCancion) {
        this.minutosPorCancion = minutosPorCancion;
    }

    @Override
    public double getDuracion() {
        return canciones * minutosPorCancion;
    }

    public String getInterpretes() {
        return interpretes;
    }

    public void setInterpretes(String interpretes) {
        this.interpretes = interpretes;
    }

    public String getCompositor() {
        return compositor;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    @Override
    public int getClasificacion() {
        return (int) calculaMedia() / 2;
    }
}
