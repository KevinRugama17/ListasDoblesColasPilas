package practica1listasdoblescolaspilas.Ejercicio1;

public class NodoLibro {
        Libro libro;
        NodoLibro sig;
        NodoLibro ant;

    public NodoLibro(Libro libro) {
        this.libro = libro;
        this.sig = null;
        this.ant = null;
    }

}
