
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author marcos.españa
 */
public class Ejercicio_0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        String teclado ;
        String letras;
      
        
        System.out.print("Introduce una cadena: ");
        teclado = entrada.next();
        
        System.out.print("Charat: ");
        for (int i=0;i<teclado.length();i++){
        
        System.out.print(teclado.charAt(i));
        }
        System.out.println("");
        System.out.print("Substring: ");
        System.out.println(teclado.substring(0));
//        for (int i=0;i<teclado.length();i++){
//        
//        System.out.print(teclado.substring(i, i+1));
//        }
        System.out.println("");
       
    }
    
}
