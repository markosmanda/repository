
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author marcos.españa
 */
public class Ejercicio_12_bis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        String frase = "Alicia tiene 35 años";
        int palabra=0;
        int contpalabra=1;
        int contespa2=0;

        boolean espacios=false;
        
        


        for (int i=0;i<frase.length();i++){
            if (frase.charAt(i)==' '){
                contpalabra++;
            }
        }
        
        
        boolean correcto=false;
        
        while (correcto == false) {
            System.out.print("¿Que palabra quieres extraer: ");
            palabra = Integer.parseInt(entrada.nextLine());
            
            if (palabra<=contpalabra){
                correcto=true;
            }else{
                System.out.println("La palabra no va");
            }
        }
        
        String palabraencontrada="";
        contpalabra=1;
        
        for (int i=0;i<frase.length();i++){
            if (frase.charAt(i)==' '){
                contpalabra++;
            }
            if (contpalabra==palabra){
                if ()
                palabraencontrada=palabraencontrada+frase.charAt(i);
                
            }
        }
        System.out.print(palabraencontrada);
      }
}

