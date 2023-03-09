
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author marcos.españa
 */
public class Ejercicio_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        String frase;
        char caracter=' ';
        System.out.print("Introduce una frase: ");
        frase = entrada.nextLine();
        
        for (int i=0;i<frase.length();i++){
            if (frase.charAt(i)!=' '){
                caracter=caracter+frase.charAt(i);
            }
        }System.out.println(frase);
    }
    
}
