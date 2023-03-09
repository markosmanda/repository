/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_extra;

import java.util.Scanner;

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
        int palabras=0;
        String palabra;
//        char iniciales=' ';
        String finalletra="";
        String resultadoiniciales="";
        String cambiarletra="";
        System.out.print("La frase cuantas palabras tendra : ");
        palabras=Integer.parseInt(entrada.nextLine());
        for (int i=1;i<=palabras;i++){
            System.out.print("Escribe la palabra"+i+": ");
            palabra=entrada.next();
            char iniciales=palabra.charAt(0);
            resultadoiniciales=resultadoiniciales+iniciales;
            char ultimo = palabra.charAt(palabra.length()-1);
            finalletra=finalletra+ultimo;
            cambiarletra=palabra.replace(iniciales, ultimo).replace(ultimo, iniciales);
        }
        System.out.println("Las iniciales son: "+resultadoiniciales);
        System.out.println("Las iniciales son: "+finalletra);
        System.out.println(cambiarletra);
        
    }
    
}
