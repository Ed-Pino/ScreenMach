package com.alura.screenmatch.main;

import com.alura.screenmatch.modelos.Pelicula;
import com.alura.screenmatch.modelos.Serie;
import com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrisipalConListas {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.evalua(9);
        Pelicula otra = new Pelicula("John Wick", 2014);
        Pelicula otraPelicula = new Pelicula("Avatar", 2003);
        otraPelicula.evalua(6);
        var peliculaDeEd = new Pelicula("El señor de los anillos", 2001);
        peliculaDeEd.evalua(8);
        Pelicula favorita = new Pelicula("The matrix", 1999);
        favorita.evalua(9);
        Serie serie = new Serie("La casa de papel", 2017);
        Serie lost = new Serie("Lost", 2000);

        Pelicula p1 = peliculaDeEd;

        ArrayList<Titulo> listaPeliculas = new ArrayList<>();
        listaPeliculas.add(miPelicula);
        listaPeliculas.add(peliculaDeEd);
        listaPeliculas.add(otraPelicula);
        listaPeliculas.add(favorita);
        listaPeliculas.add(otra);
        listaPeliculas.add(serie);
        listaPeliculas.add(lost);

            for (Titulo item: listaPeliculas){
            System.out.println("Nombre: " + item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 1) {
                System.out.println("Clasificacion:" + pelicula.getClasificacion());
            }
        }

            ArrayList<String> listaDeArtistas = new ArrayList<>();
            listaDeArtistas.add("Penelope Cruz");
            listaDeArtistas.add("Antonio Banderas");
            listaDeArtistas.add("Ricardo Darin");
            System.out.println(listaDeArtistas);

        Collections.sort(listaDeArtistas);
        System.out.println("Lista de artistas ordenada: " + listaDeArtistas);

        Collections.sort(listaPeliculas);
        System.out.println("Lista de titulos ordenados: " + listaPeliculas);

        listaPeliculas.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("lista ordenada por fecha: " + listaPeliculas);




    }
}
