package practica1listasdoblescolaspilas;

import java.util.Scanner;
import practica1listasdoblescolaspilas.*;
import practica1listasdoblescolaspilas.Ejercicio1.Ejercicio1;

public class Practica1ListasDoblesColasPilas {
    static Ejercicio1 proceso = new Ejercicio1();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion = "";

        while (!opcion.equals("6")) {
            
            System.out.println("\n   PRACTICA LISTAS DOBLES, COLAS Y PILAS  ");
            System.out.println("==========================================");
            System.out.println("  1. Ejercicio 1: Lista doblemente enlazada (Biblioteca)");
            System.out.println("  2. Ejercicio 2: Cola (Soporte Técnico)");
            System.out.println("  3. Ejercicio 3: Pila (Logística y Reparto)");
            System.out.println("  4. Ejercicio 4: Lista circular (Guardias Médicas)");
            System.out.println("  5. Ejercicio 5: Cola de prioridad (Emergencias)");
            System.out.println("  6. Salir");
            System.out.println("==========================================");
            System.out.print("  Seleccione una opcion: ");
            opcion = sc.nextLine().trim();

            switch (opcion) {
                case "1":
                  
                    break;
                case "2":
                    practica1listasdoblescolaspilas.Ejercicio2.Ejercicio2.ejecutar(sc);
                    break;
                case "3":
                    practica1listasdoblescolaspilas.Ejercicio3.Ejercicio3.ejecutar(sc);
                    break;
                case "4":
                    practica1listasdoblescolaspilas.Ejercicio4.Ejercicio4.ejecutar(sc);
                    break;
                case "5":
                    practica1listasdoblescolaspilas.Ejercicio5.Ejercicio5.ejecutar(sc);
                    break;
                case "6":
                    System.out.println("\nHasta luego!");
                    break;
                default:
                    System.out.println("\nOpcion no valida, intente de nuevo");
            }
        }

        sc.close();
    }  

}