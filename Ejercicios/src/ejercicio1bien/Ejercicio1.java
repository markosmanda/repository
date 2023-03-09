/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1bien;

/**
 *
 * @author marcos.españa
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bicicleta  mibici = new Bicicleta("Marcos");
        Bicicleta tubici = new Bicicleta("PEPITO");

        mibici.pedalear();
        mibici.pedalear();
        mibici.cambiarpiñon(2);
//        mibici.mostrarvelocidad();
        System.out.println("La velocidad de la bici de " + mibici.getPropietario() + " es: " + mibici.obtenervelicidad());

        tubici.pedalear();
        tubici.pedalear();
        tubici.pedalear();
        tubici.cambiarpiñon(6);
        tubici.pedalear();
        tubici.pedalear();
        tubici.pedalear();
        tubici.cambiarpiñon(5);
//        tubici.mostrarvelocidad();
        System.out.println("La velocidad de la bici de " +tubici.getPropietario() + " es: " + tubici.obtenervelicidad());

    }

}
    
    

