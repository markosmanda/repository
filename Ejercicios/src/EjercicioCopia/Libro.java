/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioCopia;

/**
 *
 * @author marcos.españa
 */
public class Libro {
        private String isbn;
    private String titulo;
    private String autor;
    private int año;

    public Libro(String titulo, String autor, int año) {
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
        this.isbn=null;
    }

    public Libro(String isbn, String titulo, String autor, int año) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
        if (this.checkISBN(isbn)){
            this.isbn=isbn;
        }else{
            System.out.println("Error");
        }
    }
   
    

    public String getIsbn() {
        if (this.isbn==null){
            String isbnnulo="***["+titulo+"] no tiene ISBN***";
            return isbnnulo;
                    
        }
        else{
        return isbn;
        }
    }

    public void setIsbn(String isbn) {
        
        
        
    }
    private boolean checkISBN (String isbn){
        isbn=isbn.toUpperCase();
        
        boolean isbnCorrecto=true;
        if(isbn.length()!=4){
            isbnCorrecto=false;
        }
        char letra = isbn.charAt(0);
        if (letra<'A' || letra>'Z')
            isbnCorrecto=false;
        
        char digito1 = isbn.charAt(1);
        if (digito1<'0'||digito1>'9'){
            isbnCorrecto=false;
        }
        char digito2 = isbn.charAt(1);
        if (digito2<'0'||digito2>'9'){
            isbnCorrecto=false;
        }
        char digito3 = isbn.charAt(1);
        if (digito3<'0'||digito3>'9'){
            isbnCorrecto=false;
        }
        
//        for (int i=1;i<=isbn.length();i++){
//            if (isbn.charAt(i)<'0'|| isbn.charAt(i)>'9')
//                isbnCorrecto=false;
//        }
        if (isbnCorrecto){
            return true;
           
        }
        else{
            return false;
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    public void isbn(String isbn){
        
    }
    public String citaBibliografica (){
        String cita;
        
        cita=String.format("%s [%d] %s",this.autor, this.año, this.titulo);
        return cita;
       
    }
    
}
