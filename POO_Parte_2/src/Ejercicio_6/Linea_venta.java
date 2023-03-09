/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_6;

/**
 *
 * @author marcos.españa
 */
public class Linea_venta {
    private Producto producto;
    private int cantidad;

    public Linea_venta(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }
    
    public void imprimirLinea(){
        System.out.printf(
                "&-10d",this.cantidad
                + "%-25s",this.producto.getDescripcion()
                + "%-10.2f",this.producto.getPrecioUnitario()
                + "10.2f",generarImporte());
    }
    public Double generarImporte(){
        Double resultado=cantidad*this.producto.getPrecioUnitario();
        return resultado;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
}
