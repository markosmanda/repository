/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marcos.españa
 */
public class Autor {
    private int id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String email;
    

public Autor (String nombre, String apellido1, String apellido2, String email){

this.nombre=nombre;
this.apellido2=apellido2;
this.apellido1=apellido1;
this.email=email;
int digito1=(int)(Math.random()*1000);
this.id=digito1;
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String aCadena(){
        //Imprimo en una sola linea los datos del contacto
        return String.format("%-4d %10s %20s %10s",id,nombre,email,apellido1, apellido2);
    }

}
