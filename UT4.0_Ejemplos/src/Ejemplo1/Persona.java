/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo1;

import ejemplo0.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marcos.españa
 */
public class Persona {
    private String nombre;
    private int edad;
    private String DNI;
    private double altura;
    
    
    //Constructor por defecto o vacio
  

    public Persona(String nombre, int edad, String DNI, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.altura = altura;
    }

   public Persona(){
       
   }
   public Persona (Persona persona7){
       this.nombre = persona7.getnombre();
       this.edad = persona7.getEdad();
       this.DNI = persona7.getDNI();
       this.altura= persona7.getAltura();
   }

    
    
    public String getnombre(){
        return nombre;
    }
    public void setNombre (String nombre){
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad<=0){
            System.out.println("La edad no es correcta");
            this.edad = edad; 
        }else {
           this.edad = edad; 
        }
        
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        
        this.altura = altura;
    }
    
    
    
    public void imprimirDatos(){
        System.out.println("nombre: "+this.nombre);
        System.out.println("edad: "+this.edad);
        System.out.println("dni: "+this.DNI);
        System.out.println("altura: "+this.altura);
    
    }
    
    }
    

