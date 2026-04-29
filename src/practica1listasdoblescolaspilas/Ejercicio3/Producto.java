
package practica1listasdoblescolaspilas.Ejercicio3;

public class Producto {
       private String idPaquete;
       private String descripcion;
       private int km;
       private double monto;
       private int pesoPaquete;

    public Producto(String idPaquete, String descripcion, int km, double monto, int pesoPaquete) {
        this.idPaquete = idPaquete;
        this.descripcion = descripcion;
        this.km = km;
        this.monto = monto;
        this.pesoPaquete = pesoPaquete;
    }

    public String getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(String idPaquete) {
        this.idPaquete = idPaquete;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getPesoPaquete() {
        return pesoPaquete;
    }

    public void setPesoPaquete(int pesoPaquete) {
        this.pesoPaquete = pesoPaquete;
    }
       
       
       
}
