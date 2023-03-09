
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author marcos.españa
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada= new Scanner (System.in);
        int base;
        int expo;
        int resultado=1;
        System.out.print("Dime la base: ");
        base = Integer.parseInt(entrada.nextLine());
        System.out.print("Dime el exponente; ");
        expo=Integer.parseInt(entrada.nextLine());
        
        for (int i=0;i<expo;i++){
            resultado=resultado*base;
        }
        System.out.println(resultado);
    }
    
}
