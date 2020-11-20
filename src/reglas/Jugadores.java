/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reglas;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author mra75
 */
public class Jugadores implements Serializable{
    
 
    
    private int n_j=0;
    private ArrayList<Jugador> jugadores = new ArrayList<>();

    
    public Jugadores(int numero_jugadores){
        this.n_j=numero_jugadores;
    }
    
    public void crear_jugadores(int fondo,int nFichas){     
        for (int i = 0; i < n_j; i++) {           
            jugadores.add(new Jugador((i+1),fondo, nFichas));
            System.out.println("--"+jugadores.get(i).getId());
        }
    }
    
    public ArrayList<Jugador> getJugadores(){     
        return jugadores;
    }
    
    public void verobj(){
        for (int i = 0; i < jugadores.size(); i++) {
            System.out.println(jugadores.get(i).getId()+ "--");
        }
    }
    
    
    
    
    
}
