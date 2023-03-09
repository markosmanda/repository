/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package defaul;

import java.util.Scanner;

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
        Scanner entrada = new Scanner (System.in);
        int [] array = {5,2,3,9,7};
        int [] copiaArray = new int [array.length];
        for (int i=0;i<array.length;i++){
           copiaArray[i]=array[i];
            
        }
        
        ordenarArray(array, copiaArray);
        


        
    }public static void ordenarArray(int array[], int copiaArray[]){
        int []arrayascendente= ordenarascendente(array);
        int []arraydescendente= ordenardescendente(copiaArray);
        System.out.println("Imprimir array");
        System.out.println("=============================");
            System.out.print("Array sin ordenar: ");
            for (int i=0;i<array.length;i++){
                System.out.print(array[i]);
            }
            System.out.println("");

        

            System.out.print("Orden ascendente: ");
            for (int i=0;i<arrayascendente.length;i++){
                System.out.print(arrayascendente[i]);
            }
            
            System.out.println("");
            
            
            System.out.print("Array descendente: ");
            for (int i=0;i<arraydescendente.length;i++){
                System.out.print(arraydescendente[i]);
            }
            System.out.println("");

        }
    
    public static int []ordenarascendente(int [] array){
        int []arraynuevo=new int [array.length];
        
        for (int i=0;i<arraynuevo.length;i++){
            arraynuevo[i]=array[i];
        }
        for (int x=0;x<arraynuevo.length;x++){
            for (int i=0;i<arraynuevo.length-1;i++){
            if (arraynuevo[i]>arraynuevo[i+1]){
                int tmp= array[i+1];
                arraynuevo[i+1] = arraynuevo[i];
                arraynuevo[i]=tmp;
                
            }
            
        }
    }
        return arraynuevo;
    
    }
    public static int []ordenardescendente(int [] copiaarray){
        
        for (int x=0;x<copiaarray.length;x++){
            for (int i=0;i>copiaarray.length-1;i++){
            if (copiaarray[i]>copiaarray[i+1]){
                int tmp= copiaarray[i+1];
                copiaarray[i+1] = copiaarray[i];
                copiaarray[i]=tmp;
                
            }
            
        }
    }
        return copiaarray;
    
    }
    
    
    
      
    }
    

