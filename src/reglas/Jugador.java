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
public class Jugador implements Serializable{
    
    //private String nombre;
    private int moverFicha=0;
    private int id;
    private int fondo;
    private int nFichas;
    private ArrayList<Ficha> fichas = new ArrayList<>();
    private ArrayList<Ficha> fichas_cruzadas = new ArrayList<>();
    
    
    public Jugador(int id,int fondo, int nFichas){
        this.id = id;
        this.fondo=fondo;
        this.nFichas = nFichas;
        crear_fichas();
    }
    
    private void crear_fichas(){
        
        for (int j = 0; j < nFichas; j++) {
            setFichas(new Ficha((j+1)));
        }
        
    }
     
//    public void setNombre(String nombre){
//        this.nombre=nombre;
//    }
//    
//    public String getNombre(){
//        return this.nombre;
//    }
    
    public void setFichaCruzada(Ficha ficha){
        fichas_cruzadas.add(ficha);
    }
    
    public void setId(int id){
        this.id=id;
    }
    
    public int getId(){
        return id;
    }
    
    public void setMover_Ficha(int movimiento){
       this.moverFicha = movimiento;
    }
    
    public int getMover_Ficha(){
        return moverFicha;
    }
    
    
    
    public void setAFondo(int fondo) {
        this.fondo = fondo;
    }
    
    public void setMoverFicha(int moverFicha) {
        this.moverFicha = moverFicha;
    }

    public int getFondo() {
        return fondo;
    }

    public void setAgregarFondo(int fondo) {
        this.fondo += fondo;
    }

    public void setQuitarFondo(int fondo) {
        this.fondo -= fondo;
    }
    
    public ArrayList<Ficha> getFichas() {
        return fichas;
    }

    public void setFichas(Ficha fichas) {
        this.fichas.add(fichas);
    }
    
    public void eliminar_ficha(Ficha ficha){
        this.fichas.remove(ficha);
    } 
    
}
