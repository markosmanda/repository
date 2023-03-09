/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author marcos.españa
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase = "hombres y mujere tenemos los mismos derechos";

        if (frase.indexOf("mujeres")>=0){
            System.out.println("con indexof contiene la palabra mujeres");
        }else{
            System.out.println("con indexof No contiene la palabra mujeres");
        
        }if (frase.contains("mujeres")==true){
            System.out.println("con contains contiene la palabra mujeres");
        }else{
            System.out.println("con contains No contiene la palabra mujeres");
        }
    }
    
}
