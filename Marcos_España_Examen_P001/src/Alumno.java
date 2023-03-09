/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marcos.españa
 */
public class Alumno {
    private int id;
    private static int contador=100;
    private String nombre;
    private int edad;
    private boolean matriculado;
    private Grupo grupo;
    private int aleatorio=(int)(Math.random()*1000);
    
    public Alumno(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
        contador++;
        this.id=contador;
        ;
        this.matriculado=false;
        
    }
    public  String imprimirFicha(){
        if(this.matriculado==true){
            
        return String.format("******** Ficha del grupo ********\n"
                + "ID: %d\n"
                + "Nombre: %s\n"
                + "Edad: %d\n"
                + "Clase: %s\n"
                + "========================",this.id, this.nombre, this.edad, this.grupo.getNombre());
    }
        else{
            return String.format("******** Ficha del grupo ********\n"
                + "ID: %d\n"
                + "Nombre: %s\n"
                + "Edad: %d\n"
                + "Clase: Sin matricular\n"
                + "========================",this.id, this.nombre, this.edad, this.grupo);
            
        }
    }
    public String aCadena(){
        if(this.matriculado==true){
        return String.format("ID: %-15d  %-20s %-15s",this.id, this.nombre, this.grupo.getNombre()  );
        }
        else{
            return String.format("ID: %-15d -  %-20s Sin matricular",this.id, this.nombre  );
            
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Alumno.contador = contador;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isMatriculado() {
        return matriculado;
    }

    public void setMatriculado(boolean matriculado) {
        this.matriculado = matriculado;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public int getAleatorio() {
        return aleatorio;
    }

    public void setAleatorio(int aleatorio) {
        this.aleatorio = aleatorio;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

        
    }
    

