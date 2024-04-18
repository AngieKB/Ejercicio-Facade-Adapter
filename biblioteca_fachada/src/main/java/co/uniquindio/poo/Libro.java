package co.uniquindio.poo;

public class Libro {
    private String titulo;
    private String autor;
    private String categoria;

    public Libro(String titulo, String autor, String categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
    }
    
    //getters
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public String getCategoria() {
        return categoria;
    }

    //setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String toString(){
        return "el libro se titula: " + titulo + ", escrito por: " + autor + ", categorizado en: " + categoria;
    }
    
}
