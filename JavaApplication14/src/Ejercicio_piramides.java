
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author marcos.españa
 */
public class Ejercicio_piramides {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int numero;
            System.out.print("Introduce un numero: ");
            int numerousuario = Integer.parseInt(entrada.nextLine());
        
        int contador = 1;
        int intentos = 5;
       
        boolean acierto = false;

        do {
           int numerojava=(int) (Math.random() * 10);;  
            System.out.println("El numero de la maquina es: "+numerojava);

            if (numerousuario == numerojava) {
                acierto = true;
                System.out.println("Acierto");
                break;

            }
            if (numerousuario != numerojava) {
                contador++;
                System.out.println("Error");
            }

        } while (contador <= intentos);

    }
}
