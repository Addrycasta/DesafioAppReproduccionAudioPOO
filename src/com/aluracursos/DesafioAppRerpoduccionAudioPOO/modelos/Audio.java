package com.aluracursos.DesafioAppRerpoduccionAudioPOO.modelos;

import com.aluracursos.DesafioAppReproduccionAudioPOO.Calculos.Clasificacion;

public class Audio implements Clasificacion {
    private String titulo;
    private double duracion;
    private int totalDeReproducciones;
    private int meGusta;
    private double sumDeLasEvaluaciones;
    private int totalDeLasEvaluacioes;

    public String getTitulo() {
        return titulo;
    }

    public double getDuracion() {
        return duracion;
    }

    public int getMeGusta() {
        return meGusta;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public void setTotalDeReproducciones(int totalDeReproducciones) {
        this.totalDeReproducciones = totalDeReproducciones;
    }

    public void setMeGusta(int meGusta) {
        this.meGusta = meGusta;
    }

    public int getTotalDeLasEvaluacioes(){
        return totalDeLasEvaluacioes;
    }

    public void muestraCreditos(){
        System.out.println("Canción: " + titulo);
        System.out.println("Duración canción : " + duracion + " minútos");
        System.out.println("Total de reproducciones: " + totalDeReproducciones);
        System.out.println("Me gusta: " + meGusta);
        System.out.println("******************");
    }

    public void evalua(double puntaje){
        sumDeLasEvaluaciones += puntaje;
        totalDeLasEvaluacioes++;
    }

    public double calculaMedia(){
        return sumDeLasEvaluaciones / totalDeLasEvaluacioes;
    }

    @Override
    public int getClasificacion() {
        return 0;
    }
}
