/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1listasdoblescolaspilas.Ejercicio3;

/**
 *
 * @author kevin
 */
public class Ejercicio3 {

    public static void ejecutar(java.util.Scanner sc) {
        String opcion = "";
        do {
            System.out.println("\n--- EJERCICIO 3: Logistica y Reparto (Pila) ---");
            System.out.println("1. Registrar paquete en lista de llegada (Miami)");
            System.out.println("2. Generar Pila de ruta optima (cargar camion)");
            System.out.println("3. Ver ruta optima en Handheld");
            System.out.println("4. Simular entrega (desapilar)");
            System.out.println("0. Volver al menu principal");
            System.out.print("Opcion: ");
            opcion = sc.nextLine().trim();

            switch (opcion) {
                case "1":
                    System.out.println("[Logica para registrar paquete...]");
                    break;
                case "2":
                    System.out.println("[Logica para generar pila...]");
                    break;
                case "3":
                    System.out.println("[Logica para ver ruta optima...]");
                    break;
                case "4":
                    System.out.println("[Logica para simular entrega...]");
                    break;
                case "0":
                    System.out.println("Volviendo al menu principal...");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        } while (!opcion.equals("0"));
    }
}
