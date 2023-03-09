/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marcos.españa
 */



enum TipoCambio{
    MANUAL, AUTOMATICO
}

enum TipoCombustible{
    DIESEL, GASOLINA
}


public class Motor {
    private int cv;
    private TipoCombustible combustible;
    private TipoCambio cambio;
    private int kilometros;

    public Motor(int cv, TipoCombustible combustible, TipoCambio cambio) {
        this.cv = cv;
        this.combustible = combustible;
        this.cambio = cambio;
        this.kilometros = 0;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public TipoCombustible getCombustible() {
        return combustible;
    }

    public void setCombustible(TipoCombustible combustible) {
        this.combustible = combustible;
    }

    public TipoCambio getCambio() {
        return cambio;
    }

    public void setCambio(TipoCambio cambio) {
        this.cambio = cambio;
    }

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }
    

 
    }
    





