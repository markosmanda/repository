
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author marcos.españa
 */
public class Numeros_Primos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        int num1;
        int num2;
        System.out.print("Introduce el primer numero: ");
        num1=Integer.parseInt(entrada.nextLine());
        
        System.out.print("Introduce el segundo numero: ");
        num2=Integer.parseInt(entrada.nextLine());
        imprimirPrimos(num1, num2);
        
    }
    public static void imprimirPrimos(int num1, int num2){
        if(num1<0){
            num1=num1*(-1);
        }
        if (num2<0){
            num2=num2*(-1);
            
        }
        if (num1>num2){
            System.out.println("Los numeros primos entre "+num2+" y "+num1+" son: ");
            for (int i=num2;i<=num1;i++){
                if(esPrimo(i)){
                    System.out.println(i);
                }
            }
        }
        if (num2>num1){
            System.out.println("Los numeros primos entre "+num1+" y "+num2+" son: ");
            for (int i=num1;i<=num2;i++){
                if(esPrimo(i)==true){
                    System.out.println(i);
                }
            }
        }
    }
    public static boolean esPrimo(int num){
        int divisible=0;
        for (int i=2;i<num;i++){
            if (num%i==0){
                divisible++;
            }
        }
        if (divisible>0){
            return false;
        }
        return true;
    }
    
}
