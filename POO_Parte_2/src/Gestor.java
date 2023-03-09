
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.text.StyledEditorKit;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marcos.españa
 */
public class Gestor {
   private ArrayList <Puesto> listaPuestos;
   private ArrayList <Incidencia> listaIncidencias;
   private String nombre;
   
   
   public Gestor(String nombre){
       this.nombre=nombre;
       this.listaIncidencias=new ArrayList<>();
       this.listaPuestos=new ArrayList<>();
       
           
       }
   public void addIncidencia(int puesto, String descripcionProblema, LocalDate fechaIncidencia){
       listaIncidencias.add(new Incidencia(puesto, descripcionProblema, fechaIncidencia));
   }
   public void addPuesto(int codNumerico, String descripcion){
       listaPuestos.add(new Puesto(codNumerico, descripcion));
   }
   public Incidencia seleccionarIncidencia(int codigo){
       for (Incidencia incidencia : listaIncidencias) {
           if(incidencia.getCodNumIncidencia()==codigo){
               return incidencia;
           }
           
       }
       return null;
   }
   public void listarIncidencias(){
       System.out.println("=============================================");
       for (Incidencia incidencia:listaIncidencias){
                incidencia.listado();
       }
       System.out.println("=============================================");
   }
   public void resolverIncidencia(Incidencia incidencia, String resolucion, LocalDate fechaIncidencia){
       System.out.println("llega");
       incidencia.resolver(resolucion, fechaIncidencia);
       
       
   }
   
   
   
   
   

    public ArrayList<Puesto> getListaPuestos() {
        return listaPuestos;
    }

    public void setListaPuestos(ArrayList<Puesto> listaPuestos) {
        this.listaPuestos = listaPuestos;
    }

    public ArrayList<Incidencia> getListaIncidencias() {
        return listaIncidencias;
    }

    public void setListaIncidencias(ArrayList<Incidencia> listaIncidencias) {
        this.listaIncidencias = listaIncidencias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
       
   }

                        
  
   
   
    

