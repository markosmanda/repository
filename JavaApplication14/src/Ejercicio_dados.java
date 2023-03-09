/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author marcos.españa
 */
public class Ejercicio_dados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dados=0;
        int dados2=0;
        int contador=1;

        boolean acierto=false;
        do{
            System.out.println("Intento "+contador);
            System.out.println("=================================");
        dados=(int)(Math.random() * 150000);
        dados2=(int) (Math.random()* 150000);
            System.out.println("el dado 1 es: "+dados+" y el dado 2 es: "+dados2);
            
            if (dados==dados2){
                acierto=true;
                System.out.println("Acierto");
                break;
            } if (dados!=dados2){
                System.out.println("error");
                contador++;
            }
        }while (acierto==false);
    }
    
}
