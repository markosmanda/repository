/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1bien;

/**
 *
 * @author marcos.españa
 */
public class Bicicleta {
     private int revoluciones;
    private int piñonactual;
    private final String propietario;

    public Bicicleta(String propietario) {
    
    
        piñonactual = 3;
        revoluciones = 0;
        this.propietario = propietario;
    }
    

    public void pedalear() {
        if (revoluciones == 0) {
            this.revoluciones = 1;
        } else {
            this.revoluciones = revoluciones * 2;
        }
    }

    public void frenar() {
        if (revoluciones == 1) {
            this.revoluciones = 0;
        } else {
            this.revoluciones = revoluciones / 2;
        }
    }

    public void cambiarpiñon(int piñonactual) {
        this.piñonactual = piñonactual;
        if (piñonactual > 5 || piñonactual < 1) {
            System.out.println("El piñon es Erroneo");
        }

    }

    public void mostrarvelocidad() {
        switch (this.piñonactual) {
            case 1:
                System.out.println("La velocidad de la bici de " + propietario + " es: " + revoluciones * 2);
                break;
            case 2:
                System.out.println("La velocidad de la bici de " + propietario + " es: " + revoluciones * 1.5);
                break;
            case 3:
                System.out.println("La velocidad de la bici de " + propietario + " es: " + revoluciones * 1);
                break;
            case 4:
                System.out.println("La velocidad de la bici de " + propietario + "  es: " + revoluciones * 0.5);
                break;
            case 5:
                System.out.println("La velocidad de la bici de " + propietario + " es: " + revoluciones * 0.3);
                break;

        }

    }

    public String getPropietario() {
        return propietario;
    }

    public double obtenervelicidad() {
        double velocidad = 0;
    
    switch (this.piñonactual) {
        case 1:
            velocidad = this.revoluciones * 2;
            break;
        case 2:
            velocidad = this.revoluciones * 1.5;
            break;
        case 3:
            velocidad = this.revoluciones * 1;
            break;
        case 4:
            velocidad = this.revoluciones * 0.5;
            break;
        case 5:
            velocidad = this.revoluciones * 0.3;
            break;

            
    }
    return velocidad;
    
}
}
