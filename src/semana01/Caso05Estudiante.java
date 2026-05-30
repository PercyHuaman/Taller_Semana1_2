
// RESOLVIENDO CONFLICTO PROGRAMADOR A Y PROGRAMADOR B
// PRACTICA CASO05 - ESTUDIANTE

package semana01; 

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Caso05Estudiante {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> estudiantes = new ArrayList<>();  // lista para guardar estudiantes
        int opcion = 0;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Mostrar estudiantes");
            System.out.println("3. Salir");
            System.out.print("Seleccione Opción: ");

            try {
                opcion = sc.nextInt();
                sc.nextLine(); // limpiar buffer

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese nombre del estudiante: ");
                        String nombre = sc.nextLine();
                        estudiantes.add(nombre);
                        System.out.println("Estudiante agregado.");
                        break;
                    case 2:
                        System.out.println("\nLista de estudiantes:");
                        if (estudiantes.isEmpty()) {
                            System.out.println("No hay estudiantes.");
                        } else {
                            for (String est : estudiantes) {
                                System.out.println("- " + est);
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción inválida.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: debe ingresar un número.");
                sc.nextLine(); // limpiar entrada incorrecta
            }

        } while (opcion != 3);

        sc.close();
    }
}
