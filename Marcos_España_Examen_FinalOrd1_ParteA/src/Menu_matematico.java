
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author marcos.españa
 */
public class Menu_matematico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        menu();
        
    }
    public static void menu (){
        Scanner entrada = new Scanner (System.in);
        int opcion=0;
        int base=0;
        int exponente=0;
        int resultado=0;
        
        
        
        do{
        System.out.println("Cálculos Matematicas");
        System.out.println("===========================");
        System.out.println("1. Potencia");
        System.out.println("2. Media de un vector");
        System.out.println("3. Binario a decimal");
        System.out.println("4. Capicua");
        System.out.println("5. Salir");
        do{
        System.out.print("Elige opcion: ");
        
        opcion=Integer.parseInt(entrada.nextLine());
        if(opcion>5 || opcion<0){
            System.out.println("Error, la opción introducida no es valida");
        }
        }while(opcion>5 || opcion<0);
        
        switch(opcion){
            case 1:
                System.out.print("Introduce la base: ");
                base = Integer.parseInt(entrada.nextLine());
                System.out.print("Introduce el exponente: ");
                exponente=Integer.parseInt(entrada.nextLine());
                resultado=calcularPotencia(base, exponente);
                System.out.println(base+" elevado a "+exponente+" es: "+resultado );
                    break;
            case 2:
                    mediaVector();
                    break;
            case 3:
                    binario_to_decimal();
                    break;
            case 4:
                    String numero;
                    System.out.print("Introduce un numero: ");
                    numero=entrada.nextLine();
                    if (esCapicua(numero)==true){
                        System.out.println("El numero es capicua");
                    }
                    else{
                        System.out.println("El numero no es capicua");
                    }
                    break;
            case 5:
                    System.out.println("Saliendo");
                    break;
            default:
                System.out.println("Error, la opción introducida no es valida");
                break;
        }
        
        
    }while(opcion!=5);
        }
    public static int calcularPotencia (int base, int exponente){
        int resultado=base;
        for (int i=1;i<exponente;i++){
            resultado=resultado*base;
            
        }
        return resultado;
    }
    
    public static void mediaVector (){
        Scanner entrada = new Scanner (System.in);
        int [] vector = new int [5];
        int parametro=0;
        Double suma=0.0;
        boolean menosUno=false;
        while(menosUno==false){
        for (int i=0;i<vector.length;i++){
            do{
            System.out.print("Escribe un numero para introducir en el vector[-1 para salir]");
            parametro=Integer.parseInt(entrada.nextLine());
            if (parametro<-1){
                System.out.println("Introduce un numero positivo");
            }
            }while(parametro<-1);
            if(parametro==-1){
                vector[i]=parametro;
                System.out.println("Saliendo");
                menosUno=true;
                break;
            }
            
            vector[i]=parametro;
        }
        }
            System.out.println("Vector");
            System.out.println("===================");
            System.out.print("|"+vector[0]);
        for (int i=1;i<vector.length;i++){
            System.out.print("|"+vector[i]);
        }
            System.out.print("|");
            System.out.println("");
            int contador=0;
            for (int i=0;i<vector.length;i++){
                if (vector[i]>0){
                suma=suma+vector[i];
                contador++;
                
                }
            }
            Double media=suma/contador;
            System.out.printf("La media es: %.2f\n",media);
        
        
    }
    public static void binario_to_decimal() {
        Scanner entrada = new Scanner(System.in);
        String parametro ;
        System.out.print("Introduce un numero binario: ");
        parametro = entrada.nextLine();
        char[] array = new char[parametro.length()];
        
        
        
        for (int i = 0; i < parametro.length(); i++) {
            array[i] = parametro.charAt(i);
            

        }        
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]=='1') {
                contador++;
            }
        }
        System.out.println("El contador es: "+contador);
        int[] posicionUnos = new int[contador];
        int auxiliar = 0;

        for (int i=array.length-1;i>=0;i--){
            if (array[i] == '1') {

                posicionUnos[auxiliar] = i;
                auxiliar++;
            }
        }
        
        Double decimal = 0.0;
        System.out.println("El array al reves es: ");
        for(int i=0;i<posicionUnos.length;i++){
            System.out.print(posicionUnos[i]);
        }
        

        for (int i = 0; i < posicionUnos.length; i++) {
            decimal = decimal + Math.pow(posicionUnos[i], 2);
        }
        
        System.out.println(parametro + " pasado a decimal es: " + decimal);

    }
    public static boolean esCapicua(String numero){
        char [] reves = new char [numero.length()];
        int auxiliar=0;
        for (int i=numero.length()-1;i>=0;i--){
            reves[auxiliar]=numero.charAt(i);
            auxiliar++;
        }
        int contadorIguales=0;
        for (int i=0;i<numero.length();i++){
            if (numero.charAt(i)==reves[i]){
                contadorIguales++;
            }
        }
        if (contadorIguales==numero.length()){
            return true;
        }
        return false;
    }

}
