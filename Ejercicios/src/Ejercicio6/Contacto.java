/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

import java.util.Scanner;

/**
 *
 * @author marcos.españa
 */
public class Contacto {
    private int id;
    private String nombre;
    private String email;
    private String telefono;
    private static int contadorId=0;

    public Contacto(String nombre, String email, String telefono) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        Contacto.contadorId++;
        this.id = contadorId;
    }

    public static int getContadorId() {
        return contadorId;
    }

    public static void setContadorId(int contadorId) {
        Contacto.contadorId = contadorId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public void mostrarContactos(int []listaContactos){
        int opcionContacto=0;
        Scanner entrada = new Scanner (System.in);
        System.out.print("¿Que contacto quieres modificar");
        opcionContacto=Integer.parseInt(entrada.nextLine());
        System.out.println("===== Lista de Contactos =====");
        System.out.println("ID      NOMBRE      EMAIL       TELEFONO");
        
            System.out.println(listaContactos[opcionContacto]+"       "+this.nombre+"       "+this.email+"       "this.telefono);
        
    }
    
    
    
    
}
