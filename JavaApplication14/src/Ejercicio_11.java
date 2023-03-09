

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author marcos.españa
 */
public class Ejercicio_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase = "me gusta el jamon";
        String frasebien;
        int posimayuscu=0;
        for (int i=0;i<frase.length();i++){
            if (frase.charAt(i)==posimayuscu){
                frase.toUpperCase();
            }
            if (frase.charAt(i)==' '){
                posimayuscu=i+1;
                
            }
            
            
    
}System.out.println(frase);
}
}