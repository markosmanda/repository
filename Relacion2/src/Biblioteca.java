
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author marcos.españa
 */
public class Biblioteca {

    private String nombre;
    private String apellido1;
    private String apellido2;
    private String email;
    private ArrayList<Autor> ListaAutores;

    public Biblioteca() {
        this.ListaAutores = new ArrayList();

    }

    public void addAutor(String nombre, String apellido1, String apellido2, String email) {
        ListaAutores.add(new Autor(nombre, apellido1, apellido2, email));

    }

    public void listadoAutores() {

        System.out.println("=========== LISTA DE CONTACTOS =================");
        System.out.println("ID       NOMBRE         EMAIL         TELEFONO");

        for (Autor autor : ListaAutores) {
            System.out.println(autor.aCadena());
        }

        System.out.println("================================================");
    }

}
