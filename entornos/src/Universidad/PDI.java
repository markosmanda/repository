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
public class PDI  {
    private String categoria;
    private ArrayList<Trabajador> listaTrabajador[];
    private Doctor doctor;

    public PDI(String categoria, ArrayList<Trabajador>[] listaTrabajador, Doctor doctor) {
        this.categoria = categoria;
        this.listaTrabajador = listaTrabajador;
        this.doctor = doctor;
    }
        
    public void enseñar(){
        
    }
    
    public void investigar(){
        
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public ArrayList<Trabajador>[] getListaTrabajador() {
        return listaTrabajador;
    }

    public void setListaTrabajador(ArrayList<Trabajador>[] listaTrabajador) {
        this.listaTrabajador = listaTrabajador;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    
    
}
