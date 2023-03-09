/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author marcos.españa
 */
public class Casa {
    String propietario;
    int planta1;
    int planta2;
    int precioVenta;
    private static int contadorCasas=0;
    
    public Casa(String propietario, int planta1, int planta2, int precioVenta){
        this.propietario=propietario;
        this.planta1=planta1;
        this.planta2=planta2;
        this.precioVenta=precioVenta;
        contadorCasas++;
        
    }

    public static int getContadorCasas() {
        return contadorCasas;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public int getPlanta1() {
        return planta1;
    }

    public void setPlanta1(int planta1) {
        this.planta1 = planta1;
    }

    public int getPlanta2() {
        return planta2;
    }

    public void setPlanta2(int planta2) {
        this.planta2 = planta2;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }
    
    public int calcularSuperficie(){
        int superficieTotal=planta1+planta2;
        return superficieTotal;
    }
    public void imprimirDatos(){
            System.out.println(this.propietario+"     "+this.calcularSuperficie()+"        "+this.precioVenta);
        
    }
    
}
