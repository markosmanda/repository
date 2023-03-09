/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Universidad;

/**
 *
 * @author marcos.españa
 */
public class Estu_grado extends Estudiante{
     private String titulacion;

    public Estu_grado(String titulacion, int nre, Universidad universidad, int ci, String nombre) {
        super(nre, universidad, ci, nombre);
        this.titulacion = titulacion;
    }
    
    public void funcion (Estu_grado est_grad){
        
    }

    public void pfc(){
        
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getNre() {
        return nre;
    }

    public void setNre(int nre) {
        this.nre = nre;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
