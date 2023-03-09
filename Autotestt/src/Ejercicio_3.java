
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author marcos.españa
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int num = 0;
        int suma = 0;
        boolean negativo = false;

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce el numero: ");
            num = Integer.parseInt(entrada.next());

            suma = suma + num;
            if (num < 0) {
                negativo = true;

            }

        }
        System.out.println("El resultado es: " + suma);
        if (negativo == true) {
            System.out.println("Has introducido números negativos");

        }

    }

}
