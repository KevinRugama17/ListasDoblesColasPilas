package practica1listasdoblescolaspilas.Ejercicio1;


public class GestorLibro {
       private int total;
       private NodoLibro cabeza;
       private NodoLibro fin;
       
  public boolean vacia(){return cabeza == null;}
  
  public boolean insertarFinal(Libro libro){
      // En caso que el objeto pedido no exista o codigoLibro sea nulo
      if (libro == null || libro.getCodigoLibro().isEmpty() ) {
          return false;
      }
       // Declaramos e inicializamos nuevo Nodo libro
      NodoLibro nuevoLibro = new NodoLibro();
      nuevoLibro.setLibro(libro);
      
      // en caso que la lista este vacia
      if (cabeza == null) {
      nuevoLibro.setAnt(null);
      nuevoLibro.setSig(cabeza);
      cabeza = nuevoLibro;
      fin = nuevoLibro;
      return true;
      }
      
      // Declaracion e inicializacion del Nodo actual, para recorrer la lista
      NodoLibro aux = cabeza;
      // recorre la lista hasta encontrar que el siguiente nodo de la lista sea nulo
      while (aux.getSig() != null) {
          if (aux.getLibro().getCodigoLibro().equalsIgnoreCase(nuevoLibro.getLibro().getCodigoLibro())) {
          return false;
          }
      aux = aux.getSig();
      }
      nuevoLibro.setSig(null);
      aux.setSig(nuevoLibro);
      nuevoLibro.setAnt(aux);
      fin = nuevoLibro;
      
  return true;}
  
  public boolean cancelarPrestamo(String codigo){
       if (vacia()) {
          return false;
      }
        NodoLibro temp;
       // Si nodo a eliminar es cabeza
      if (cabeza.getLibro().getCodigoLibro().equalsIgnoreCase(codigo)) {
      temp = cabeza;
      cabeza.getSig().setAnt(null);
      cabeza =cabeza.sig;
      temp.setSig(null);
      return true;
      }
      // Si nodo a eliminar es fin
      if (fin.getLibro().getCodigoLibro().equalsIgnoreCase(codigo)) {
      temp = fin;
      fin = fin.getAnt();
      fin.getAnt().setSig(null);
      return true;
      }
       // Declaracion e inicializacion nodo aux;
      NodoLibro aux = cabeza;
      while (aux != null) {          
          if (aux.getLibro().getCodigoLibro().equalsIgnoreCase(codigo)) {
          temp = aux;
          aux.getSig().setAnt(aux.getAnt());
          aux.getAnt().setSig(aux.getSig());
          temp.setAnt(null);
          temp.setSig(null);
          return true;
          }
          aux = aux.getSig();
      }
  return false;}
  // Muestra todos los prestamos
  public String listar(){
      if (vacia()) {
      return "";
      }
      // Declaramos e inicializamos listado
      String listado = "";
      // Variable para recorrer lista
      NodoLibro aux = cabeza;
      // contador de libros activos
      int contador = 1;
      while (aux != null) {          
      listado += contador + aux.getLibro().toString() + "\n";
      contador ++;
      aux = aux.getSig();
      }
  return listado;}
  
 public NodoLibro buscarLibro(String TitutoloOcodigo){
     
     if (vacia()) {
        return null;
     }
   NodoLibro aux = cabeza;
     while (aux != null) {         
         if (aux.getLibro().getCodigoLibro().equalsIgnoreCase(TitutoloOcodigo) || 
         aux.getLibro().getTitulo().equalsIgnoreCase(TitutoloOcodigo)) {
         return aux;
         }
         aux = aux.getSig();
     }
 return null;}
  

}
