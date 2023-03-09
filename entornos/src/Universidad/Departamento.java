/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Universidad;

/**
 *
 * @author marcos.españa
 */
public class Departamento {
     private String nombre;
    private Trabajador trabajador;
    private Estu_grado est_grad;

    public Departamento(String nombre, Trabajador trabajador, Estu_grado est_grad) {
        this.nombre = nombre;
        this.trabajador = trabajador;
        this.est_grad = est_grad;
    }
    
    public void funcion (Doctor doctor){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    public Estu_grado getEst_grad() {
        return est_grad;
    }

    public void setEst_grad(Estu_grado est_grad) {
        this.est_grad = est_grad;
    }
    
}
