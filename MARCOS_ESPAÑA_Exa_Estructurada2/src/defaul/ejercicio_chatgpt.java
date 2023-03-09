/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package defaul;

/**
 *
 * @author marcos.españa
 */
public class ejercicio_chatgpt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] array = new int [5][1];

  
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[0].length;j++){
                array[i][j]=(int)(Math.random()*(10));
                System.out.print(array[i][j]);
            }
            System.out.println("");
        }
        
        int max=array[0][0];
        int min=array[0][0];
        
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[0].length;j++){
                if (array[i][j]>max){
                    max = array[i][j];
                }
                if (array[i][j]<=min){
                    
                    min = array[i][j];
                    
                }
            }
        }
        System.out.println("El maximo es: "+max);
        System.out.println("El minimo es: "+min);
        
        //Calcular media 
        int numNumeros = array.length*array[0].length;
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[0].length;j++){
            
            }
         
        }
        
            }
        
    }
    

