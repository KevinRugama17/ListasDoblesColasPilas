package practica1listasdoblescolaspilas.Ejercicio1;

public class NodoLibro {
        Libro libro;
        NodoLibro sig;
        NodoLibro ant;

    public NodoLibro() {
        this.libro = libro;
        this.sig = null;
        this.ant = null;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public NodoLibro getSig() {
        return sig;
    }

    public void setSig(NodoLibro sig) {
        this.sig = sig;
    }

    public NodoLibro getAnt() {
        return ant;
    }

    public void setAnt(NodoLibro ant) {
        this.ant = ant;
    }       
}
