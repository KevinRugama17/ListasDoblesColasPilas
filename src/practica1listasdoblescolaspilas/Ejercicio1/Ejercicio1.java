
package practica1listasdoblescolaspilas.Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    static Scanner entrada = new Scanner(System.in);
    static GestorLibro gestor = new GestorLibro();
   
    public static void main(String[] args) {
        
        int opcion;
        do {
            System.out.println("\n-- Gestion de prestamos de libros --");
            System.out.println("");
            System.out.println("1. Agregar un nuevo prestamo al final de la lista");
            System.out.println("2. Cancelar un prestamo buscando por codigo de libro");
            System.out.println("3. Mostrar todos los prestamos activos ( (inicio -> fin)");
            System.out.println("4. Mostrar todos los prestamos activos ( (fin -> inicio)");
            System.out.println("5. Buscar un libro por su titulo o codigo");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");
            opcion = Integer.parseInt(entrada.nextLine());
            switch (opcion) {
                case 0 -> {
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                }
                case 1 -> {
                 
                    try {
                        System.out.print("Codigo de libro: ");
                        String codigo = entrada.nextLine().trim().replace(",", ".");
                        System.out.println("Titulo: ");
                        String titulo = entrada.nextLine();
                        System.out.println("autor: ");
                        String autor = entrada.nextLine();
                        System.out.println("Nombre estudiante: ");
                        String nombreEstudiante = entrada.nextLine();
                        if (codigo.isEmpty() || titulo.isEmpty() || autor.isEmpty() || nombreEstudiante.isEmpty()) {
                            System.out.println("Campos Incompletos, Por favor, llene todos los campos.");
                            return;
                        }
                        Libro nuevoLibro = new Libro(codigo, titulo, autor, nombreEstudiante);
                        if (gestor.insertarFinal(nuevoLibro)) {
                            System.out.println("El libro: " + nuevoLibro.getCodigoLibro() + "agregado \n");
                        } else {
                            System.out.println("Error, libro no agregado");
                        }
                    } catch (Exception e1) {
                        System.out.println("Error intente de nuevo agregar un libro");
                    }
                    break;
                }
                case 2 -> {
                    try {
                        System.out.println("Ingrese codigo del prestamos cancelar (Codigo Libro): ");
                        String codigo = entrada.nextLine();

                        if (gestor.cancelarPrestamo(codigo)) {
                            System.out.println("El libro: " + codigo + ", fue cancelado \n");
                        } else {
                            System.out.println("Error, el libro no fue cancelado");
                        }

                    } catch (Exception e) {
                    }
                }
                case 3 -> {
                    System.out.println("---- LISTA DE INICIO A FIN-----");
                    if (gestor.listarDeInicioFin().equalsIgnoreCase("")) {
                        System.out.println("No hay Libros agregados");
                    } else {
                        gestor.listarDeInicioFin();
                    }
                }
                case 4 -> {
                    System.out.println("---- LISTA DE FIN A INICIO-----");
                    if (!gestor.listarDeFinInicio().equalsIgnoreCase("")) {
                        gestor.listarDeFinInicio();
                    } else {
                        System.out.println("No hay Libros agregados");
                    }
                }
                case 5 -> {
                    try {
                        System.out.println("Ingrese el codigo o titulo del libro");
                        String aux = entrada.nextLine();
                        if (gestor.buscarLibro(aux) != null) {
                            NodoLibro libroBuscado = gestor.buscarLibro(aux);
                            System.out.println(libroBuscado.getLibro().toString());
                        } else {
                            System.out.println("Error no se encontro el libro");
                        }
                    } catch (Exception e) {
                    }
                }

            }
        } while (opcion != 0);
    }
}
