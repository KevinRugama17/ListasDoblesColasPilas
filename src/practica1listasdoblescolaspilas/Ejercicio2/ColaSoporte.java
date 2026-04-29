/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1listasdoblescolaspilas.Ejercicio2;

/**
 *
 * @author kevin
 */
public class ColaSoporte {
    
    NodoCola frente;
    NodoCola fin;
      
    
    void encolar (Solicitud s){
     NodoCola nuevo = new NodoCola(s, fin);
     
        if (frente == null) {
            frente = nuevo;
            fin = nuevo;
            
        }else{
        fin.siguiente = nuevo;
        fin = nuevo;
        
        }
    
    }
    
    public Solicitud desencolar(){
        
    //verifica si esta vacia
    if (frente == null) {
        return null;
            
        }
    
     Solicitud soli = frente.dato;
     frente = frente.siguiente;
     
     if (frente == null) {
         fin = null;
   
        }
      return soli;
    }
    
     public Solicitud consultarProxima(){
         
         //verifica si esta vacia
         if (frente == null) {
             return null;
         }
         
         return frente.dato;
     }
     
      public void mostrarPendientes(){
          
          NodoCola actual = frente;
          
          if (actual == null) { 
              System.out.println("No hay pendientes en la lista");
              return;
          }
          
          System.out.println("\n--- Lista de pendientes---\n");
          System.out.println("");
          
          while (actual != null) {              
              System.out.println(actual.dato);
               actual = actual.siguiente;
          }
          
      }
      
     
 public void estadisticasPorCanal() {
    // 1. Inicializamos los contadores
    int telefono = 0;
    int correo = 0;
    int chat = 0;

    // 2. Usamos un puntero auxiliar para recorrer sin destruir la cola
    NodoCola actual = frente;

    // 3. Recorrido de la cola
    while (actual != null) {
        // Obtenemos el canal (usando el método getter de la clase Solicitud)
        String canal = actual.dato.getCanalContacto();

        // 4. Clasificamos y contamos (usamos ignoreCase por seguridad)
        if (canal.equalsIgnoreCase("Teléfono")) {
            telefono++;
        } else if (canal.equalsIgnoreCase("Correo")) {
            correo++;
        } else if (canal.equalsIgnoreCase("Chat")) {
            chat++;
        }

        // Avanzamos al siguiente nodo
        actual = actual.siguiente;
    }

    // 5. Imprimimos los resultados
    System.out.println("--- Estadísticas por Canal ---");
    System.out.println("Teléfono: " + telefono);
    System.out.println("Correo: " + correo);
    System.out.println("Chat: " + chat);
}

      
      
      
}
