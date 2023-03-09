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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        Banco banco = new Banco("BBVA");
        int opcion;
        do {
            System.out.println("Menu Principal");
            System.out.println("*************************************");
            System.out.println("1. Nuevo Cliente");
            System.out.println("2. Seleccionar cliente");
            System.out.println("3. Listar todas las cuentas");
            System.out.println("4. Listar todos los clientes");
            System.out.println("5. Salir");
            do {
                System.out.print("Introduce una opción: ");
                opcion = Integer.parseInt(entrada.nextLine());
            } while (opcion < 1 || opcion > 5);
            switch (opcion) {
                case 1:
                    System.out.print("Introduce el dni: ");
                    String dni = entrada.nextLine();

                    System.out.print("Introduce su nombre: ");
                    String nombre = entrada.nextLine();

                    System.out.print("Introduce el apellido1: ");
                    String apellido1 = entrada.nextLine();

                    System.out.print("Introduce el email: ");
                    String email = entrada.nextLine();

                    banco.addCliente(dni, nombre, apellido1, email);
                    break;
                case 2:
                    System.out.print("Introduce el dni: ");
                    dni = entrada.nextLine();
                    if(banco.seleccionarCliente(dni)==null){
                        System.out.println("No existe un cliente con este id: ");
                    }
                    else{
                    Persona auxiliar = banco.seleccionarCliente(dni);

                    submenu(auxiliar, banco);
                        
                    }
                    
                    break;
                case 3:
                    banco.listarCuentas();
                    break;
                case 4:
                    banco.listarClientes();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
            }
        } while (opcion != 5);

    }

    private static void submenu(Persona p, Banco banco) {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menu Cliente");
            System.out.println("*************************************");
            System.out.printf("%s %s  \n", p.getNombre(), p.getApellido1());
            System.out.printf("%s \n", p.getDni());
            System.out.printf("%s \n", p.getEmail());

            System.out.println("Cuenta          Saldo");
            banco.listarCuentasCliente(p);
            System.out.println("*************************************");
            System.out.println("");
            System.out.println("1. Abrir cuenta");
            System.out.println("2. Ingreso");
            System.out.println("3. Reintegro");
            System.out.println("4. Transferencia");
            System.out.println("5. Salir");
            do {
                System.out.print("Introduce una opcion: ");
                opcion = Integer.parseInt(entrada.nextLine());
            } while (opcion < 1 || opcion > 5);
            switch (opcion) {
                case 1:
                    System.out.print("Introduce el saldo inicial; ");
                    Double saldo = Double.parseDouble(entrada.nextLine());
                    banco.addCuenta(p, saldo);
                    break;
                case 2:
                    banco.listarCuentasCliente(p);

                    System.out.print("Introduce el numero de la cuenta en la que realizar el ingreso: ");
                    int numero = Integer.parseInt(entrada.nextLine());
                    if (banco.seleccionarCuenta(numero) == null) {
                        System.out.println("Cuenta erronea");
                    } else {
                        System.out.print("Introduce la cantidad de dinero a ingresar: ");
                        int cantidad = Integer.parseInt(entrada.nextLine());
                        banco.seleccionarCuenta(numero).ingreso(cantidad);
                    }

                    break;
                case 3:
                    banco.listarCuentasCliente(p);
                    int cantidad = 0;

                    System.out.print("Introduce el numero de la cuenta en la que realizar el reintegro: ");
                    numero = Integer.parseInt(entrada.nextLine());
                    if (banco.seleccionarCuenta(numero) == null) {
                        System.out.println("Cuenta erronea");
                    } else {
                        do {
                            System.out.print("Introduce la cantidad de dinero a reiterar: ");

                            cantidad = Integer.parseInt(entrada.nextLine());
                            
                            if (banco.seleccionarCuenta(numero).reintegro(cantidad)) {
                                
                                break;
                                
                            } else {
                                System.out.println("Saldo insuficiente");
                                
                            }
                        } while (banco.seleccionarCuenta(numero).reintegro(cantidad) == false);
                    }

                    break;
                case 4:
                    cantidad = 0;
                    banco.listarCuentas();
                    System.out.println("Introduce el numero de la cuenta de origen: ");
                    numero = Integer.parseInt(entrada.nextLine());
                    if (banco.seleccionarCuenta(numero) == null) {
                        System.out.println("Cuenta erronea");
                    } else {
                        Cuenta_corriente origen = banco.seleccionarCuenta(numero);
                        System.out.println("Introduce el numero de la cuenta de destino: ");
                        numero = Integer.parseInt(entrada.nextLine());
                        if (banco.seleccionarCuenta(numero) == null) {
                            System.out.println("Cuenta erronea");
                        } else {
                            Cuenta_corriente destino = banco.seleccionarCuenta(numero);
                            do {
                                System.out.print("Introduce la cantidad de dinero a transferir: ");
                                cantidad = Integer.parseInt(entrada.nextLine());
                                
                                if (origen.transferencia(destino, cantidad)) {
                                    
                                    break;
                                    
                                } else {
                                    System.out.println("Error, Saldo insuficiente");
                                    
                                }
                            } while (origen.transferencia(destino, cantidad) == false);

                        }

                    }

                    break;
                case 5:
                    System.out.println("Saliendo al menu principal");
                    break;
            }
        } while (opcion != 5);

    }

}
