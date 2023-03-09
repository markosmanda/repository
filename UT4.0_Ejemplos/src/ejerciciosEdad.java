/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author marcos.españa
 */
public class ejerciciosEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [][] array = {{"Pepe","Juan","Marta","Alicia","Lei"},{"35","35","35","20","18"}};
        
        int dato = Integer.parseInt(array[1][0]);
        int edadMax=dato;
        int contadorEdadMax=1;
        
        
        for (int i=1;i<array[1].length;i++){
            dato=Integer.parseInt(array[1][i]);
            if (dato>edadMax){
                edadMax=dato;
                contadorEdadMax=1;
                
            }else if (dato == edadMax){
               contadorEdadMax++; 
            }
            
        }
        String [] nombres = new String [contadorEdadMax];
        int contador =0;
        for (int i=0;i<array[1].length;i++){
            dato = Integer.parseInt(array[1][i]);
            if (dato==edadMax){
                nombres[contador]=array[0][i];
                contador++;
            }
        }
        System.out.println("La edad maxima es: "+edadMax);
        System.out.print("Los alumnos con mayor edad son ");
        if (contadorEdadMax>2){
            System.out.print(nombres[0]);
        for (int i=1;i<contadorEdadMax-1;i++){
            System.out.print(", "+nombres[i]);
        }
        System.out.print(" y "+nombres[contadorEdadMax-1]);
            System.out.println("");
    }
        else if (contadorEdadMax==2){
            
            System.out.println(nombres[0]+" y "+nombres[1]);
            
                
        }
        else{
            System.out.println(nombres[0]);
        }
    }
    
}
