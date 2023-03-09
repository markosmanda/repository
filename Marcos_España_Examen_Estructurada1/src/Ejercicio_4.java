
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author marcos.españa
 */
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int lado;
        int sumalado = 0;
        System.out.println("Introduce el tamaño del cuadrado");
        lado = Integer.parseInt(entrada.nextLine());
        int[][] cuadrado = new int[lado][lado];
        for (int i = 0; i < cuadrado.length; i++) {
                            System.out.print(cuadrado[i]);
            for (int j = 0; j < cuadrado.length; j++) {
                            System.out.print(cuadrado[j]);

                cuadrado[i][j] = (int) (Math.random() * 9 + 1);
                

                sumalado = (sumalado + cuadrado[i][j] / 4);
            }

        }
        System.out.println("La suma del lado es: " + sumalado);

    }
}
