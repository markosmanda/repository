/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejemplo3;

/**
 *
 * @author marcos.españa
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p1 = new Persona ("Elmarkosmanda", 25);
        System.out.println("Personas creadas: "+Persona.getContadorPersonas());
        Persona p2 = new Persona ("Sigomandando", 18);
        System.out.println("Personas creadas: "+Persona.getContadorPersonas());
        Persona p3 = new Persona ("Seguiremandando", 20);
        System.out.println("Personas creadas: "+Persona.getContadorPersonas());
        
        
        
    }
    
}
