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
public class Venta {
    private int numero;
    private static int contador=1;
    private ArrayList<Linea_venta>listaLineas;
    private final int iva=21;
    private Double importeTotal;
    
    
    public Venta(){
        this.numero=contador;
        contador++;
        this.listaLineas=new ArrayList<>();
        
    }
    public void addLinea(Producto p, int cantidad){
        listaLineas.add(new Linea_venta(p, cantidad));
    }
    private Double generarTotal(){
        Double resultado=0.0;
        for (Linea_venta linea : listaLineas) {
            resultado=resultado+linea.generarImporte()+(linea.generarImporte()*21/100);
        }
        return resultado;
    }
    private Double generarSubtotal(){
        Double resultado=0.0;
        for (Linea_venta linea : listaLineas) {
            resultado=resultado+linea.generarImporte();
        }
        return resultado;
    }
    private Double generarTotalIva(){
        Double resultado=0.0;
        for (Linea_venta linea : listaLineas) {
            resultado=resultado+(linea.generarImporte()*21/100);
        }
        return resultado;
    }
    
    public void imprimir_venta(){
        System.out.println("Venta Numero: %d"+this.numero);
        System.out.println("CANT          DESCRIPCIÓN                         PRECIO U         IMPORTE");
        System.out.println("----------------------------------------------------------------------------------------");
        for (Linea_venta linea : listaLineas) {
            linea.imprimirLinea();
        }
        System.out.printf("                            Subtotal: %.2f",generarSubtotal());
        System.out.printf("                            Total IVA 21%: %.2f", generarTotalIva());
        System.out.printf("                            Total: %.2f",this.generarTotal());
        System.out.println("----------------------------------------------------------------------------------------");
    }
    @Override
    public String toString(){
        return String.format("%-5d %-15.2f [%d]", this.numero,this.generarTotal(), this.listaLineas.size());
        
    }
    
    
    
    
}
