
import java.time.Year;
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
        int mes;
        int año = 0;

        System.out.print("Indica el mes: ");
        mes = Integer.parseInt(entrada.next());

        switch (mes) {
            //tienen 30 dias
            case 1,3,5,7,8,10,12:
                System.out.println("El mes tiene 31 dias");
                break;

            case 4,6,9,11:
                System.out.println("El mes tiene 30 dias");
                break;
            case 2:
                    System.out.print("Que año es: ");
                    año = Integer.parseInt(entrada.next());

                if (Year.of(año).isLeap()) {
                    System.out.println("Tiene 29 dias");
                } else if (Year.of(año).isLeap() == false) {
                    System.out.println("tiene 28 dias");
                }
        }
    }

}
