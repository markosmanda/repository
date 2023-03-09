/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo0;

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
        Persona persona1=new Persona();
        
        persona1.setNombre("Alicia");
        persona1.setEdad(44);
        persona1.setDNI("12345678A");
        
        System.out.println("Objeto persona1 ");
        System.out.println("============================");
        System.out.println("nombre: "+persona1.getnombre());
        System.out.println("edad: "+persona1.getEdad());
        System.out.println("DNI: "+persona1.getDNI());
        
    }
    
}
