
import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author marcos.españa
 */
public class Incidencia {

    private int codNumIncidencia;
    private int puesto;
    private LocalDate fechaIncidencia;
    private String descripcionProblema;
    private LocalDate fechaResolucion;
    private String resolucion;
    private int id;
    private int contador = 1001;
    private ESTADO estado;

    public Incidencia(int puesto, String descripcionProblema, LocalDate fechaIncidencia) {
        this.puesto = puesto;
        this.descripcionProblema = descripcionProblema;
        this.fechaIncidencia = fechaIncidencia;
        this.id = contador;
        contador++;
        this.estado =ESTADO.PENDIENTE;
    }

    public void detalles() {
        System.out.println("============= INCIDENCIA =============");
        System.out.println("ESTADO: " + this.estado);
        System.out.println("CODIGO: " + this.id);
        System.out.println("PUESTO: " + this.puesto);
        System.out.println("------------------------------");
        System.out.println("DESCRIPCION: " + this.descripcionProblema);
        System.out.println("FECHA INCIDENCIA: " + this.fechaIncidencia);
        System.out.println("------------------------------");
        if (estado.RESUELTO == this.getEstado()) {
            System.out.println("RESOLUCIÓN: " + this.resolucion);
            System.out.println("FECHA DE RESOLUCIÓN: " + this.resolucion);
            System.out.println("=======================================");
        } else {
            System.out.println("RESOLUCIÓN: Sin resolver");
            System.out.println("FECHA DE RESOLUCIÓN: Sin resolver");
            System.out.println("=======================================");

        }

    }
    public void listado(){
        System.out.printf("[ %s ] %-15d %-30s [ %s ]\n",this.estado, this.id, this.descripcionProblema, this.fechaIncidencia.toString());
    }
    public void resolver(String resolucion, LocalDate fechaResolucion){
        
        System.out.println(this.estado);
        this.resolucion=resolucion;
        this.fechaResolucion=fechaResolucion;
        this.estado=ESTADO.RESUELTO;
        System.out.println(this.estado);
        
    }
    

    public int getCodNumIncidencia() {
        return codNumIncidencia;
    }

    public void setCodNumIncidencia(int codNumIncidencia) {
        this.codNumIncidencia = codNumIncidencia;
    }

    public int getPuesto() {
        return puesto;
    }

    public void setPuesto(int puesto) {
        this.puesto = puesto;
    }

    public LocalDate getFechaIncidencia() {
        return fechaIncidencia;
    }

    public void setFechaIncidencia(LocalDate fechaIncidencia) {
        this.fechaIncidencia = fechaIncidencia;
    }

    public String getDescripcionProblema() {
        return descripcionProblema;
    }

    public void setDescripcionProblema(String descripcionProblema) {
        this.descripcionProblema = descripcionProblema;
    }

    public LocalDate getFechaResolucion() {
        return fechaResolucion;
    }

    public void setFechaResolucion(LocalDate fechaResolucion) {
        this.fechaResolucion = fechaResolucion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public ESTADO getEstado() {
        return estado;
    }

    public void setEstado(ESTADO estado) {
        this.estado = estado;
    }

}
