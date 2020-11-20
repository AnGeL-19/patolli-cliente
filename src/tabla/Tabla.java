/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabla;

/**
 *
 * @author mra75
 */
public class Tabla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
//        Inicio p = new Inicio();
//        p.show();
        String nombre = "22";
        for (int i = 0; i < nombre.length(); i++) {
            if(Character.isDigit(nombre.charAt(i))){
                 System.out.println("si es");       
            }else{
                System.out.println("no es");
            }
        }
        


    }
    
}
