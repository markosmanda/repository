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
public class Universidad {
    private String nombre;
    
    private String cuidad;
    private ArrayList<Departamento> listaDepartamentos;
    
    
    
   

    public Universidad(String nombre, String cuidad) {
        this.nombre = nombre;
        this.cuidad = cuidad;
        
        
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuidad() {
        return cuidad;
    }

    public void setCuidad(String cuidad) {
        this.cuidad = cuidad;
    }

    

    public Trabajador[] getListaTrabajador() {
        return listaTrabajador;
    }

    public void setListaTrabajador(Trabajador[] listaTrabajador) {
        this.listaTrabajador = listaTrabajador;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
    
}
