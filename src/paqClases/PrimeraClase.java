
package paqClases;

import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class PrimeraClase {
    String unaCadena;
    int unEntero;
    
    public void mostrar(){
        System.out.println("Atributos :"+ unaCadena + "y" + unEntero);
    }
    
    public static void main(String[] args) {
        
        
        PrimeraClase unObjeto1 = new PrimeraClase();
        
        PrimeraClase unObjeto2 = new PrimeraClase();
        
        PrimeraClase unObjeto3 = new PrimeraClase();
        
        PrimeraClase unObjeto4 = new PrimeraClase();
        
        PrimeraClase unObjeto5 = new PrimeraClase();
        
        ArrayList<PrimeraClase> objetos = new ArrayList<>();
        
        unObjeto1.unaCadena = "Ventilador";
        
        unObjeto1.unEntero = 6;
        
        unObjeto2.unaCadena = "Escritorio";
        
        unObjeto2.unEntero = 7;
        
        unObjeto3.unaCadena = "Mesa";
        
        unObjeto3.unEntero = 8;
        
        unObjeto4.unaCadena = "Table";
        
        unObjeto4.unEntero = 10;
        
        unObjeto5.unaCadena = "Char";
        
        unObjeto5.unEntero = 16;
        
        objetos.add(unObjeto1);
        objetos.add(unObjeto2);
        objetos.add(unObjeto3);
        objetos.add(unObjeto4);
        objetos.add(unObjeto5);
        
        for(PrimeraClase h: objetos) {
            System.out.println(+h.unEntero);
            System.out.println(h.unaCadena);
        }
        
    }
    
}
