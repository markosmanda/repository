
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author marcos.españa
 */
public class fechas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        LocalDate fecha=null;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        do{
           System.out.println ("Dime una fecha (dd/mm/aaaa): ");
           String fecha_teclado=entrada.nextLine();
           
           try{
               fecha = LocalDate.parse(fecha_teclado, dtf);
               break;
               
           } catch (Exception ex){
               System.out.println("Datos de la excepcion: "+ex);
               System.out.println("Error de la fecha.");
           }
       }while(true);
        System.out.println("fecha introducida: "+fecha.format(dtf));
        }
    
}

