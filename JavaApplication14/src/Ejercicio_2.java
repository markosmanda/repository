
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
        Scanner entrada = new Scanner (System.in);
        String frase;
        int contadorvocales=0;
        int contadornumeros=0;
        int contadorconsonantes=0;
        int contadorespacios=0;
        System.out.print("Introduce una frase: ");
        frase=entrada.nextLine().toLowerCase();
        
        for (int i=0;i<frase.length();i++){
            if (frase.charAt(i)=='a'||frase.charAt(i)=='e'||frase.charAt(i)=='i'||frase.charAt(i)=='o'||frase.charAt(i)=='u'){
                contadorvocales++;
            
        }else if (frase.charAt(i)>=49 && frase.charAt(i)<=57){
            contadornumeros++;
        }else if (frase.charAt(i)==' '){
            contadorespacios++;
        }else{
            contadorconsonantes++;
        }
            
        }
        System.out.println("La frase contiene "+contadorvocales+" vocales");
        System.out.println("La frase contiene "+contadorconsonantes+" consonantes");
        System.out.println("La frase contiene "+contadornumeros+" numeros");
        System.out.println("La frase contiene "+contadorespacios+" espacios");
        
       
    }
    
}
