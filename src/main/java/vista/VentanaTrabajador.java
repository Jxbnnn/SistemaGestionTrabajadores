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

        Trabajador trabajador = new Trabajador(nombre, apellido, rut, isapre, afp);
        mostrarDatosTrabajador(trabajador);

        scanner.close();
    }
    private static void mostrarDatosTrabajador(Trabajador trabajador) {
        System.out.println("--- Datos del Trabajador ---");
        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("Apellido: " + trabajador.getApellido());
        System.out.println("RUT: " + trabajador.getRut());
        System.out.println("Isapre: " + trabajador.getIsapre());
        System.out.println("AFP: " + trabajador.getAfp());
    }
}