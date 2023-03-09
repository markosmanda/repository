/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejemplo1;

import ejemplo0.*;

/**
 *
 * @author marcos.españa
 */
public class Ejemplo0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Me creo una persona
        Persona persona1 = new Persona ();
        
        persona1.setNombre("Alicia");
        persona1.setEdad(85);
        persona1.setDNI("12345678A");
        persona1.setAltura(1.75);
        
        System.out.println("Objeto persona1:  ");
        System.out.println("============================");
        
        System.out.println("nombre: "+persona1.getnombre());
        System.out.println("edad: "+persona1.getEdad());
        System.out.println("DNI: "+persona1.getDNI());
        System.out.println("altura: "+persona1.getAltura());
        System.out.println("");
        
        Persona persona2 = new Persona ("Antonio", 18, "3333333333a", 1.68);
        System.out.println("Objeto persona2:  ");
        System.out.println("============================");
        System.out.println("nombre: "+persona2.getnombre());
        System.out.println("edad: "+persona2.getEdad());
        System.out.println("dni: "+persona2.getDNI());
        System.out.println("altura: "+persona2.getAltura());
        
        Persona persona3 = new Persona(persona1);
        System.out.println("");
                
        System.out.println("Objeto persona3:  ");
        System.out.println("============================");
        persona3.imprimirDatos();
        
            
        }
        
    }
    

