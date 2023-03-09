/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Universidad;

/**
 *
 * @author marcos.españa
 */
public class Trabajador extends Persona{
     private String fech_ini;
    private Universidad universidad;

    public Trabajador(String fech_ini, Universidad universidad, int ci, String nombre) {
        super(ci, nombre);
        this.fech_ini = fech_ini;
        this.universidad = universidad;
    }

    public String getFech_ini() {
        return fech_ini;
    }

    public void setFech_ini(String fech_ini) {
        this.fech_ini = fech_ini;
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
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

    

