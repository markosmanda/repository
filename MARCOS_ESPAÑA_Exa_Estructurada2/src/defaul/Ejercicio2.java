/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package defaul;

import java.util.Scanner;

/**
 *
 * @author marcos.españa
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        String frase="";
        
        System.out.println("Ejercicio2 - Contraseñas");
        System.out.println("=========================================");
        
        System.out.print("Dime una frase: ");
        frase = entrada.nextLine();
        String contraseña= generarContraseña(frase);
        System.out.println("La contraseña es: "+contraseña);
        
    }
    
    
    
    public static String generarContraseña(String cadena){
        String contraseña = "";
        cadena.trim();
        char [] array = {'+','$','@','!','#'};
        int numdelarray = (int)(Math.random()*(5));
        
        contraseña=contraseña+cadena.toUpperCase().charAt(0);
        for (int i=1;i<cadena.length();i++){
            if (cadena.charAt(i-1)==' '){
                contraseña=contraseña+cadena.charAt(i);
            }
        }
        int num=(int)(Math.random()*10);
        contraseña=contraseña+array[numdelarray]+num;
        return contraseña;
    }
        
    }
    

