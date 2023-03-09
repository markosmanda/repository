
import java.util.Scanner;

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
        Scanner entrada = new Scanner (System.in);
        int base;
        int expo;
        int resultado=0;
        int resultadoexponente=0;
        int contexponente=0;
        int prebase=0;
        
        
        System.out.println("Ejercicio3 - Calculo de potencias");
        System.out.println("==========================================");
        System.out.print("Dime la base: ");
        base=Integer.parseInt(entrada.nextLine());
        System.out.print("Dime el exponente: ");
        expo=Integer.parseInt(entrada.nextLine());
        
        resultado=base;
      
        for (int i=1;i<expo;i++){
           resultado=resultado*base; 
        }
        System.out.println(resultado);
        
    }
    
}
