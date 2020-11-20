/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reglas;

/**
 *
 * @author mra75
 */
public class Reglas {
    
    public byte Avanzar(int numero){
        if(numero==0){return 0;}
        if(numero==1){return 1;}
        if(numero==2){return 2;}
        if(numero==3){return 3;}
        if(numero==4){return 4;}
        if(numero==5){return 10;}
        return 0;
    }
    
}
