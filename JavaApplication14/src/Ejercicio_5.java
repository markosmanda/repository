/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author marcos.españa
 */
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase= "   Me llamo pepe";
        int posicioncorrecta = 0;
        for (int i=0;i<frase.length();i++){
            if (frase.charAt(i)!=' '){
                posicioncorrecta=i;
                break;
            }
        }System.out.println(frase.substring(posicioncorrecta));
        
//        for (int i=posicioncorrecta;i<frase.length();i++){
//            System.out.print(frase.charAt(i));
//            
//        }System.out.println("");
//    }
    
}
    }
