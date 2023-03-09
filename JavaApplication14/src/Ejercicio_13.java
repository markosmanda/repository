/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author marcos.españa
 */
public class Ejercicio_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase="hola suprimo";
        String frasecifrada="";
        String descifrada="";
        
        for (int i=0;i<frase.length();i++){
            
                int caracter = (int) frase.charAt(i);
                caracter++;
                frasecifrada=frasecifrada+Character.toString(caracter);
            
        }
        System.out.println("La frase \""+frase+"\" cifrada es: "+frasecifrada);
        
        for (int i=0;i<frasecifrada.length();i++){
            int caracter = (int) frasecifrada.charAt(i);
            caracter--;
            descifrada=descifrada+Character.toString(caracter);
        }
        System.out.println("La frase \""+frasecifrada+" descifrada es: "+descifrada);
    }
    
}
