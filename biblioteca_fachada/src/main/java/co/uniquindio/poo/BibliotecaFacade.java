package co.uniquindio.poo;

import java.util.ArrayList;

public class BibliotecaFacade {
    private BuscadorLibros buscadorLibros;

    public BibliotecaFacade(ArrayList<Libro> libros) {
        this.buscadorLibros = new BuscadorLibros(libros);
    }

    //métodos
    public ArrayList<Libro> buscarPorTitulo(String titulo) {
        return buscadorLibros.buscarPorTitulo(titulo);
    }

    public ArrayList<Libro> buscarPorAutor(String autor) {
        return buscadorLibros.buscarPorAutor(autor);
    }

    public ArrayList<Libro> buscarPorCategoria(String categoria) {
        return buscadorLibros.buscarPorCategoria(categoria);
    }

}