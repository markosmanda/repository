
import java.util.Scanner;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author marcos.españa
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Biblioteca ListaAutor = new Biblioteca();
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("Menu Biblioteca");
            System.out.println("****************************");
            System.out.println("1. Añadir autores");
            System.out.println("2. Añadir libro");
            System.out.println("3. Listar libros");
            System.out.println("4. Prestar libros");
            System.out.println("5. Devolver libros");
            System.out.println("6. Salir");
            do {
                System.out.print("Introduce una opcion: ");
                opcion = Integer.parseInt(entrada.nextLine());
                if (opcion < 0 || opcion > 6) {
                    System.out.println("Error, opción introducida no valida");
                }
            } while (opcion < 0 || opcion > 6);
            switch (opcion) {
                case 1:
                    System.out.print("Introduce el nombre: ");
                    String nombre = entrada.nextLine();
                    System.out.print("Introduce el 1 apellido: ");
                    String apellido1 = entrada.nextLine();
                    System.out.print("Introduce el 2 apellido: ");
                    String apellido2 = entrada.nextLine();
                    System.out.print("Introduce el email: ");
                    String email = entrada.nextLine();
                    ListaAutor.addAutor(nombre, apellido1, apellido2, email);
                    break;
                case 2:
                    break;

                case 3:
                    System.out.println("LISTAR LIBROS");
                    System.out.println("*****************************");
                    ListaAutor.listadoAutores();
                    break;

                case 4:
                    break;

                case 5:
                    break;
                case 6:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Error, opción introducida no valida");
                    break;

            }
            System.out.println("");
        } while (opcion != 6);
    }
}
