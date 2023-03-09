/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Restaurante;

/**
 *
 * @author marcos.españa
 */
public class Credito extends Forma_pago {
    private String nombre_titular;
     private String n_Tarjeta;
    private String tipo;
    

    public Credito(String n_Tarjeta, String tipo, String Nombre_titular, int subtotal, int propina, int impuesto) {
        super(subtotal, propina, impuesto);
        this.n_Tarjeta = n_Tarjeta;
        this.tipo = tipo;
        this.nombre_titular = Nombre_titular;
    }
       
    
    public void Calcular_cargo(){
        
    }

    public String getNombre_titular() {
        return nombre_titular;
    }

    public void setNombre_titular(String nombre_titular) {
        this.nombre_titular = nombre_titular;
    }

    public String getN_Tarjeta() {
        return n_Tarjeta;
    }

    public void setN_Tarjeta(String n_Tarjeta) {
        this.n_Tarjeta = n_Tarjeta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(int impuesto) {
        this.impuesto = impuesto;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

    public int getPropina() {
        return propina;
    }

    public void setPropina(int propina) {
        this.propina = propina;
    }
    
    
}
