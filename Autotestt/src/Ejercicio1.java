
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
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
        Scanner entrada = new Scanner(System.in);

//        double pi=3.14;
        double radio;
        double area;

        System.out.println("Introduce el area del circulo");
        radio = Double.parseDouble(entrada.next());

        area = Math.PI * Math.pow(radio, 2);

        System.out.println("El area del circulo es: " + area);
    }

}
