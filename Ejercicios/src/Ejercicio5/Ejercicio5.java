/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio5;

import java.util.Scanner;

/**
 *
 * @author marcos.españa
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        int cambiarPropietario = 0;
        int totalCasas = 0;
        String opcionCambiarPropietario = "";
        Scanner entrada = new Scanner(System.in);
        Casa[] lista = new Casa[50];

        lista[Casa.getContadorCasas()] = new Casa("Juan", 30, 45, 120000);;

        lista[Casa.getContadorCasas()] = new Casa("Pedro", 120, 0, 100000);

        lista[Casa.getContadorCasas()] = new Casa("Alicia", 70, 70, 150000);

        for (int i = 0; i < Casa.getContadorCasas(); i++) {
            lista[i].imprimirDatos();
        }

        int opcion = 0;
        int planta1 = 0;
        int planta2 = 0;
        int precioVenta = 0;
        String nuevoPropietario;
        do {
            System.out.println("======================");
            System.out.println("Menu Casas");
            System.out.println("======================");
            System.out.println("1. Añadir Casas");
            System.out.println("2. Listar casas");
            System.out.println("3. Cambiar Datos");
            System.out.println("4. Salir");

            System.out.print("Introduce opcion: ");

            opcion = Integer.parseInt(entrada.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("=== ALTA NUEVA CASA ===");
                    System.out.print("Nuevo propietario: ");
                    nuevoPropietario = entrada.nextLine();
                    System.out.print("Superficie PLANTA 1: ");
                    planta1 = Integer.parseInt(entrada.nextLine());
                    System.out.print("Superficie PLANTA 2: ");
                    planta2 = Integer.parseInt(entrada.nextLine());
                    System.out.print("Precio de Venta: ");
                    precioVenta = Integer.parseInt(entrada.nextLine());
                    lista[Casa.getContadorCasas()] = new Casa(nuevoPropietario, planta1, planta2, precioVenta);
                    break;
                case 2:
                    System.out.println("=== LISTADO CASA ====");
                    for (int i = 0; i < Casa.getContadorCasas(); i++) {

                        System.out.print("Casa " + (i + 1) + "-->       ");
                        lista[i].imprimirDatos();
                    }
                    break;
                case 3:do{
                    System.out.print("Elige la casa de la que quieres cambiar los datos: ");
                    cambiarPropietario = Integer.parseInt(entrada.nextLine());
                }while(cambiarPropietario>Casa.getContadorCasas());
                   

                        System.out.print("Casa " + (cambiarPropietario) + "-->       ");
                        lista[(cambiarPropietario-1)].imprimirDatos();

                    
                    System.out.println("");
                    do{
                    System.out.print("Que quieres cambiar [propietario|superficie|precio|: ");
                    opcionCambiarPropietario = entrada.nextLine().toLowerCase();
                    

                    if (opcionCambiarPropietario.equals("propietario")) {
                        System.out.print("Introduce un nuevo Propietario: ");
                        nuevoPropietario = entrada.nextLine();
                        lista[cambiarPropietario-1].setPropietario(nuevoPropietario);
                        break;
                    }
                    if (opcionCambiarPropietario.equals("superficie")) {
                        System.out.print("Introduce la superficie de la planta 1: ");
                        planta1 = Integer.parseInt(entrada.nextLine());
                        lista[cambiarPropietario-1].setPlanta1(planta1);
                        System.out.print("Introduce la superficie de la planta 2: ");
                        planta2 = Integer.parseInt(entrada.nextLine());
                        lista[cambiarPropietario-1].setPlanta2(planta2);
                        break;
                        

                    }
                    if (opcionCambiarPropietario.equals("precio")) {
                        System.out.print("Introduce el precio: ");
                        precioVenta = Integer.parseInt(entrada.nextLine());
                        lista[cambiarPropietario-1].setPrecioVenta(precioVenta);
                        break;
                        
                    }
                    }while(!opcionCambiarPropietario.equals("propietario")||!opcionCambiarPropietario.equals("superficie")||!opcionCambiarPropietario.equals("precio"));
                    
                        break;
                
                case 5:
                        System.out.println("Saliendo");
                        break;
                default:
                    System.out.println("La opción es erronea");
                    break;

            }
            System.out.println("");
        } while (opcion != 4);

    }
}
