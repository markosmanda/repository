/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author marcos.españa
 */
public class Persona {
    private String dni;
    private String nombre;
    private String apellido1;
    private String email;

    public Persona(String dni, String nombre, String apellido1, String email) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.email = email;
    }
    
    @Override
    public String toString(){
        return String.format("%-15s %-25s %-20s %-20s", this.dni, this.nombre, this.apellido1, this.email);
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
