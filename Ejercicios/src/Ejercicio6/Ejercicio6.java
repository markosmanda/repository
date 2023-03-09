/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio6;

import Ejercicio5.Casa;
import java.util.Scanner;

/**
 *
 * @author marcos.españa
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }public static void menu(){
        Scanner entrada = new Scanner(System.in);
        int opcion=0;
        Contacto[] lista = new Contacto[100];

        lista[Contacto.getContadorId()] = new Contacto("Juan", "Juan@manda.es", "760443340");;

        lista[Contacto.getContadorId()] = new Contacto("Marcos", "Marcos@manda.es", "875349332");;
        
            System.out.println("=================================");
            System.out.println("Contactos");
            System.out.println("=================================");
            System.out.println("1. Nuevo Contacto");
            System.out.println("2. Listar Contactos");
            System.out.println("3. Modificar Contactos");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion=Integer.parseInt(entrada.nextLine());
            
            switch (opcion){
                case 1:
                        break;
                    
                case 2:
                        break;
                case 3:
                        break;
                case 4:
                        break;
                default:
            }
            
            


        
    }
    
}
