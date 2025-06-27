package vista;

import modelo.Trabajador;
import java.util.Scanner;

public class VentanaTrabajador {
    public static void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Registro de Trabajador ---");

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("RUT: ");
        String rut = scanner.nextLine();

        System.out.print("Isapre: ");
        String isapre = scanner.nextLine();

        System.out.print("AFP: ");
        String afp = scanner.nextLine();

    }
}