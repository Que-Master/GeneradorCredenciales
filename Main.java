import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Credencial plantilla = new Credencial("Nombre", "Cargo", "RUT");
        GestorCredenciales gestor = GestorCredenciales.getInstancia();

        int opcion;
        do {
            System.out.println("\n--- Menú de Credenciales ---");
            System.out.println("1. Crear nueva credencial");
            System.out.println("2. Ver credenciales");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Cargo: ");
                    String cargo = scanner.nextLine();
                    System.out.print("RUT: ");
                    String rut = scanner.nextLine();

                    Credencial nueva = plantilla.clone();
                    nueva.setNombre(nombre);
                    nueva.setCargo(cargo);
                    nueva.setRut(rut);

                    gestor.agregarCredencial(nueva);
                    System.out.println("Credencial creada exitosamente.");
                    break;
                case 2:
                    gestor.mostrarCredenciales();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }
}
