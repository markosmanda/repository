
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author marcos.españa
 */
public class CentroEducativo {

    private String nombre;
    private ArrayList<Grupo> listaGrupos;
    private ArrayList<Alumno> ListaAlumnos;

    public CentroEducativo(String nombre) {
        this.nombre = nombre;
        this.ListaAlumnos = new ArrayList<>();
        this.listaGrupos = new ArrayList<>();

    }

    public void addAlumno(String nombre, int edad) {

        ListaAlumnos.add(new Alumno(nombre, edad));

    }

    public Alumno seleccionarAlumno(int id) {
        for (Alumno alumno : ListaAlumnos) {
            if (alumno.getId() == id) {
                return alumno;
            }
        }
        return null;
    }

    public void listarAlumnos() {
        System.out.println("===========================================================================================");
        System.out.printf("%s     Listado Total Alumnos\n", this.nombre);
        System.out.println("===========================================================================================");
        for (Alumno alumno : ListaAlumnos) {
            System.out.println(alumno.aCadena());
        }

    }

    public void addGrupo(String nombre) {
        nombre = nombre.toUpperCase();

        listaGrupos.add(new Grupo(nombre));

    }

    public Grupo seleccionarGrupo(String nombre) {
        nombre = nombre.toUpperCase();
        for (Grupo grupo : listaGrupos) {
            if (grupo.getNombre().toUpperCase().equals(nombre)) {
                return grupo;
            }
        }
        
        return null;
    }

    public void listarGruposCentro() {
        for (Grupo grupo : listaGrupos) {
            System.out.printf("%s - %d alumnos\n",grupo.getNombre(), this.listaGrupos.size());
            grupo.listarAlumnosGrupo();
            System.out.println("");
            System.out.println("=====================================");
        }
       
    }

    public void maricularAlumno(Alumno alumno, Grupo grupo) {

        if (grupo.addAlumno(alumno) == true) {
            
            alumno.setGrupo(grupo);
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Grupo> getListaGrupos() {
        return listaGrupos;
    }

    public void setListaGrupos(ArrayList<Grupo> listaGrupos) {
        this.listaGrupos = listaGrupos;
    }

    public ArrayList<Alumno> getListaAlumnos() {
        return ListaAlumnos;
    }

    public void setListaAlumnos(ArrayList<Alumno> ListaAlumnos) {
        this.ListaAlumnos = ListaAlumnos;
    }

}
