/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package defaul;

/**
 *
 * @author marcos.españa
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [][] datos = {{"Pepe","Juan","Marta","Alba","Leo"},{"30", "35", "35", "20","18"}};
        
        System.out.println("Ejercicios Mayores");
        System.out.println("================================");
        int max=0;
        
       
        for (int i=0;i<5;i++){
            
            for (int j=0;j<5;j++){
                System.out.println(datos[i][j]);
            }
        }
          
        

    }
    
}
