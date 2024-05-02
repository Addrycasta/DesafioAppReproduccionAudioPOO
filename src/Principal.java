import com.aluracursos.DesafioAppReproduccionAudioPOO.Calculos.CalculadoraDeTiempo;
import com.aluracursos.DesafioAppReproduccionAudioPOO.Calculos.FiltroRecomendaciones;
import com.aluracursos.DesafioAppRerpoduccionAudioPOO.modelos.Audio;
import com.aluracursos.DesafioAppRerpoduccionAudioPOO.modelos.Podcast;

public class Principal {

    public static void main(String[] args) {
        Audio cancion1 = new Audio();
        cancion1.setTitulo("Survival");
        cancion1.setDuracion(5.33);
        cancion1.setTotalDeReproducciones(556787);
        cancion1.setMeGusta(547765);

//        cancion1.muestraCreditos();
        cancion1.evalua(9.9);
        cancion1.evalua(9.9);
//        System.out.println("Total de evaluaciones: " + cancion1.getTotalDeLasEvaluacioes());
//        System.out.println("Evaluación: " + cancion1.calculaMedia());
//        System.out.println("Calificación: " + cancion1.calculaClasificacion());
//        System.out.println("----------------------------------------------");

        Audio cancion2 = new Audio();
        cancion2.setTitulo("Madness");
        cancion2.setDuracion(4.33);
        cancion2.setTotalDeReproducciones(525412);
        cancion2.setMeGusta(512698);
        cancion2.evalua(10);
        cancion2.evalua(10);

//        cancion2.muestraCreditos();

//        Cancion cancion3 = new Cancion();
//        cancion3.setTitulo("Yeah right");
//        cancion3.setDuracion(10);
//        cancion3.setCanciones(3);
//        cancion3.setMinutosPorCancion(10);
//        cancion3.setTotalDeReproducciones(425255);
//        cancion3.setMeGusta(412563);
//        cancion3.setInterpretes("Joji");
//        cancion3.setCompositor("alguien");
//        cancion3.muestraCreditos();
//        cancion3.evalua(9.5);
//        cancion3.evalua(9.7);
//        System.out.println("Total de evaluaciones: " + cancion3.getTotalDeLasEvaluacioes());
//        System.out.println("Evaluación: " + cancion3.calculaMedia());
//        System.out.println("Calificación: " + cancion3.calculaClasificacion());
//        System.out.println("Duración álbum: " + cancion3.getDuracion() + " minútos");
//
        Podcast episodio = new Podcast();
        episodio.setTitulo("Alura1");
        episodio.setDuracion(10);
        episodio.setNumeroDeEpisodio(10);

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.agregar(episodio);
        calculadora.agregar(cancion1);
        calculadora.agregar(cancion2);
        System.out.println("Duración lista: " + calculadora.getTiempoTotal() + " minútos");

        FiltroRecomendaciones filtroRecomendaciones = new FiltroRecomendaciones();
        filtroRecomendaciones.filtro(cancion2);

        Podcast episodio2 = new Podcast();
        episodio2.setNumeroDeEpisodio(2);
        episodio2.setNombre("Segundo");
        episodio2.setTotalReproducciones(102);

        filtroRecomendaciones.filtro(episodio2);
    }
}
