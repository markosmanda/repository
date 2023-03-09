
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author marcos.españa
 */
public class Ejercicio_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int[] vector = new int[24];
        double media = 0;
        int suma = 0;
        int option = 0;
        
                    System.out.printf("1. Calcular temperatura minima \n"
                    + "2. calcular temperatura maxima \n"
                    + "3. Calcular media \n"
                            + "Que opcion elige: ");
            option = Integer.parseInt(entrada.nextLine());
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 40) + 1;

        
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.print("|" + vector[i]);

        }
        System.out.printf("|"
                + "\n");
        int min = vector[0];
        int max = vector[0];
        for (int i = 0; i < vector.length; i++) {

            if (vector[i] < min) {
                min = vector[i];
            }
            if (vector[i] > max) {
                max = vector[i];

            }
            suma = suma + vector[i];

        }
        media = suma / vector.length;
        if (option == 1) {
            System.out.println(min);
        }
        if (option == 2) {
            System.out.println(max);
        }
        if (option == 3) {
            System.out.println(media);
        }
    }
}
