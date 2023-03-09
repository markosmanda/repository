
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author marcos.españa
 */
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String opcion;
        boolean si = true;
        System.out.println("Recogiendo un char por teclado");
        System.out.println("==========================================");

        do {
            System.out.print("¿Quieres continuar [S | N ]: ");
            opcion = entrada.next().toLowerCase();

            if (opcion.charAt(0) == 'n') {

                si = false;
                break;
            }else if(opcion.charAt(0)!='s'||opcion.charAt(0)!='n'){
                System.out.println("Caracter no valido");
                
            }

        } while (si == true);
    }
}
