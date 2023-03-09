/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marcos.españa
 */
public class Coche {
    private String marca;
    private String modelo;
    private Motor motor;
    private Rueda[] ruedas;
    
    public Coche(String marca, String modelo, int cv, TipoCombustible combustible, TipoCambio cambio, int radio){
        this.marca=marca;
        this.modelo=modelo;
        
        this.motor=new Motor(cv,combustible,cambio);
        
        this.ruedas=new Rueda[5];
        this.ruedas[1]=new Rueda(radio);
        this.ruedas[2]=new Rueda(radio);
        this.ruedas[3]=new Rueda(radio);
        this.ruedas[4]=new Rueda(radio);
        
        
    }
    public void CambiarRueda (int num){
        if (num>=1 && num <=4){
        this.ruedas[num].setKm(0);
        }
        else{
            System.out.println("Error, rueda incorrecta");
        }
    }
    public void recorrer (int kmReorridos){
        int kmReorridosActuales=this.motor.getKilometros();
        this.motor.setKilometros(kmReorridosActuales+kmReorridos);
        int kmReorridosActualesRuedas=0;
        for (int i=1;i<=4;i++){
            kmReorridosActualesRuedas=this.ruedas[i].getKm();
            this.ruedas[i].setKm(kmReorridosActualesRuedas+kmReorridos);
        }
    }
    public void imprimirFicha(){
        System.out.println("");
        System.out.println("Ficha del coche");
        System.out.println("=====================================");
        System.out.println("Marca del coche: "+this.marca);
        System.out.println("Modelo del coche: "+this.modelo);
        System.out.println("Motor(CV): "+this.motor.getCv());
        System.out.println("Combustible: "+this.motor.getCombustible());
        System.out.println("cambio: "+this.motor.getCambio());
        System.out.println("km del motor: "+this.motor.getKilometros());
        System.out.println("Tamaño ruedas: "+this.ruedas[1].getRadio());
        System.out.printf("km de las ruedas: [%d] [%d] [%d] [%d]",this.ruedas[1].getKm(), this.ruedas[2].getKm(), this.ruedas[3].getKm(), this.ruedas[4].getKm());
        
    }


}
