
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author marcos.españa
 */
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int opcion;
        double millas;
        double kilometros;
        double millakm = 0;
        double kmamill = 0;
        boolean tres = false;

        while (tres == false) {
            System.out.println("Conversor de medidas");
            System.out.println("============================================");
            System.out.printf("1. Millas a kilometros\n"
                    + "2. Kilometros a millas\n"
                    + "3. Salir\n"
                    + ""
                    + "Introduce una opcion: ");
            opcion = Integer.parseInt(entrada.nextLine());
            if (opcion > 0 && opcion < 4) {
                if (opcion == 1) {
                    case1:
                    System.out.print("¿Cuantas millas: ");
                    millas = Double.parseDouble(entrada.nextLine());
                    millakm = millas * 1.6093;
                    System.out.printf("--> %.0f millas son %.2f km\n", millas, millakm);
                }
                if (opcion == 2) {
                    System.out.print("¿Cuantos km?: ");
                    kilometros = Double.parseDouble(entrada.nextLine());
                    kmamill = kilometros / 1.6093;
                    System.out.printf("--> %.0f kilometros son %.2f millas\n", kilometros, kmamill);
                }
                if (opcion == 3) {
                    System.out.println("Saliendo");
                    tres = true;
                    break;
                }
            } else {
                System.out.println("Opcion no valida");
            }
        }
    }

}
