/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author marcos.españa
 */
public class Ejercicio_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase = "Alicia tiene 35 años";

        int primerespacio = 0;
        int segundoespacio = 0;
        int tercerespacio = 0;
        int contadorespacios = 0;
        boolean espacios = false;

        for (int i = 0; i < frase.length(); i++) {

            if (frase.charAt(i) == ' ') {

                contadorespacios++;
                primerespacio = i;
            }
            if (primerespacio > 1) {
                espacios = false;
                break;
            }

        }

        espacios = true;
        contadorespacios = 0;
        System.out.print(frase.substring(0, primerespacio));
        for (int i = primerespacio + 1; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
//                System.out.println("Cuenta espacios");
                contadorespacios++;
                segundoespacio = i;

            }
            if (contadorespacios >= 1) {
                espacios = false;
                break;
            }

        }

        contadorespacios = 0;
        espacios = true;
        for (int i = segundoespacio + 1; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                contadorespacios++;
                tercerespacio = i;
            }
            if (contadorespacios > 1) {
                espacios = false;
                break;
            }
        }
        System.out.println(frase.substring(segundoespacio, tercerespacio));

    }
}
