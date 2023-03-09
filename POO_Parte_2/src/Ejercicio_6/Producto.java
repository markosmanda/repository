/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_6;

/**
 *
 * @author marcos.españa
 */
public class Producto {
    private String ref;
    private int id;
    private static int contador=101;
    private String descripcion;
    private Double precioUnitario;
    private int unidades;
    
    public Producto(String descripcion, Double precioUnitario, int unidades){
        this.id=contador;
        contador++;
        this.descripcion=descripcion;
        this.precioUnitario=precioUnitario;
        this.unidades=unidades;
        this.ref=generarRef();
        
    }
    private String generarRef(){
        return String.format("REF%d", this.id);
    }
    @Override
    public String toString(){
        return String.format("%-10s [%s]\t %-10.2f %-15d", this.ref, this.descripcion, this.precioUnitario, this.unidades);
    } 

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Producto.contador = contador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
    
    
    
    
}
