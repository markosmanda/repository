
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author marcos.españa
 */
public class Ejercicio_Secuencial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       
//        
//        double num1;
//        double num2;
//        double num3;
//        
//        System.out.print("Dime el primer valor: ");
//        num1=entrada.nextDouble();
//        
//        System.out.print("Dime el segundo valor: ");
//        num2=entrada.nextDouble();
//        
//        System.out.print("Dime el tercer valor: ");
//        num3 = entrada.nextDouble();
//
//        double media = (num1 + num2 + num3) / 3;
//
//        System.out.println("La media de los tres valores es: " + media);
//
//        System.out.printf("la media de los 3 valores es:%.2f\n", media);

//          int base;
//          int altura;
//          
//          System.out.print("Dime la base: ");
//          base=entrada.nextInt();
//          System.out.print("Dime la altura: ");
//          altura=entrada.nextInt();
//          
//          int perimetro = (base*2)+ (altura*2);
//          int area = (base*altura);
//          
//          System.out.println("El perimetro del rectangulo es: "+perimetro);
//          System.out.println("El area del rectangulo es: "+area);

//            double porcentaje=0.15;
//            double precio;
            
            
            
//            System.out.print("Introduce el precio del producto: ");
//            precio = entrada.nextDouble();
//            
//            double resto = (precio*porcentaje);
//            System.out.print("El descuneto es de: "+resto);
//            Scanner entrada = new Scanner(System.in);
//
//            double fahrenheit ;
//            double celsius;
//            
//            System.out.print("Introduce los grados Fahrenheit: ");
//            fahrenheit = entrada.nextDouble();
//            
//            celsius=((fahrenheit-32)*5/9);
//            System.out.print(fahrenheit+" fahrenheit son "+celsius+ " Celsius");
//            System.out.println("");
//            

               Scanner entrada = new Scanner(System.in);
               
               
//               double calificaciones=0.55/3;
//               double calificaciones1;
//               double calificaciones2;
//               double calificaciones3;
//               double porcentajeParciales=0.30;
//               double examenFinal;
//               double porcentajeTrabajo=0.15;
//               double trabajoFinal;
//               
//               System.out.print("Introduce las notas de las calificaciones 1: ");
//               calificaciones1 = entrada.nextDouble();
//               System.out.print("Introduce las notas de las calificaciones 2: ");
//               calificaciones2 = entrada.nextDouble();
//               System.out.print("Introduce las notas de las calificaciones 3: ");
//               calificaciones3 = entrada.nextDouble();
//               
//               double resultadoCalificaciones = (calificaciones1+calificaciones2+calificaciones3)*calificaciones;
//               
//               
//               System.out.print("Introduce la nota del examen final: ");
//               examenFinal = entrada.nextDouble();
//               double resultadoExamenes = porcentajeParciales*examenFinal;
//               
//               
//               System.out.print("Introduce la nota del trabajo final: ");
//               trabajoFinal = entrada.nextDouble();
//               double resultadoTrabajos = trabajoFinal*porcentajeTrabajo;
//               
//               
//               double resultadoFinal= (resultadoCalificaciones+resultadoExamenes+resultadoTrabajos);
//               
//               System.out.print("La nota final es: "+resultadoFinal);
//               System.out.println("");
               
//               double sueldoBase;
//               double venta1;
//               double venta2;
//               double venta3;
//               
//               System.out.print("El sueldo base es: ");
//               sueldoBase = entrada.nextDouble();
//               
//               System.out.print("precio de la venta 1: ");
//               venta1 = entrada.nextDouble();
//               
//               System.out.print("el precio de la venta 2: ");
//               venta2 = entrada.nextDouble();
//               
//               System.out.print("el precio de la venta 3: ");
//               venta3 = entrada.nextDouble();
//               
//               double resultadoVentas = venta1*0.10+venta2*0.10+venta3*0.10;
//               double resultadoFinal = sueldoBase+resultadoVentas;
//               
//               System.out.print("su sueldo fianl es: "+resultadoFinal);
               

//                 double A;
//                 double B;
//                 
//                 
//                 
//                 System.out.print("Introduce el valor de A: ");
//                 B = entrada.nextDouble();
//                 
//                 System.out.print("Introduce el valor de B: ");
//                 A = entrada.nextDouble();
//                 
//                 Double Aux = A;
//                 
//                 double resultado = B+Aux;
//                 
//                
//                 
//                 System.out.print("El resultado final es: "+resultado);
//                 System.out.println(" ");
//                 System.out.print("La variable A es: "+A);
//                 System.out.println("");
//                 System.out.print("la variable B es: "+B);
//                 System.out.println("");


//                   int num;
//
//                   System.out.print("Introduce el numero: ");
//                   num = entrada.nextInt();
//                   
//                   
//                   int num1 = num%10;
//                   int num2 = num/10;
//                   
//                   
//                   System.out.print("El numero invertido es: "+num1+num2);
//                   System.out.println("");
//                   
                     int euro;
                     int euro2;
                     int cent50;
                     int cent10;
                     int cent20;
                             
                     System.out.print("Monedas de 1 euro: ");    
                     euro= entrada.nextInt();
         
//                     int resueuro = euro*1;
                     
                     System.out.print("Monedas de 2 euros: ");
                     euro2 = entrada.nextInt();
                     
//                     int resueuro2 = euro2*2;
                     
                     System.out.print("Monedas de 50 centimos: ");
                     cent50 = entrada.nextInt();
                     
//                     int resucent50 = cent50*50;
                     
                     System.out.print("monedas de 20 centimos: ");
                     cent20 = entrada.nextInt();
                     
//                     int resucent20 = cent20*20;
                     
                     
                     System.out.print("monedas de 10 centimos: ");
                     cent10 = entrada.nextInt();
                     
//                     int resucent10 = cent10*10;
                     
                     int resultadoeuros = euro*1+euro2*2;
                     int resultadocentimos = cent50*50+cent20*20+cent10*10;
                     
                     System.out.print("en total tiene: "+resultadoeuros+" euros y "+resultadocentimos+" centimos");
                     System.out.println("");
////                     
//
//                        String nombre;
//                        String apellido1;
//                        String apellido2;
//                        
//                        System.out.print("Introduce tu nombre");
//                        nombre = entrada.next();
//                        
//                        System.out.print("Introduce el primer apellido");
//                        apellido1 = entrada.next();
//                        
//                        System.out.print("Introduce el segundo apellido");
//                        apellido2 = entrada.next();
//                        
//                        char = nombre.charAt;
//                     
                     
                     
                    
                    
                 
                 
               
               
               
                  
            
            
            
            
            
            
            



            


          
          
          
        
        
        
    }
    
}
