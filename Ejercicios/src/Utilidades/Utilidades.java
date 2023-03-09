/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

/**
 *
 * @author marcos.españa
 */
public class Utilidades {
    
    public static boolean checkEmail (String email){
        int posicionArroba=257;
        int posicionPunto=0;
        int utilidadDominio=0;
        for (int i=0;i<email.length();i++){
            if (email.charAt(i)=='@'){
                posicionArroba=i;
                
            }
            if (email.charAt(i)=='.'){
                posicionPunto=i;
                
            }
           utilidadDominio=i;
        }
        if ((posicionArroba<posicionPunto) && (utilidadDominio>posicionPunto+1)){
            
                return true;
            
            
        }
        return false;
    }
    public void error (){
        System.out.println("Error. El email introducido no es correcto");
    }
    
}
