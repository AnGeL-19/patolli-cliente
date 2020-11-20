/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabla;

import java.io.Serializable;

/**
 *
 * @author mra75
 */
public class Configuracion implements Serializable{
    
    private int fondo;
    private int nJugadores;
    private int nFichas;
    private int clientes_conectados;
    
    public Configuracion(int fondo, int nJugadores, int nFichas){
        this.nJugadores = nJugadores;
        this.nFichas = nFichas;
        this.clientes_conectados=0;
    }

    public int getClientes_conectados() {
        return clientes_conectados;
    }

    public void setClientes_conectados() {
        this.clientes_conectados ++;
    }

    public int getFondo() {
        return fondo;
    }

    public void setFondo(int fondo) {
        this.fondo = fondo;
    }

    public int getnJugadores() {
        return nJugadores;
    }

    public void setnJugadores(int nJugadores) {
        this.nJugadores = nJugadores;
    }

    public int getnFichas() {
        return nFichas;
    }

    public void setnFichas(int nFichas) {
        this.nFichas = nFichas;
    }
    


}
