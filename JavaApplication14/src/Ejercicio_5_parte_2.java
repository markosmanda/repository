/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author marcos.españa
 */
public class Ejercicio_5_parte_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase = "   Me llamo pepe   ";
        int primerespacio=0;
        int segundoespacio=0;
        for (int i=0;i<frase.length();i++){
            if (frase.charAt(i)!=' '){
                primerespacio=i;
                break;
            }
        } for (int i=primerespacio;i<frase.length();i++){
            if (frase.charAt(i)!=' '){
                segundoespacio=i+1;
                
            
        }
            
        }System.out.print(frase.substring(primerespacio, segundoespacio));
    }
    
}
