
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author marcos.españa
 */
public class Ejercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String palabra1;
        String palabra2;
        int iguales = 0;

        System.out.print("Introduce la primera palabra: ");
        palabra1 = entrada.nextLine().toLowerCase();
        System.out.print("Introduce la segunda palabra: ");
        palabra2 = entrada.nextLine().toLowerCase();
        if (palabra1.length() != palabra2.length()) {
            System.out.println("No son iguales");
        }
        else{
        for (int i = 0; i < palabra1.length(); i++) {

            if (palabra1.charAt(i) == palabra2.charAt(i)) {
                iguales++;

            }
        }
        }
         if (palabra1.length() == iguales) {
            System.out.println("Son iguales");
        } 
    }

}
