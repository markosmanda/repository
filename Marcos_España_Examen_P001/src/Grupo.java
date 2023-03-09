
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marcos.españa
 */
public class Grupo {
    private String nombre;
    private ArrayList<Alumno> ListaAlumnosGrupo;
    private final int Max_alumnos=2;
    public Grupo(String nombre){
        this.nombre=nombre;
        this.ListaAlumnosGrupo=new ArrayList<>();
    }
    public void listarAlumnosGrupo(){
        for(Alumno alumno:ListaAlumnosGrupo){
            System.out.printf(alumno.aCadena());
            System.out.println("");
            
            
        }
        
    }
    
    public Boolean addAlumno(Alumno alumno){
        if(ListaAlumnosGrupo.size()<Max_alumnos){
            if(alumno.isMatriculado()==false){
                alumno.setMatriculado(true);
                ListaAlumnosGrupo.add(alumno);
                    return true;
        }
            else{
                System.out.println("Alumno ya matriculado");
        }
        }else{
            System.out.println("Alumnos maximos alcanzados");
        }
        return false;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Alumno> getListaAlumnosGrupo() {
        return ListaAlumnosGrupo;
    }

    public void setListaAlumnosGrupo(ArrayList<Alumno> ListaAlumnosGrupo) {
        this.ListaAlumnosGrupo = ListaAlumnosGrupo;
    }

    public int getMax_alumnos() {
        return Max_alumnos;
    }
    
    
    
    
    
    
    
}
