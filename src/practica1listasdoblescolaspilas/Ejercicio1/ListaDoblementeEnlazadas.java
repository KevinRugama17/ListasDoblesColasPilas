package practica1listasdoblescolaspilas.Ejercicio1;


public class ListaDoblementeEnlazadas {
    private int total;
       private NodoLibro cabeza;
       private NodoLibro fin;

       public ListaDoblementeEnlazadas (){
       cabeza = null;
       fin = null;
       total = 0;
       }
       
  public boolean vacia(){return cabeza == null;}
  
  public boolean insertarFinal(Libro libro){
      // En caso que el objeto pedido no exista o codigoLibro sea nulo
      if (libro == null || libro.getCodigoLibro().isEmpty() ) {
          return false;
      }
       // Declaramos e inicializamos nuevo Nodo libro
      NodoLibro nuevoLibro = new NodoLibro(libro);
      
      // en caso que la lista este vacia
      if (cabeza == null) {
      nuevoLibro.ant = null;
      nuevoLibro.sig = null;
      cabeza = nuevoLibro;
      fin = cabeza;
      return true;
      }
      // Declaracion e inicializacion del Nodo actual, para recorrer la lista
      NodoLibro aux = cabeza;
      // recorre la lista hasta encontrar que el siguiente nodo de la lista sea nulo
      while (aux.sig != null) {
          if (aux.libro.getCodigoLibro().equalsIgnoreCase(nuevoLibro.libro.getCodigoLibro())) {
          return false;
          }
      aux = aux.sig;
      }
      nuevoLibro.sig = null;
      aux.sig = nuevoLibro;
      nuevoLibro.ant = aux;
      fin = nuevoLibro;
      
  return true;}
  
  public boolean cancelarPrestamo(String codigo){
         NodoLibro aux = cabeza;
        while (aux != null) {
            if (aux.libro.getCodigoLibro().equalsIgnoreCase(codigo)) {
              if (aux.ant != null) {
            aux.ant.sig = aux.sig;
            }
            else {
            cabeza = aux.sig;
            }
            if (aux.sig != null) {
            aux.sig.ant = aux.ant;
            }
            else { fin = aux.ant; 
            }   
          return true; }
          return false; 
        }
      
  return false;
}
  // recorre y muestra todos los prestamos de inicio a fin
  public String listarDeInicioFin(){
      if (vacia()) {
      return "";
      }
      // Declaramos e inicializamos listado
      String listado = "";
      // Variable para recorrer lista desde inicio
      NodoLibro aux = cabeza;
      // contador de libros activos
      int contador = 1;
      while (aux != null) {          
      listado += contador + aux.libro.toString() + "\n";
      contador ++;
      aux = aux.sig;
      }
  return listado;}
  
  // Muestra todos los prestamos de fin a inicio
  public String listarDeFinInicio(){
      if (vacia()) {
      return "";
      }
      // Declaramos e inicializamos listado
      String listado = "";
      // Variable para recorrer la lista desde fin
      NodoLibro aux = fin;
      // contador de libros activos
      int contador = 1;
      while (aux != null) {          
      listado += contador + aux.libro.toString() + "\n";
      contador ++;
      aux = aux.ant;
      }
  return listado;}
  
 public NodoLibro buscarLibro(String TitutoloOcodigo){
     
     if (vacia()) {
        return null;
     }
   NodoLibro aux = cabeza;
     while (aux != null) {         
         if (aux.libro.getCodigoLibro().equalsIgnoreCase(TitutoloOcodigo) || 
         aux.libro.getTitulo().equalsIgnoreCase(TitutoloOcodigo)) {
         return aux;
         }
         aux = aux.sig;
     }
 return null;}

}


