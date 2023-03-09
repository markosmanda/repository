
import java.util.Scanner;
import Utilidades.Utilidades;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author marcos.españa
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        String nombre, email;
        
        
        
        Persona [] lista = new Persona[10];
        
        for (int i=0;i<3;i++){
            System.out.print("Dime tu nombre: ");
            nombre=teclado.nextLine();
            do{
            System.out.print("Dime el email: ");
            email=teclado.nextLine();
                if(Utilidades.checkEmail(email)==false){
                    
                    
                }
            
            
        }while(Utilidades.checkEmail(email)==false);
            
            
            Persona p = new Persona (nombre, email);
            lista[Persona.getContadorPersonas()-1]=p;
            System.out.println("=================== añadida. "+Persona.getContadorPersonas()+" en la lista");
        
    }
        for (int i=0;i<Persona.getContadorPersonas();i++){
        lista[i].imprimirDatos();
        }
      
    }
}
    

