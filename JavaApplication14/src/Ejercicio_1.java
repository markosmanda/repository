
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author marcos.españa
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        String frase;
        char letra;
        int igual=0;
        int igualespacios=0;
        char espacio=' ';
        
        System.out.print("Introduce una frase: ");
        frase=entrada.nextLine();
        System.out.print("Introduce el caracter: ");
        String ayuda=entrada.nextLine();
        letra=ayuda.charAt(0);
        
        for (int i=0;i<frase.length();i++){
            if (frase.charAt(i)==letra){
                igual++;
                
            }
            if (frase.charAt(i)==espacio){
                igualespacios++;
                
            }
            
        }
        int resultadopalabras=igualespacios+1;
        System.out.println("La letra "+letra+" aparece "+igual+" veces");
        System.out.println("En la frase "+frase+" hay "+resultadopalabras+" palabras");



          
        }
        

    }
    

