/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio2;

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
        cubo cubo1 = new cubo (5);
        System.out.println("El cubo ha sido creado");
        cubo1.mostrar();
        cubo1.rellenar(4);
        System.out.println("Se rellena el cubo");
        cubo1.pintar();
        cubo1.rellenar(2);
        cubo1.pintar();
        System.out.println("Vaciar cubo");
        cubo1.vaciar();
        cubo1.pintar();
    }
    
}
