/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabla;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;
import reglas.Jugador;

/**
 *
 * @author mra75
 */
public class Cliente extends Observable implements Runnable{

    private int puerto;
    private Socket sc;
    //private boolean es_numero;
    private Jugador jugador;
    
    public Cliente(int puerto){
        try {
            this.puerto=puerto;
            this.sc = new Socket("localhost", puerto);
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void run() {
        
        
        DataInputStream in=null;
        ObjectInputStream recibir=null;
        
        try {
            
            //192.168.0.4
            //Socket sc = new Socket("localhost", puerto);
            
            try {
                while(true){
                    in = new DataInputStream(sc.getInputStream());
                    recibir = new ObjectInputStream(in);
                    
                    jugador = (Jugador) recibir.readObject();
                
                    this.setChanged();
                    this.notifyObservers(jugador);
                    this.clearChanged();
                }
                
                    
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
               
    }
   
    public void enviar(int avanza){

        DataOutputStream out = null;
        try {
            out = new DataOutputStream(sc.getOutputStream());
            out.writeInt(avanza);
            
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        } 
  
    }
    
    public boolean es_numero(String numero){
        for (int i = 0; i < numero.length(); i++) {
            if(Character.isDigit(numero.charAt(i))){
                return true;     
            }
        }
        return false;
    }
    
    public void enviar_Objeto(Jugador jugador){
        DataOutputStream out = null;
        ObjectOutputStream enviar = null;
        
//        System.out.println(jugador.getId());
//        System.out.println(jugador.getNombre());

        try {
            
            out = new DataOutputStream(sc.getOutputStream());
                enviar = new ObjectOutputStream(out);
                enviar.flush();
                enviar.writeObject(jugador);   
                System.out.println("enviado");
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
  
    
    
}
