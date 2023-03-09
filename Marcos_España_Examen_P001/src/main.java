
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author marcos.españa
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner teclado=new Scanner(System.in);
        int opcion;
        
        
        //================= INICIALIZACION DE DATOS EN CODIGO ===========
        CentroEducativo iesRamonArcas=new CentroEducativo("IES RAMON ARCAS");
        
        iesRamonArcas.addAlumno("Juan Antonio",18);
        iesRamonArcas.addAlumno("Alicia",17);
        iesRamonArcas.addAlumno("Juanjo",17);
        iesRamonArcas.addAlumno("Almendro",20);
        iesRamonArcas.addAlumno("Jose Juan",21);
        iesRamonArcas.addAlumno("Alvaro",20);
        
        iesRamonArcas.addGrupo("DAW1");
        iesRamonArcas.addGrupo("DAW2");
        
        //================================================================
        
        
         //**********************comienzo del menu ********************
        do{
            System.out.println("");System.out.println("");
            System.out.println("*****************************");
            System.out.println("PROGRAMA MATRICULACION");
             System.out.println(iesRamonArcas.getNombre());
            System.out.println("*****************************");
            System.out.println("1. Listado total del alumno");
            System.out.println("2. Listado total de grupos");
            System.out.println("3. Matricular alumno");
            System.out.println("4. Info detallada alumno");
            System.out.println("5. Salir del sistema");
            
            System.out.print("\nIntroduce una opcion: ");
            opcion=Integer.parseInt(teclado.nextLine());
            
            switch (opcion){
                case 1:
                    iesRamonArcas.listarAlumnos();
                        
                       
                       
                        break;
                case 2:
                        iesRamonArcas.listarGruposCentro();
                        
                        
                        
                        break;        
                case 3:
                        iesRamonArcas.listarAlumnos();
                        System.out.print("\nIntroduce ID alumno: ");
                        int idAlumno=Integer.parseInt(teclado.nextLine());
                        Alumno alumnoauxiliar=iesRamonArcas.seleccionarAlumno(idAlumno);
                        System.out.print("Nombre de la clase: ");
                        String nombreGrupo=teclado.nextLine().toUpperCase();
                        Grupo grupoAuxiliar=iesRamonArcas.seleccionarGrupo(nombreGrupo);
                        iesRamonArcas.maricularAlumno(alumnoauxiliar, grupoAuxiliar);
                        
                        
                        break;
                case 4: 
                        iesRamonArcas.listarAlumnos();
                        
                        System.out.print("\nIntroduce ID alumno: ");
                        idAlumno=Integer.parseInt(teclado.nextLine());
                        Alumno alumnoAuxiliar= iesRamonArcas.seleccionarAlumno(idAlumno);
                        System.out.println(alumnoAuxiliar.imprimirFicha());
                    
                
                        
                        
                        break;
                case 5: System.out.println("bye bye");
                        break;
                default:
                        System.out.println("ERROR: opcion incorrecta");
            }
        }while (opcion!=5);
       
    }
    
}
