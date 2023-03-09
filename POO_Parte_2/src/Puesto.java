
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marcos.españa
 */
public class Puesto {
    private int codNumerico;
    private String descripcion;
    
    
    public Puesto(int codNumerico, String descripcion){
        this.codNumerico=codNumerico;
        this.descripcion=descripcion;
        
    }
    public String aCadena(){
        return String.format("%d - %s ",this.codNumerico, this.descripcion);
    }
    
    
    
    

    public int getCodNumerico() {
        return codNumerico;
    }

    public void setCodNumerico(int codNumerico) {
        this.codNumerico = codNumerico;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
    
    
    
    
    
}
