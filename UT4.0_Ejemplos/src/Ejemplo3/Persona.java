/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo3;

/**
 *
 * @author marcos.españa
 */
public class Persona {
    private String nombre;
    private int edad;
    private static int contadorPersonas=0;
    
    public Persona(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
        Persona.contadorPersonas++;
        
    }
    public static int getContadorPersonas(){
        return Persona.contadorPersonas;
        
    }
}
