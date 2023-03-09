/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo0;

/**
 *
 * @author marcos.españa
 */
public class Persona {
    private String nombre;
    private int edad;
    private String DNI;
    
    
    //Constructor por defecto o vacio
    public Persona (){
        
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
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    
    }
    

