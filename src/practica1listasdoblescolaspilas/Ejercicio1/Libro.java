package practica1listasdoblescolaspilas.Ejercicio1;

public class Libro {
       private String codigoLibro;
       private String titulo;
       private String autor;
       private String nombreEstudiante;

    public Libro(String codigoLibro, String titulo, String autor, String nombreEstudiante) {
        this.codigoLibro = codigoLibro;
        this.titulo = titulo;
        this.autor = autor;
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getCodigoLibro() {
        return codigoLibro;
    }

    public void setCodigoLibro(String codigoLibro) {
        this.codigoLibro = codigoLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    @Override
    public String toString() {
        return "| Libro: " + codigoLibro + " | " + titulo + " | " + autor + " | " + nombreEstudiante;
    }
       
     
}
