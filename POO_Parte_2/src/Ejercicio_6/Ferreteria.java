/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_6;

import java.util.ArrayList;

/**
 *
 * @author marcos.españa
 */
public class Ferreteria {
    private String nombre;
    private ArrayList<Producto>listaProductos;
    private ArrayList<Venta>listaVenta;

    public Ferreteria(String nombre) {
        this.nombre = nombre;
        this.listaProductos=new ArrayList<>();
        this.listaVenta=new ArrayList<>();
        
    }
    
    public void addProducto(String descripcion, Double precioUnitario, int unidades){
        listaProductos.add(new Producto(descripcion, precioUnitario, unidades));
    }
    public Venta addVenta(){
        Venta v=new Venta();
        listaVenta.add(v);
        return v;
        
    }
    public boolean añadirStock(int id, int cantidad){
        for (Producto producto : listaProductos) {
            if(producto.getId()==id){
                producto.setUnidades(producto.getUnidades()+cantidad);
                return true;
            }
        }
        return false;
    }
    
    public Producto buscar(int id){
        Producto p = null;
        for (Producto producto : listaProductos) {
            if(producto.getId()==id){
                p=producto;
            }
            
        
    }
        return p;
    
    
    
    
    
}
    public void listarProductos(){
        if(listaProductos.size()>0){
        for (Producto producto : listaProductos) {
            System.out.println(producto.toString());
    }
}
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public ArrayList<Venta> getListaVenta() {
        return listaVenta;
    }

    public void setListaVenta(ArrayList<Venta> listaVenta) {
        this.listaVenta = listaVenta;
    }
    
}
