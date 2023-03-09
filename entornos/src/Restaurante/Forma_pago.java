/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Restaurante;

/**
 *
 * @author marcos.españa
 */
public class Forma_pago {
    protected int impuesto;
    protected int subtotal;
    protected int propina;
    

    protected Forma_pago(int subtotal, int propina, int impuesto) {
        this.subtotal = subtotal;
        this.propina = propina;
        this.impuesto = impuesto;
    }
    
    public void calcular_pago(){
        
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
