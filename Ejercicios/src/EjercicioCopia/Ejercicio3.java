/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjercicioCopia;

/**
 *
 * @author marcos.españa
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro libro1 = new Libro ("1984", "G. Orswell", 1948);
        Libro libro2 = new Libro ("L002", "Moby Dick", "H. Melvill", 1851);
        Libro libro3 = new Libro ("50 sombras", "Myke M", 2010);

        
        
        
        
        System.out.println("Parte 1");
        System.out.println("========================================");
        libro1.setIsbn("L001");
        System.out.println("Libro1: ");
        System.out.println(libro1.getIsbn());
        System.out.println(libro1.citaBibliografica());
        System.out.println("=======================");
        System.out.println("Libro2: ");
        System.out.println(libro2.getIsbn());
        System.out.println(libro2.citaBibliografica());
        System.out.println("=======================");
        System.out.println("Libro3: ");
        System.out.println(libro3.getIsbn());
        System.out.println(libro3.citaBibliografica());
        System.out.println("");
        System.out.println("Parte 2 - Usando un array");
        System.out.println("========================================");
        int totalLibros=0;
        Libro [] listaLibros = new Libro [10];

        listaLibros[totalLibros]= new Libro ("1984", "G. Orswell", 1948);
        totalLibros++;
        listaLibros[0].setIsbn("L002");
        listaLibros[totalLibros]= new Libro ("601", "Moby Dick", "H. Melvill", 1851);
        totalLibros++;
        listaLibros[totalLibros]= new Libro ("50 sombras", "Myke M", 2010);
        totalLibros++;
        
        for (int i=0;i<totalLibros;i++){
            System.out.println(listaLibros[i].citaBibliografica());
        }
        for (int i=0;i<totalLibros;i++){
            System.out.println(listaLibros[i].getIsbn());
        }
        
    }
    }
    

