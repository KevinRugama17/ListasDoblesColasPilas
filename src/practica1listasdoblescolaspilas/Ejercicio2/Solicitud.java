package practica1listasdoblescolaspilas.Ejercicio2;

/**
 *
 * @author kevin
 */
public class Solicitud {
    private int numeroTicket;
    private String nombreCliente;
    private String descripcion;
    private String canalContacto;//telefono,correo o chat

    public Solicitud(int numeroTicket, String nombreCliente, String descripcion, String canalContacto) {
        this.numeroTicket = numeroTicket;
        this.nombreCliente = nombreCliente;
        this.descripcion = descripcion;
        this.canalContacto = canalContacto;
    }

    public int getNumeroTicket() {
        return numeroTicket;
    }

    public void setNumeroTicket(int numeroTicket) {
        this.numeroTicket = numeroTicket;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCanalContacto() {
        return canalContacto;
    }

    public void setCanalContacto(String canalContacto) {
        this.canalContacto = canalContacto;
    }
    
     @Override
    public String toString() {
        return "--- TICKET DE SOPORTE #" + numeroTicket + " ---\n" +
               "Cliente: " + nombreCliente + "\n" +
               "Canal:   " + canalContacto + "\n" +
               "Problema: " + descripcion + "\n" +
               "------------------------------"; 
   }
}