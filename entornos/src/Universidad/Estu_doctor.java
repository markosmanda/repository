/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Universidad;

/**
 *
 * @author marcos.españa
 */
public class Estu_doctor extends Estudiante {
     private String prog_doctor;

    public Estu_doctor(String prog_doctor, int nre, Universidad universidad, int ci, String nombre) {
        super(nre, universidad, ci, nombre);
        this.prog_doctor = prog_doctor;
    }
    
    public void funcion (Doctor doctor){
        
    }
    
    public void tesis(){
        
    }

    public String getProg_doctor() {
        return prog_doctor;
    }

    public void setProg_doctor(String prog_doctor) {
        this.prog_doctor = prog_doctor;
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
