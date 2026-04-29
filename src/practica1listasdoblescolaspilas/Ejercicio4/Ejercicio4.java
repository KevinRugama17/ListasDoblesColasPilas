/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1listasdoblescolaspilas.Ejercicio4;

/**
 *
 * @author kevin
 */
public class Ejercicio4 {

    public static void ejecutar(java.util.Scanner sc) {
        String opcion = "";
        do {
            System.out.println("\n--- EJERCICIO 4: Guardias Medicas (Lista Circular) ---");
            System.out.println("1. Insertar un nuevo medico al equipo");
            System.out.println("2. Eliminar a un medico por codigo");
            System.out.println("3. Avanzar al siguiente medico en turno (cambio de guardia)");
            System.out.println("4. Mostrar el ciclo completo desde el medico actual");
            System.out.println("5. Calcular turnos faltantes para un medico especifico");
            System.out.println("0. Volver al menu principal");
            System.out.print("Opcion: ");
            opcion = sc.nextLine().trim();

            switch (opcion) {
                case "1":
                    System.out.println("[Logica para insertar medico...]");
                    break;
                case "2":
                    System.out.println("[Logica para eliminar medico...]");
                    break;
                case "3":
                    System.out.println("[Logica para avanzar turno...]");
                    break;
                case "4":
                    System.out.println("[Logica para mostrar ciclo...]");
                    break;
                case "5":
                    System.out.println("[Logica para calcular turnos...]");
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
