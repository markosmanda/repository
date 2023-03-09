/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_6;

import java.util.Scanner;

/**
 *
 * @author marcos.españa
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static Scanner entrada=new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        Ferreteria ferreteria=new Ferreteria("Pepito");
        int opcion=0;
        ferreteria.addProducto("Pilas_alcalinas", 2.0, 20);
        ferreteria.addProducto("Destornillador", 5.0, 20);
        ferreteria.addProducto("Sarten", 35.0, 20);
        ferreteria.addProducto("Bomnbilla", 5.0, 5);
        
        
        do{
        
        System.out.printf("--- Ferreteria %s ---\n",ferreteria.getNombre());
        System.out.println("1. Nueva venta");
        System.out.println("2. Listado de ventas");
        System.out.println("3. Gestión de almacen: ");
        System.out.println("4. Salir");
        do{
        System.out.print("Introduce una opcion: ");
        opcion=Integer.parseInt(entrada.nextLine());
        }while(opcion<1||opcion>3);
        switch (opcion){
            case 1:
                ferreteria.listarProductos();
                break;
            case 2:
                ferreteria.listarProductos();
                break;
            case 3:
                break;
            case 4:
                System.out.println("Saliendo...");
                break;
        }
        
    }while(opcion!=4);
        }
    public void nuevaVenta(Ferreteria ferreteria){
        System.out.println("Introduce ");
    }
    
}
