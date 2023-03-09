
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author marcos.españa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String marca;
        String modelo;
        int cv;
        int radio;
        TipoCambio tipocamb;
        TipoCombustible tipocombus;
        Coche cocheVolvo = new Coche("Volvo", "XC60", 140, TipoCombustible.DIESEL, TipoCambio.AUTOMATICO, 19);
        //Coche cochePorsche= new Coche("Porsche", "911", 250, TipoCombustible.GASOLINA, TipoCambio.MANUAL, 22);

        System.out.println("Creando un nuevo coche: ");
        System.out.println("=======================================");
        System.out.print("Introduce la marca: ");
        marca = entrada.nextLine();
        System.out.print("Introduce el modelo: ");
        modelo = entrada.nextLine();
        System.out.print("Introduce los cv: ");
        cv = Integer.parseInt(entrada.nextLine());
        System.out.print("Combustible [DIESEL|GASOLINA]: ");
        String combustible = entrada.nextLine().toUpperCase();

        if (combustible.equals("DIESEL")) {
            tipocombus = TipoCombustible.DIESEL;
        } else {
            tipocombus = TipoCombustible.GASOLINA;
        }

        System.out.print("Cambio [MANUAL|AUTOMATICO]: ");
        String cambio = entrada.nextLine().toUpperCase();
        if (cambio.equals("MANUAL")) {
            tipocamb = TipoCambio.MANUAL;
        } else {
            tipocamb = TipoCambio.AUTOMATICO;
        }

        System.out.print("Introduce el radio de las ruedas: ");
        radio = Integer.parseInt(entrada.nextLine());
        Coche cochePorsche = new Coche(marca, modelo, cv, tipocombus, tipocamb, radio);
        cocheVolvo.imprimirFicha();
        cochePorsche.imprimirFicha();
        cocheVolvo.recorrer(10000);
        cocheVolvo.CambiarRueda(4);
        cochePorsche.recorrer(500);
        cocheVolvo.imprimirFicha();
        cochePorsche.imprimirFicha();

    }

}
