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
public class Ejercicio1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        int numero =0;
        int numero2 =0;
        System.out.println("Ejercicio 1- Numeros primos");
        System.out.println("======================================================");
        
        System.out.print("Introduce un numero: ");
        numero = Integer.parseInt(entrada.nextLine());
        System.out.print("Introduce un segundo numero: ");
        numero2 = Integer.parseInt(entrada.nextLine());
        
        
        
       
        imprimirPrimos(numero,numero2);
    }
    
    
    public static void imprimirPrimos(int numero, int numero2){
        if (numero<0){
            numero=numero*(-1);
        }
        if (numero2<0){
            numero2=numero2*(-1);
        }

        System.out.println("Numeros primos entre "+numero+" y "+numero2+": ");
        for (int i=numero;i<=numero2;i++){
            
        if (esPrimo(i)){
            System.out.println(i);
        }
    }
        
        
    }
   

    public static boolean esPrimo(int num) {

        int contador = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                contador++;
            }
        }
        if (contador > 0) {
            return false;
        }
        return true;
    }

}
