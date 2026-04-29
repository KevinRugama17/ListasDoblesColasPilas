/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1listasdoblescolaspilas.Ejercicio5;

/**
 *
 * @author kevin
 */
public class Ejercicio5 {

    public static void ejecutar(java.util.Scanner sc) {
        String opcion = "";
        do {
            System.out.println("\n--- EJERCICIO 5: Sala de Emergencias (Cola de Prioridad) ---");
            System.out.println("1. Registrar nuevo paciente en la cola");
            System.out.println("2. Atender al paciente de mayor prioridad");
            System.out.println("3. Consultar proximo paciente a atender");
            System.out.println("4. Mostrar lista completa ordenada por prioridad");
            System.out.println("5. Cambiar nivel de prioridad de un paciente");
            System.out.println("0. Volver al menu principal");
            System.out.print("Opcion: ");
            opcion = sc.nextLine().trim();

            switch (opcion) {
                case "1":
                    System.out.println("[Logica para registrar paciente...]");
                    break;
                case "2":
                    System.out.println("[Logica para atender paciente...]");
                    break;
                case "3":
                    System.out.println("[Logica para consultar proximo...]");
                    break;
                case "4":
                    System.out.println("[Logica para mostrar lista...]");
                    break;
                case "5":
                    System.out.println("[Logica para cambiar prioridad...]");
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
