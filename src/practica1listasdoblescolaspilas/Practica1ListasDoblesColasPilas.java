package practica1listasdoblescolaspilas;

import java.util.Scanner;
import practica1listasdoblescolaspilas.*;

public class Practica1ListasDoblesColasPilas {
    
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        String opcion = "";

        while (!opcion.equals("6")) {
            
            System.out.println("   PRACTICA LISTAS DOBLES, COLASY PILAS  ");
            System.out.println("");
            System.out.println("  1. Ejercicio: Lista doblemente Enlazada");
            System.out.println("  2. Ejercicio: Registro de Trabajo en Finca");
            System.out.println("  3. Ejercicio: Registro de Estudiantes y Cursos");
            System.out.println("  4. Ejercicio: Registro de Estudiantes y Cursos");
            System.out.println("  5. Ejercicio: Registro de Estudiantes y Cursos");
            System.out.println("  6. Salir");
            System.out.println("");
            System.out.print("  Seleccione una opcion: ");
            opcion = sc.nextLine().trim();

            switch (opcion) {
                case "1":
                    System.out.println("\nEjercicio 1... \n");
                    
                    break;
                case "2":
                    System.out.println("\nEjercicio 2... \n");
                  //  Ejercicio2.ejecutar(sc);
                    break;
                case "3":
                    System.out.println("\nEjercicio 3... \n");
                   // Ejercicio3.ejecutar(sc);
                    break;
                case "4":
                    System.out.println("\nEjercicio 4... \n");
                   // Ejercicio4
                    break;
                case "5":
                    System.out.println("\nEjercicio 5... \n");
                   // Ejercicio5
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