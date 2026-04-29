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

    public static void ejecutar(Scanner sc) {
   
        int opcion;
        do {
            System.out.println("\n-- EJERCICIO 2: Soporte Tecnico (Cola) --");
            System.out.println("1. Encolar nueva solicitud de soporte");
            System.out.println("2. Atender (desencolar) la siguiente solicitud");
            System.out.println("3. Consultar proxima solicitud a atender");
            System.out.println("4. Mostrar todas las solicitudes pendientes");
            System.out.println("5. Mostrar estadisticas por canal de contacto");
            System.out.println("0. Volver al menu principal");
            System.out.print("Opcion: ");
            opcion = leerInt();
            switch (opcion) {
                case 1:
                    System.out.println("[Logica para encolar nueva solicitud...]");
                    break;
                case 2:
                    System.out.println("[Logica para atender solicitud...]");
                    break;
                case 3:
                    System.out.println("[Logica para consultar proxima solicitud...]");
                    break;
                case 4:
                    System.out.println("[Logica para mostrar solicitudes pendientes...]");
                    break;
                case 5:
                    System.out.println("[Logica para mostrar estadisticas...]");
                    break;
                case 0:
                    System.out.println("Volviendo al menu principal...");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        } while (opcion != 0);
    }
 
    static int leerInt() {
        try { 
            return Integer.parseInt(sc.nextLine().trim());
        } catch (NumberFormatException e) 
        { return -1; }
    }
    
}