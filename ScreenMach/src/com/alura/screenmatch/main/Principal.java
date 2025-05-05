package com.alura.screenmatch.main;

import com.alura.screenmatch.calculos.CalculadoraDeTiempo;
import com.alura.screenmatch.calculos.FiltroRecomendacion;
import com.alura.screenmatch.modelos.Episodio;
import com.alura.screenmatch.modelos.Pelicula;
import com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.setDuracionEnMinutos(180);
        System.out.println("Duración de la película: " + miPelicula.getDuracionEnMinutos());

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(8);
        miPelicula.evalua(5);
        miPelicula.evalua(10);
        System.out.println("Total de evaluaciones: " + miPelicula.getTotalDeEvaluaciones());
        System.out.println(miPelicula.calculaMediaEvaluaciones());


        Serie lost = new Serie("Lost", 2000);
        lost.muestraFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duracion de la série: " + lost.getDuracionEnMinutos());

        Pelicula otraPelicula = new Pelicula("Avatar", 2003);
        otraPelicula.setDuracionEnMinutos(200);

        Pelicula favorita = new Pelicula("The matrix", 1999);
        favorita.setDuracionEnMinutos(90);

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluido(miPelicula);
        calculadora.incluido(otraPelicula);
        calculadora.incluido(lost);
        System.out.println(calculadora.getTiempoTotal());

        FiltroRecomendacion filtro = new FiltroRecomendacion();
        filtro.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizaciones(300);
        filtro.filtra(episodio);

        var peliculaDeEd = new Pelicula("El señor de los anillos", 2001);
        peliculaDeEd.setDuracionEnMinutos(100);

        ArrayList<Pelicula> listaDepeliculas = new ArrayList<>();
        listaDepeliculas.add(peliculaDeEd);
        listaDepeliculas.add(otraPelicula);
        listaDepeliculas.add(miPelicula);
        listaDepeliculas.add(favorita);
        System.out.println("Tamaño de la lista: " + listaDepeliculas.size());
        System.out.println("La primera pelicula es: " + listaDepeliculas.get(3).getNombre());

        System.out.println("lista de peliculas: " + listaDepeliculas);
        System.out.println("toString de la pelicula: " + listaDepeliculas.get(0).toString());



    }
}