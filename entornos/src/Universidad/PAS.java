/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Universidad;

import java.util.ArrayList;

/**
 *
 * @author marcos.españa
 */
public class PAS {
     private String puesto;
    private ArrayList<Trabajador> listaTrabajador[];

    public PAS(String puesto, ArrayList<Trabajador>[] listaTrabajador) {
        this.puesto = puesto;
        this.listaTrabajador = new ArrayList<>();
    }
    
    public void administrar(){
        
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public ArrayList<Trabajador>[] getListaTrabajador() {
        return listaTrabajador;
    }

    public void setListaTrabajador(ArrayList<Trabajador>[] listaTrabajador) {
        this.listaTrabajador = listaTrabajador;
    }
    
    
    
}
