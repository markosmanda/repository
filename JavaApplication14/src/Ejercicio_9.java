/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author marcos.españa
 */
public class Ejercicio_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase = "El rock mola siempre";
        frase=frase.toUpperCase();
        char frase1;
       
        
        for (int i=0;i<frase.length();i++){
           System.out.print( frase.replace('I', '1').replace('O', '0').charAt(i));
        }System.out.println("");
            
        }
    }
    

