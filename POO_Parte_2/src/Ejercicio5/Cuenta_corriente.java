/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author marcos.españa
 */
public class Cuenta_corriente {
    private int numero;
    private static int contador=1001;
    private Persona persona;
    private Double saldo;

    public Cuenta_corriente(Persona p, Double saldo) {
        this.numero = contador;
        contador++;
        this.saldo = saldo;
        this.persona=p;
    }
    public String aCadena(){
        return String.format("Número: %-15d Saldo: %-15.2f Propietario: %-10s", this.numero, this.saldo, this.persona.getNombre());
    }
    public String mostrar_cuenta(){
        return String.format("Número: %-15d Saldo: %-15.2f", this.numero, this.saldo);
    }
    
    
  public void ingreso(int cantidad){
      this.saldo=this.saldo+cantidad;
  }
  public boolean reintegro(int cantidad){
      if(cantidad>saldo){
      
      
      }
      else{
      this.saldo=this.saldo-cantidad;
      
      return true; 
      }
      
      return false;
      
  }
  public boolean transferencia(Cuenta_corriente destino, int cantidad){
      if(reintegro(cantidad)==true){
       destino.ingreso(cantidad);
       return true;
      }
      return false;
  }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
   

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
  
  
  
  
}
