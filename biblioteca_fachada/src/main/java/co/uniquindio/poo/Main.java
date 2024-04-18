package co.uniquindio.poo;

import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {

        ArrayList<Libro> libros = new ArrayList<>();

        libros.add(new Libro("ladron de quesos cremosos", "angie gonilla", "persecucion"));
        libros.add(new Libro("el arte de revolear las patas", "katerine grajales", "comico"));
        libros.add(new Libro("medelliwing", "celeste gilano", "reflexion"));

        
        BibliotecaFacade bibliotecaFacade = new BibliotecaFacade(libros);

        ArrayList<Libro> resultadosPorTitulo = bibliotecaFacade.buscarPorTitulo("ladron de quesos cremosos");
        System.out.println("Los resultados de la busquedad por título fueron los siguientes: ");
        for (Libro libro : resultadosPorTitulo) {
            System.out.println(libro);
        }

        ArrayList<Libro> resultadosPorAutor = bibliotecaFacade.buscarPorAutor("katerine grajales");
        System.out.println("Los resultados de la busquedad por autor fueron los siguientes: ");
        for (Libro libro : resultadosPorAutor) {
            System.out.println(libro);
        }

        ArrayList<Libro> resultadosPorCategoria = bibliotecaFacade.buscarPorCategoria("persecucion");
        System.out.println("Los resultados de la busquedad por categoria fueron los siguientes: ");
        for (Libro libro : resultadosPorCategoria) {
            System.out.println(libro);
        }
    }
}


