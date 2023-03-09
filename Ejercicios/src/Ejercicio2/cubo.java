/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author marcos.españa
 */
public class cubo {
    private int contenido;
    private final int capacidadMax;
    public cubo(int capacidadMax){
    this.capacidadMax=capacidadMax;
    this.contenido=0;
    
    
}
    public void mostrar(){
        for (int i=0;i<capacidadMax;i++){
            System.out.println("*       *");
        }
           System.out.println("*********"); 
    }
    public void llenar (){
        this.contenido=this.capacidadMax;
        
    }
    public void vaciar (){
        contenido=0;
        
    }
    public void rellenar (int litros){
        
        if (contenido+litros<capacidadMax){
            contenido=contenido+litros;
            
        }
        else{
            System.out.println("Se ha desbordado");
            
        }
        
    }public void pintar (){
        int vacio=capacidadMax-contenido;
        for (int i=0;i<vacio;i++){
           System.out.println("*       *");
        }
            
        for (int i=0;i<contenido;i++){
           System.out.println("*-------*");
        }
           System.out.println("*********"); 
            
            
        }
    }
    
    
    

