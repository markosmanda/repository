/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Restaurante;

import java.util.ArrayList;

/**
 *
 * @author marcos.españa
 */
public class ord_servicio {
    private int hora;

    private Mesa mesa;
    private Camarero camarero;
    
    private ArrayList<Plato>listaPlatos;

    public ord_servicio(int hora,Mesa mesa, Camarero camarero) {
        this.hora = hora;
        
        this.mesa = mesa;
        this.camarero = camarero;
        this.listaPlatos=new ArrayList<>();
    }

   
    
    public void generar_pago(){
        
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public Camarero getCamarero() {
        return camarero;
    }

    public void setCamarero(Camarero camarero) {
        this.camarero = camarero;
    }

    public Plato getPlatos() {
        return platos;
    }

    public void setPlatos(Plato platos) {
        this.platos = platos;
    }
    
    
}
