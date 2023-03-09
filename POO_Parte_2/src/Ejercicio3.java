
import java.time.LocalDate;
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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int opcion;

        Gestor gestor = new Gestor("Gesintic");
        gestor.addPuesto(80, "Impresora HP sala 1");

        System.out.println(gestor.getNombre());
        LocalDate FechaActual = LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println(FechaActual.format(dtf));
        do {
            gestor.listarIncidencias();

            System.out.println("1. Nueva incidencia");
            System.out.println("2. Resolver incidencia");
            System.out.println("3. Detalles de incidencia");
            System.out.println("4. Nuevo puesto");
            System.out.println("5. Salir");
            do {
                System.out.print("Introduce una opción: ");
                opcion = Integer.parseInt(entrada.nextLine());
            } while (opcion <= 0 || opcion > 5);
            switch (opcion) {
                case 1:
                    LocalDate fecha2;
                    System.out.print("Introduce el codigo del puesto: ");
                    int puesto = Integer.parseInt(entrada.nextLine());
                    System.out.print("Introduce la descripcion del problema: ");
                    String problema = entrada.nextLine();

                    while (true) {
                        System.out.print("Introduce una fecha: ");
                        String fecha = entrada.nextLine();
                        try {
                            fecha2 = LocalDate.parse(fecha, dtf);
                            break;
                        } 
                        catch (Exception e) {
                            System.out.println("El formato de la fecha no es valido");
                        }
                    }

                    gestor.addIncidencia(puesto, problema, fecha2);

                    break;

                case 2:
                    gestor.listarIncidencias();
                    System.out.print("Introduce el codigo de la incidencia: ");
                    int codIncidencia=Integer.parseInt(entrada.nextLine());
                    System.out.print("Cual ha sido la solución: ");
                    String resolucion=entrada.nextLine();
                    System.out.println("Introduce la fecha de resolucion: ");
                    String fecha = entrada.nextLine();
                        try {
                            fecha2 = LocalDate.parse(fecha, dtf);
                            break;
                        } 
                        catch (Exception e) {
                            System.out.println("El formato de la fecha no es valido");
                        }
                    gestor.resolverIncidencia(gestor.seleccionarIncidencia(codIncidencia), resolucion, FechaActual);
                    
                    
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    System.out.println("Saliendo");
                    break;

            }

            System.out.println("");
        } while (opcion != 5);

    }
}
