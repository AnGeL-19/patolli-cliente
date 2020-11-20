/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reglas;


import java.io.Serializable;

/**
 *
 * @author mra75
 */
public class Ficha implements Serializable{
    
    private int posicionX;
    private int posicionY;
    private int movimiento_avance;
    private boolean seleccionada;
    private int id_ficha;
    private int movimientos;
    
    public Ficha(int id_ficha){
        this.posicionX=0;
        this.posicionY=0;
        this.seleccionada=false;
        this.id_ficha=id_ficha;
        this.movimientos=0;
    }
    
    public void setMovimientos(){
        this.movimientos++;
    }
    
    public int getMovimientos(){
        return this.movimientos;
    }
    
    
    public int getID(){
        return this.id_ficha;
    }
    
    public int avanzar(int avanzar){
        return this.movimiento_avance+=avanzar;
    }
    
    
    public void regresar_posicion(int regresar){
        this.movimiento_avance-=regresar;
    }
    
    public int getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(int posicionX) {
        this.posicionX = posicionX;
    }

    public int getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(int posicionY) {
        this.posicionY = posicionY;
    }

    public boolean isSeleccionado() {
        return seleccionada;
    }

    public void setSeleccionado(boolean seleccionada) {
        this.seleccionada = seleccionada;
    }
    
    
}
