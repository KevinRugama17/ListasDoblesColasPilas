/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1listasdoblescolaspilas.Ejercicio2;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Ejercicio2 {

static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
   
     
        int opcion;
        do {
            System.out.println("\n-- Soporte tecnico --");
            System.out.println("");
            System.out.println("1. Encolar nueva solicitud");
            System.out.println("2. desencolar la siguiente solicitud en espera");
            System.out.println("3. Mostrar todos los prestamos activos ( (inicio -> fin)");
            System.out.println("4. Mostrar todos los prestamos activos ( (fin -> inicio)");
            System.out.println("5. Buscar un libro por su titulo o codigo");
            System.out.println("6. Buscar un libro por su titulo o codigo");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");
            opcion = leerInt();
            switch (opcion) {
           /*     case 1:
                    System.out.print("Nueva solicitud: ");
                    historial.visitarPagina(sc.nextLine().trim());
                    break;
                case 2: historial.retroceder(); break;
                case 3: historial.avanzar();    break;
                case 4: historial.mostrarAdelanteAtras(); break;
                case 5: historial.mostrarAtrasAdelante(); break;
                case 0: System.out.println("Saliendo..."); break;
                default: System.out.println("Opcion invalida.");*/
            }
        } while (opcion != 0);
        sc.close();
    }
 
    static int leerInt() {
        try { 
            return Integer.parseInt(sc.nextLine().trim());
        } catch (NumberFormatException e) 
        { return -1; }
    }
    
}