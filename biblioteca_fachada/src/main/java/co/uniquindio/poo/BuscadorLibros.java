package co.uniquindio.poo;

import java.util.ArrayList;

public class BuscadorLibros {
    private ArrayList<Libro>  libros;

    public BuscadorLibros(ArrayList<Libro> libros) {
        this.libros = libros;

    }
    
public ArrayList<Libro> buscarPorTitulo(String titulo) {
        ArrayList<Libro> resultados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
                resultados.add(libro);
            }
        }
        return resultados;
    }

    public ArrayList<Libro> buscarPorAutor(String autor) {
        ArrayList<Libro> resultados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getAutor().toLowerCase().contains(autor.toLowerCase())) {
                resultados.add(libro);
            }
        }
        return resultados;
    }

    public ArrayList<Libro> buscarPorCategoria(String categoria) {
        ArrayList<Libro> resultados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getCategoria().toLowerCase().contains(categoria.toLowerCase())) {
                resultados.add(libro);
            }
        }
        return resultados;
    }


    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

}
