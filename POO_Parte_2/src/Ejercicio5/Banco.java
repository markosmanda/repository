/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

import java.util.ArrayList;

/**
 *
 * @author marcos.españa
 */
public class Banco {
    private ArrayList<Persona> listaClientes;
    private ArrayList<Cuenta_corriente> listaCuentas;
    private String nombre;

    public Banco(String nombre) {
        this.listaClientes = new ArrayList();
        this.listaCuentas = new ArrayList();
        this.nombre = nombre;
    }
    
    public void addCliente(String dni, String nombre, String apellido1, String email){
        listaClientes.add(new Persona(dni, nombre, apellido1, email));
        
    }
    public void addCuenta(Persona p, Double saldo){
        listaCuentas.add(new Cuenta_corriente(p, saldo));
        
    }
    public void listarClientes(){
        System.out.println("--- Listado de clientes ---");
        for (Persona p : listaClientes) {
            System.out.println(p);
            
        }
        System.out.println("---------------------------");
        
    }
    public void listarCuentasCliente(Persona p){
        System.out.println("--- Listado de Cuentas corrientes ---");
        for(Cuenta_corriente cuenta :listaCuentas){
            if(cuenta.getPersona().getDni().equalsIgnoreCase(p.getDni())){
            
            System.out.println(cuenta.mostrar_cuenta());
            
            
        }
        
    }
        System.out.println("-------------------------------------");
            }
                
            
   public void listarCuentas(){
       for (Cuenta_corriente cuenta : listaCuentas) {
           System.out.println(cuenta.aCadena());
           
       }
   }
   
       
   
            
        
        
    public Cuenta_corriente seleccionarCuenta(int numero){
       
        for (Cuenta_corriente cuenta : listaCuentas) {
            if(cuenta.getNumero()==numero){
                return cuenta;
            }
            
            
        }
        return null;
    }
    public Cuenta_corriente seleccionarCuenta(String dni){
       
        for (Cuenta_corriente cuenta : listaCuentas) {
            if(cuenta.getPersona().getDni().equalsIgnoreCase(dni)){
                return cuenta;
            }
            
            
        }
        return null;
    }
    public void mostrarCuentasClientes(Persona p){
        for (Cuenta_corriente cuenta : listaCuentas) {
            if(cuenta.getPersona().equals(p)){
                System.out.println(cuenta.mostrar_cuenta());
            }
        }
        
    }
    public Persona seleccionarCliente(String dni){
          for (Persona p : listaClientes) {
              if(p.getDni().equalsIgnoreCase(dni)){
                  return p;
              }
              
          }
          return null;
    }

    public ArrayList<Persona> getlistaClientes() {
        return listaClientes;
    }

    public void setlistaClientes(ArrayList<Persona> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public ArrayList<Cuenta_corriente> getlistaCuentas() {
        return listaCuentas;
    }

    public void setlistaCuentas(ArrayList<Cuenta_corriente> listaCuentas) {
        this.listaCuentas = listaCuentas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
    
    
    
    
    
    
    
}
