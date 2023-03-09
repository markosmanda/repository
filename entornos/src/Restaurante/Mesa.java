/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Restaurante;

/**
 *
 * @author marcos.españa
 */
public class Mesa {
    private int codigo;
    private String ubicacion;
    private int cant_comensales;

    public Mesa(int codigo, int cant_comensales, String ubicacion) {
        this.codigo = codigo;
        this.cant_comensales = cant_comensales;
        this.ubicacion = ubicacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCant_comensales() {
        return cant_comensales;
    }

    public void setCant_comensales(int cant_comensales) {
        this.cant_comensales = cant_comensales;
    }
    
    
}
