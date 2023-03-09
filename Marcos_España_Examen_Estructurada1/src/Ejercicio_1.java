/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author marcos.españa
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numeros = new int[10];

        int sumapares = 0;
        int cinco = 0;
        System.out.println("Array numeros: ");
        int menor=numeros[0];

        for (int i = 0; i <= 0; i++) {
            numeros[i] = (int) (Math.random() * 9 + 1);
            System.out.print("|" + numeros[i]);
            
            if (numeros[i] <= menor) {
                    menor = numeros[i];
                    
                }
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[i]<menor){
                    menor=numeros[i];
                }

                
                if (numeros[i] % 2 == 0) {
                    sumapares = sumapares + numeros[j];
                }
                if (numeros[j] == 5) {
                    cinco++;
                }
            }

            System.out.printf("|");

        }
        System.out.println("");
        System.out.println("MInimo: " + menor);
        System.out.println("Suma pares: " + sumapares);
        if (cinco > 0) {
            System.out.println("¿Aparece el numero 5?: Sí");
        } else {
            System.out.println("¿Aparece el numero 5?: No");
        }
    }

}
