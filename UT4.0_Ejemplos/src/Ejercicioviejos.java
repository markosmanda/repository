/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author marcos.españa
 */
public class Ejercicioviejos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [][] array = {{"Pepe","Juan","Marta","Alicia","Lei"},{"30","35","35","20","18"}};
        
        int edadMax = Integer.parseInt(array[1][0]); 
        
        int numeroEdadMax = 1;
        
        for (int i = 1 ; i < array[0].length; i++){
            int dato = Integer.parseInt(array[1][i]);
            
            if (dato > edadMax) {
                edadMax = dato; 
                numeroEdadMax = 1;
            } else if (dato == edadMax) {
                numeroEdadMax++; 
            }
        }
        
        System.out.println("edadMax= "+edadMax);
        
        String [] nombres = new String[numeroEdadMax]; 
        //Para meter el nombre en la posicion correspondiente del array nombres
        int contador = 0; 
        
        for (int i = 0; i < array[0].length;i++) {
            int dato = Integer.parseInt(array[1][i]);
            
            if (dato == edadMax) {
                nombres[contador] = array[0][i];
                contador++;
            }
        }
        
        for (int i = 0; i < numeroEdadMax ; i++) {
            System.out.println(nombres[i]);
        }
        
    }
    
}
