/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marcos.españa
 */
public class Persona {
    private String nombre;
    private String email;
    private static int contadorPersonas=0 ;

    public Persona(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
        Persona.contadorPersonas++;
    }
    public void imprimirDatos(){
        System.out.println(this.nombre+"- "+this.email);
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }
    
    
    
}
