/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabla;


import reglas.Reglas;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Observer;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.Observable;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import reglas.Jugador;
import reglas.Jugadores;




/**
 *
 * @author mra75
 */
public class TableroCliente extends javax.swing.JFrame implements Observer{

    
    private int indice;
    private int cJ1, cJ2, cJ3, cJ4;
    private boolean J1=true, J2, J3 , J4;
    private Jugadores j;
    private boolean j1;
    private int movimiento,fondo,njugadores;
    private final int puerto=5001;
    private String nombreProductoActual;
    private Cliente c;
    private int c_ant, y_ant;
    //private Jugador jj = new Jugador();
    /**
     * Creates new form tablaa
     */
    public TableroCliente() {
       initComponents();
        c = new Cliente(puerto);
        c.addObserver(this);
        Thread hilo = new Thread(c);
        hilo.start();
        
    }
    
        
    public void recibirDatos(int fondo,int nJugadores, int nFichas,int indice){
        System.out.println("FONDO "+fondo+" -----------");
        this.indice = indice;
        j = new Jugadores(nJugadores);
        j.crear_jugadores(fondo,nFichas);
        njugadores=nJugadores;
        System.out.println(indice +" ----------- indice");
        
        //////Jugador//////
        j.getJugadores().get(indice).setId(indice+1);
//        j.getJugadores().get(indice).setNombre(Nombre);
        //lblNombreJ2.setText(j.getJugadores().get(indice).getNombre());
        
//        System.out.println("El id es "+j.getJugadores().get(0).getId()+" -------------<>");
//        System.out.println("El id es "+j.getJugadores().get(0).getNombre()+" -------------<>");
        
        

        
        ///c.enviar_Objeto(j.getJugadores().get(indice));
        

        if(nJugadores==2){
            ver_fondos_jugadores();
            //ponerFichas(jugadores);
            
            desabilitarJugador3();
            desabilitarJugador4();
        }else if(nJugadores==3){
            ver_fondos_jugadores(); 
            //ponerFichas(jugadores);
            desabilitarJugador4();
        }else{
            ver_fondos_jugadores();
        }
        ponerFichas(nJugadores,nFichas);
        
        
    
    }
    

  
    @Override
    public void update(java.util.Observable o, Object o1) {
        
        
        System.out.println("Entro");
        if(o1 instanceof Jugador){
            
             switch(((Jugador) o1).getId()){
                case 1:
                     System.out.println("Entro ---------------  11111");
                    j.getJugadores().get(0).setAFondo(((Jugador) o1).getFondo());
                    for (int i = 0; i <  ((Jugador) o1).getFichas().size(); i++) {
                        j.getJugadores().get(0).getFichas().get(i).setPosicionX(((Jugador) o1).getFichas().get(i).getPosicionX());
                        j.getJugadores().get(0).getFichas().get(i).setPosicionY(((Jugador) o1).getFichas().get(i).getPosicionY());
                    }
                    j.getJugadores().get(0).setMover_Ficha(((Jugador) o1).getMover_Ficha());
                    System.out.println("fondo que tiene "+ j.getJugadores().get(0).getFondo());
                    System.out.println("Fichas que tiene "+ j.getJugadores().get(0).getFichas().size());
                    
                    turnos_calis_s(1);
                    ver_fondos_jugadores();
                    break;
                case 2:
                    System.out.println("Entro ---------------  222222");
      
                    break;
                case 3:
                    System.out.println("Entro ---------------  333333");
         
                    break;
                case 4:
                    
                    break;
            }
             
        }
        
        
    }

    public void ver_fondos_jugadores(){
        
        JLabel[] fondos = {lblFondoRJugador1,lblFondoRJugador2,lblFondoRJugador3,lblFondoRJugador4}; 
        for (int i = 0; i < j.getJugadores().size(); i++) {
            fondos[i].setText(j.getJugadores().get(i).getFondo()+" $$$$$$$$");
        }
        
    }
    
//    public void ver_banco(){
//        lblBanco.setText(banco.getFondo()+" $");
//    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn53 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn38 = new javax.swing.JButton();
        btn23 = new javax.swing.JButton();
        btn55 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn54 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn57 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn56 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn51 = new javax.swing.JButton();
        btn52 = new javax.swing.JButton();
        btn40 = new javax.swing.JButton();
        btn39 = new javax.swing.JButton();
        btn49 = new javax.swing.JButton();
        btn50 = new javax.swing.JButton();
        btn42 = new javax.swing.JButton();
        btn41 = new javax.swing.JButton();
        btn37 = new javax.swing.JButton();
        btn24 = new javax.swing.JButton();
        btn36 = new javax.swing.JButton();
        btn25 = new javax.swing.JButton();
        btn35 = new javax.swing.JButton();
        btn26 = new javax.swing.JButton();
        btn34 = new javax.swing.JButton();
        btn27 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn22 = new javax.swing.JButton();
        btn21 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn20 = new javax.swing.JButton();
        btn19 = new javax.swing.JButton();
        btn48 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn43 = new javax.swing.JButton();
        btn18 = new javax.swing.JButton();
        btn33 = new javax.swing.JButton();
        btn28 = new javax.swing.JButton();
        btn58 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblBanco = new javax.swing.JLabel();
        btntirarFrijoles = new javax.swing.JButton();
        Frijol1 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        Frijol2 = new javax.swing.JLabel();
        Frijol3 = new javax.swing.JLabel();
        Frijol4 = new javax.swing.JLabel();
        Frijol5 = new javax.swing.JLabel();
        btn47 = new javax.swing.JButton();
        btn44 = new javax.swing.JButton();
        btn59 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn14 = new javax.swing.JButton();
        btn17 = new javax.swing.JButton();
        btn32 = new javax.swing.JButton();
        btn29 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        pnlJugador3 = new javax.swing.JPanel();
        lblJugador3 = new javax.swing.JLabel();
        lblFondoJugador3 = new javax.swing.JLabel();
        lblFichajugador3 = new javax.swing.JLabel();
        btnFicha1_J3 = new javax.swing.JButton();
        btnFicha2_J3 = new javax.swing.JButton();
        btnFicha3_J3 = new javax.swing.JButton();
        btnFicha4_J3 = new javax.swing.JButton();
        btnFicha5_J3 = new javax.swing.JButton();
        btnFicha6_J3 = new javax.swing.JButton();
        lblFichasCruzadasJ3 = new javax.swing.JLabel();
        btnFichaObt1_J3 = new javax.swing.JButton();
        btnFichaObt3_J3 = new javax.swing.JButton();
        btnFichaObt5_J3 = new javax.swing.JButton();
        btnFichaObt2_J3 = new javax.swing.JButton();
        btnFichaObt6_J3 = new javax.swing.JButton();
        btnFichaObt4_J3 = new javax.swing.JButton();
        lblFondoRJugador3 = new javax.swing.JLabel();
        lblNombreJ3 = new javax.swing.JLabel();
        pnlJugador1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btnFicha1_J1 = new javax.swing.JButton();
        btnFicha2_J1 = new javax.swing.JButton();
        btnFicha3_J1 = new javax.swing.JButton();
        btnFicha4_J1 = new javax.swing.JButton();
        btnFicha5_J1 = new javax.swing.JButton();
        btnFicha6_J1 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        btnFichaObt1_J1 = new javax.swing.JButton();
        btnFichaObt3_J1 = new javax.swing.JButton();
        btnFichaObt5_J1 = new javax.swing.JButton();
        btnFichaObt2_J1 = new javax.swing.JButton();
        btnFichaObt6_J1 = new javax.swing.JButton();
        btnFichaObt4_J1 = new javax.swing.JButton();
        lblFondoRJugador1 = new javax.swing.JLabel();
        lblNombreJ1 = new javax.swing.JLabel();
        pnlJugador2 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        btnFicha1_J2 = new javax.swing.JButton();
        btnFicha2_J2 = new javax.swing.JButton();
        btnFicha3_J2 = new javax.swing.JButton();
        btnFicha4_J2 = new javax.swing.JButton();
        btnFicha5_J2 = new javax.swing.JButton();
        btnFicha6_J2 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        btnFichaObt1_J2 = new javax.swing.JButton();
        btnFichaObt3_J2 = new javax.swing.JButton();
        btnFichaObt5_J2 = new javax.swing.JButton();
        btnFichaObt2_J2 = new javax.swing.JButton();
        btnFichaObt6_J2 = new javax.swing.JButton();
        btnFichaObt4_J2 = new javax.swing.JButton();
        lblFondoRJugador2 = new javax.swing.JLabel();
        lblNombreJ2 = new javax.swing.JLabel();
        pnlJugador4 = new javax.swing.JPanel();
        lblJugador4 = new javax.swing.JLabel();
        lblFondoJugador4 = new javax.swing.JLabel();
        lblFichajugador4 = new javax.swing.JLabel();
        btnFicha1_J4 = new javax.swing.JButton();
        btnFicha2_J4 = new javax.swing.JButton();
        btnFicha3_J4 = new javax.swing.JButton();
        btnFicha4_J4 = new javax.swing.JButton();
        btnFicha5_J4 = new javax.swing.JButton();
        btnFicha6_J4 = new javax.swing.JButton();
        lblFichasCruzadasJ4 = new javax.swing.JLabel();
        btnFichaObt1_J4 = new javax.swing.JButton();
        btnFichaObt3_J4 = new javax.swing.JButton();
        btnFichaObt5_J4 = new javax.swing.JButton();
        btnFichaObt2_J4 = new javax.swing.JButton();
        btnFichaObt6_J4 = new javax.swing.JButton();
        btnFichaObt4_J4 = new javax.swing.JButton();
        lblFondoRJugador4 = new javax.swing.JLabel();
        lblNombreJ4 = new javax.swing.JLabel();
        btn46 = new javax.swing.JButton();
        btn45 = new javax.swing.JButton();
        btn60 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn15 = new javax.swing.JButton();
        btn16 = new javax.swing.JButton();
        btn30 = new javax.swing.JButton();
        btn31 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(btn53, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 30, 30));
        getContentPane().add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 30, 30));
        getContentPane().add(btn38, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, 30, 30));
        getContentPane().add(btn23, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 30, 30));
        getContentPane().add(btn55, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 30, 30));
        getContentPane().add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 30, 30));

        btn54.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 2));
        getContentPane().add(btn54, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 30, 30));
        getContentPane().add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 30, 30));

        btn57.setBackground(new java.awt.Color(25, 25, 25));
        btn57.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(btn57, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 30, 30));

        btn4.setBackground(new java.awt.Color(25, 25, 25));
        btn4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 30, 30));
        getContentPane().add(btn56, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 30, 30));

        btn5.setFocusable(false);
        getContentPane().add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 30, 30));
        getContentPane().add(btn51, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, 30, 30));
        getContentPane().add(btn52, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 30, 30));
        getContentPane().add(btn40, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 30, 30));

        btn39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 2));
        getContentPane().add(btn39, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 30, 30));

        btn49.setBackground(new java.awt.Color(25, 25, 25));
        btn49.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(btn49, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, 30, 30));
        getContentPane().add(btn50, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, 30, 30));

        btn42.setBackground(new java.awt.Color(25, 25, 25));
        btn42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(btn42, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, 30, 30));
        getContentPane().add(btn41, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, 30, 30));
        getContentPane().add(btn37, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 30, 30));

        btn24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 2));
        getContentPane().add(btn24, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 30, 30));
        getContentPane().add(btn36, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, 30, 30));
        getContentPane().add(btn25, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, 30, 30));
        getContentPane().add(btn35, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 440, 30, 30));
        getContentPane().add(btn26, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 30, 30));

        btn34.setBackground(new java.awt.Color(25, 25, 25));
        btn34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(btn34, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, 30, 30));

        btn27.setBackground(new java.awt.Color(25, 25, 25));
        btn27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(btn27, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 470, 30, 30));

        btn9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 2));
        getContentPane().add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 30, 30));
        getContentPane().add(btn10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 30, 30));
        getContentPane().add(btn22, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 30, 30));
        getContentPane().add(btn21, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 30, 30));
        getContentPane().add(btn11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 30, 30));

        btn12.setBackground(new java.awt.Color(25, 25, 25));
        btn12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(btn12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 30, 30));
        getContentPane().add(btn20, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 30, 30));

        btn19.setBackground(new java.awt.Color(25, 25, 25));
        btn19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(btn19, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 30, 30));

        btn48.setBackground(new java.awt.Color(25, 25, 25));
        btn48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(btn48, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, 30, 30));

        btn13.setBackground(new java.awt.Color(25, 25, 25));
        btn13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(btn13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 30, 30));

        btn43.setBackground(new java.awt.Color(25, 25, 25));
        btn43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(btn43, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 30, 30));

        btn18.setBackground(new java.awt.Color(25, 25, 25));
        btn18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(btn18, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 30, 30));

        btn33.setBackground(new java.awt.Color(25, 25, 25));
        btn33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(btn33, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 500, 30, 30));

        btn28.setBackground(new java.awt.Color(25, 25, 25));
        btn28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(btn28, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 500, 30, 30));

        btn58.setBackground(new java.awt.Color(25, 25, 25));
        btn58.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(btn58, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 30, 30));

        btn3.setBackground(new java.awt.Color(25, 25, 25));
        btn3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 30, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Banco:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 40, 40));

        lblBanco.setText("0");
        jPanel2.add(lblBanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 100, 40));

        btntirarFrijoles.setText("Tirar frijoles");
        btntirarFrijoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntirarFrijolesActionPerformed(evt);
            }
        });
        jPanel2.add(btntirarFrijoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 110, 40));

        Frijol1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/frijol sin nada.png"))); // NOI18N
        jPanel2.add(Frijol1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 40, 40));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/banco2.png"))); // NOI18N
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        Frijol2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/frijol sin nada.png"))); // NOI18N
        jPanel2.add(Frijol2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 40, 40));

        Frijol3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/frijol2.png"))); // NOI18N
        jPanel2.add(Frijol3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 40, 40));

        Frijol4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/frijol2.png"))); // NOI18N
        jPanel2.add(Frijol4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 40, 40));

        Frijol5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/frijol sin nada.png"))); // NOI18N
        jPanel2.add(Frijol5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 40, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 60));
        getContentPane().add(btn47, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, 30, 30));
        getContentPane().add(btn44, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 350, 30, 30));
        getContentPane().add(btn59, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 30, 30));
        getContentPane().add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 30, 30));
        getContentPane().add(btn14, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 30, 30));
        getContentPane().add(btn17, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 30, 30));
        getContentPane().add(btn32, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 530, 30, 30));
        getContentPane().add(btn29, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 530, 30, 30));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlJugador3.setBackground(new java.awt.Color(255, 255, 255));
        pnlJugador3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 51), 2, true));

        lblJugador3.setText("Jugador 3:");

        lblFondoJugador3.setText("Fondo:");

        lblFichajugador3.setText("Fichas");

        btnFicha1_J3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));

        btnFicha2_J3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));

        btnFicha3_J3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));

        btnFicha4_J3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));

        btnFicha5_J3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));

        btnFicha6_J3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));

        lblFichasCruzadasJ3.setText("Fichas cruzadas");

        lblFondoRJugador3.setText("0");

        javax.swing.GroupLayout pnlJugador3Layout = new javax.swing.GroupLayout(pnlJugador3);
        pnlJugador3.setLayout(pnlJugador3Layout);
        pnlJugador3Layout.setHorizontalGroup(
            pnlJugador3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlJugador3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlJugador3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlJugador3Layout.createSequentialGroup()
                        .addComponent(lblJugador3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNombreJ3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlJugador3Layout.createSequentialGroup()
                        .addComponent(lblFondoJugador3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFondoRJugador3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlJugador3Layout.createSequentialGroup()
                        .addGroup(pnlJugador3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlJugador3Layout.createSequentialGroup()
                                .addComponent(btnFicha4_J3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnFicha5_J3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnFicha6_J3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblFichajugador3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlJugador3Layout.createSequentialGroup()
                                .addComponent(btnFicha1_J3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnFicha2_J3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnFicha3_J3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35)
                        .addGroup(pnlJugador3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFichasCruzadasJ3)
                            .addGroup(pnlJugador3Layout.createSequentialGroup()
                                .addGroup(pnlJugador3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnFichaObt1_J3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnFichaObt4_J3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pnlJugador3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlJugador3Layout.createSequentialGroup()
                                        .addComponent(btnFichaObt2_J3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnFichaObt3_J3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlJugador3Layout.createSequentialGroup()
                                        .addComponent(btnFichaObt5_J3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnFichaObt6_J3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        pnlJugador3Layout.setVerticalGroup(
            pnlJugador3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlJugador3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlJugador3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnFichaObt3_J3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlJugador3Layout.createSequentialGroup()
                        .addGroup(pnlJugador3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblJugador3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlJugador3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblNombreJ3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlJugador3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlJugador3Layout.createSequentialGroup()
                                .addGroup(pnlJugador3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblFondoJugador3)
                                    .addComponent(lblFondoRJugador3))
                                .addGap(18, 18, 18)
                                .addGroup(pnlJugador3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblFichajugador3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblFichasCruzadasJ3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnFicha1_J3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnFichaObt1_J3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFichaObt2_J3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFicha2_J3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFicha3_J3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(pnlJugador3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlJugador3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnFicha4_J3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnFicha5_J3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlJugador3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFichaObt6_J3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFichaObt5_J3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFichaObt4_J3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnFicha6_J3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        jPanel4.add(pnlJugador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 370, 230));

        pnlJugador1.setBackground(new java.awt.Color(255, 255, 255));
        pnlJugador1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 2, true));

        jLabel17.setText("Jugador 1:");

        jLabel18.setText("Fondo:");

        jLabel19.setText("Fichas");

        btnFicha1_J1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));

        btnFicha2_J1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));

        btnFicha3_J1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));

        btnFicha4_J1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));

        btnFicha5_J1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));

        btnFicha6_J1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));

        jLabel20.setText("Fichas cruzadas");

        lblFondoRJugador1.setText("0");

        javax.swing.GroupLayout pnlJugador1Layout = new javax.swing.GroupLayout(pnlJugador1);
        pnlJugador1.setLayout(pnlJugador1Layout);
        pnlJugador1Layout.setHorizontalGroup(
            pnlJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlJugador1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlJugador1Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNombreJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlJugador1Layout.createSequentialGroup()
                        .addGroup(pnlJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlJugador1Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblFondoRJugador1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnlJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnlJugador1Layout.createSequentialGroup()
                                    .addComponent(btnFicha1_J1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnFicha2_J1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnFicha3_J1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(pnlJugador1Layout.createSequentialGroup()
                                    .addComponent(btnFicha4_J1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnFicha5_J1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnFicha6_J1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(35, 35, 35)
                        .addGroup(pnlJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addGroup(pnlJugador1Layout.createSequentialGroup()
                                .addGroup(pnlJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnFichaObt1_J1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnFichaObt4_J1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pnlJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlJugador1Layout.createSequentialGroup()
                                        .addComponent(btnFichaObt2_J1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnFichaObt3_J1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlJugador1Layout.createSequentialGroup()
                                        .addComponent(btnFichaObt5_J1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnFichaObt6_J1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        pnlJugador1Layout.setVerticalGroup(
            pnlJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlJugador1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnFichaObt3_J1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlJugador1Layout.createSequentialGroup()
                        .addGroup(pnlJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombreJ1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlJugador1Layout.createSequentialGroup()
                                .addGroup(pnlJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(lblFondoRJugador1))
                                .addGap(18, 18, 18)
                                .addGroup(pnlJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnFicha1_J1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnFichaObt1_J1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFichaObt2_J1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFicha3_J1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFicha2_J1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(pnlJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnFicha4_J1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnFicha5_J1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFichaObt6_J1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFichaObt5_J1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFichaObt4_J1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnFicha6_J1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        jPanel4.add(pnlJugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 370, 230));

        pnlJugador2.setBackground(new java.awt.Color(255, 255, 255));
        pnlJugador2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 2, true));
        pnlJugador2.setEnabled(false);

        jLabel21.setText("Jugador 2:");

        jLabel22.setText("Fondo:");

        jLabel23.setText("Fichas");

        btnFicha1_J2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));

        btnFicha2_J2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));

        btnFicha3_J2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));

        btnFicha4_J2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));

        btnFicha5_J2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));

        btnFicha6_J2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));

        jLabel24.setText("Fichas cruzadas");

        lblFondoRJugador2.setText("0");

        javax.swing.GroupLayout pnlJugador2Layout = new javax.swing.GroupLayout(pnlJugador2);
        pnlJugador2.setLayout(pnlJugador2Layout);
        pnlJugador2Layout.setHorizontalGroup(
            pnlJugador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlJugador2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlJugador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlJugador2Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNombreJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlJugador2Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFondoRJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlJugador2Layout.createSequentialGroup()
                        .addGroup(pnlJugador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlJugador2Layout.createSequentialGroup()
                                .addComponent(btnFicha4_J2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnFicha5_J2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnFicha6_J2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlJugador2Layout.createSequentialGroup()
                                .addComponent(btnFicha1_J2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(btnFicha2_J2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnFicha3_J2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34)
                        .addGroup(pnlJugador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addGroup(pnlJugador2Layout.createSequentialGroup()
                                .addGroup(pnlJugador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnFichaObt1_J2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnFichaObt4_J2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pnlJugador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlJugador2Layout.createSequentialGroup()
                                        .addComponent(btnFichaObt2_J2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnFichaObt3_J2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlJugador2Layout.createSequentialGroup()
                                        .addComponent(btnFichaObt5_J2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnFichaObt6_J2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        pnlJugador2Layout.setVerticalGroup(
            pnlJugador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlJugador2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlJugador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnFichaObt3_J2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlJugador2Layout.createSequentialGroup()
                        .addGroup(pnlJugador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                            .addComponent(lblNombreJ2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlJugador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlJugador2Layout.createSequentialGroup()
                                .addGroup(pnlJugador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel22)
                                    .addComponent(lblFondoRJugador2))
                                .addGap(18, 18, 18)
                                .addGroup(pnlJugador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel24))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnFicha1_J2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnFichaObt1_J2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFichaObt2_J2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFicha3_J2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFicha2_J2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(pnlJugador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlJugador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnFicha4_J2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnFicha5_J2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlJugador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFichaObt6_J2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFichaObt5_J2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFichaObt4_J2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnFicha6_J2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        jPanel4.add(pnlJugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 370, 230));

        pnlJugador4.setBackground(new java.awt.Color(255, 255, 255));
        pnlJugador4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));

        lblJugador4.setText("Jugador 4:");

        lblFondoJugador4.setText("Fondo:");

        lblFichajugador4.setText("Fichas");

        btnFicha1_J4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0)));

        btnFicha2_J4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0)));

        btnFicha3_J4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0)));

        btnFicha4_J4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0)));

        btnFicha5_J4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0)));

        btnFicha6_J4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0)));

        lblFichasCruzadasJ4.setText("Fichas cruzadas");

        lblFondoRJugador4.setText("0");

        javax.swing.GroupLayout pnlJugador4Layout = new javax.swing.GroupLayout(pnlJugador4);
        pnlJugador4.setLayout(pnlJugador4Layout);
        pnlJugador4Layout.setHorizontalGroup(
            pnlJugador4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlJugador4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlJugador4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlJugador4Layout.createSequentialGroup()
                        .addComponent(lblJugador4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNombreJ4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlJugador4Layout.createSequentialGroup()
                        .addComponent(lblFondoJugador4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFondoRJugador4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlJugador4Layout.createSequentialGroup()
                        .addGroup(pnlJugador4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlJugador4Layout.createSequentialGroup()
                                .addComponent(btnFicha4_J4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnFicha5_J4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnFicha6_J4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblFichajugador4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlJugador4Layout.createSequentialGroup()
                                .addComponent(btnFicha1_J4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnFicha2_J4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnFicha3_J4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35)
                        .addGroup(pnlJugador4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFichasCruzadasJ4)
                            .addGroup(pnlJugador4Layout.createSequentialGroup()
                                .addGroup(pnlJugador4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnFichaObt1_J4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnFichaObt4_J4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pnlJugador4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlJugador4Layout.createSequentialGroup()
                                        .addComponent(btnFichaObt2_J4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnFichaObt3_J4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlJugador4Layout.createSequentialGroup()
                                        .addComponent(btnFichaObt5_J4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnFichaObt6_J4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        pnlJugador4Layout.setVerticalGroup(
            pnlJugador4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlJugador4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlJugador4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnFichaObt3_J4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlJugador4Layout.createSequentialGroup()
                        .addGroup(pnlJugador4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblJugador4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlJugador4Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblNombreJ4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlJugador4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlJugador4Layout.createSequentialGroup()
                                .addGroup(pnlJugador4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblFondoJugador4)
                                    .addComponent(lblFondoRJugador4))
                                .addGap(18, 18, 18)
                                .addGroup(pnlJugador4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblFichajugador4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblFichasCruzadasJ4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnFicha1_J4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnFichaObt1_J4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFichaObt2_J4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFicha2_J4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFicha3_J4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(pnlJugador4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlJugador4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnFicha4_J4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnFicha5_J4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlJugador4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFichaObt6_J4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFichaObt5_J4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFichaObt4_J4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnFicha6_J4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        jPanel4.add(pnlJugador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        btn46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0), 2));
        jPanel4.add(btn46, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 250, 30, 30));

        btn45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0), 2));
        jPanel4.add(btn45, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 280, 30, 30));

        btn60.setBackground(new java.awt.Color(51, 51, 51));
        btn60.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 2));
        jPanel4.add(btn60, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 30, 30));

        btn1.setBackground(new java.awt.Color(51, 51, 51));
        btn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 2));
        jPanel4.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 30, 30));

        btn15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 2));
        jPanel4.add(btn15, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 30, 30));

        btn16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 2));
        jPanel4.add(btn16, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 30, 30));

        btn30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51), 2));
        jPanel4.add(btn30, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 490, 30, 30));

        btn31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51), 2));
        jPanel4.add(btn31, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 490, 30, 30));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 840, 560));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 860, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btntirarFrijolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntirarFrijolesActionPerformed
       
        int tirar=tirarFijolesJugador();
//        turnos_calis_s(tirar);
        //c.enviar(tirar);
        
        
    }//GEN-LAST:event_btntirarFrijolesActionPerformed
  
    
    public void turnos_calis_s(int movimiento){
        System.out.println("entro 0 ----");
        if(njugadores==2){
            System.out.println("entro 2 ----");
            if(J1){
                System.out.println("entro jugador 1");
                MoverFichaJugador1(movimiento);
                J2=true; J1=false;
            }else if(J2){
                System.out.println("entro jugador 2");
                MoverFichaJugador2(movimiento);
                J1=true; J2=false; 
            }
        }
        if(njugadores==3){
            System.out.println("entro 3 ----");
            if(J1){
                MoverFichaJugador1(movimiento);
                J2=true; J3=false; J1=false; 
            }else if(J2){
                MoverFichaJugador2(movimiento);
                J3=true; J1=false; J2=false; 
            }else if(J3){
                MoverFichaJugador3(movimiento);
                J1=true; J3=false; J2=false; 
            }
        }
        if(njugadores==4){
            System.out.println("entro 4 ----");
            if(J1){
                MoverFichaJugador1(movimiento);
                J2=true; J3=false; J4=false; J1=false;
            }else if(J2){
                MoverFichaJugador2(movimiento);
                J3=true; J4=false; J2=false; J1=false;
            }else if(J3){
                MoverFichaJugador3(movimiento);
                J4=true; J3=false; J2=false; J1=false;
            }else if(J4){
                MoverFichaJugador4(movimiento);
                J1=true; J2=false; J3=false; J4=false;
            }
        }
        
    }
    
    
 
    /////////////////Para el Servidor//////////////////////
    public int tirarFijoles(){
        
        Random r = new Random();
        boolean frijoles [] = new boolean[5];
        JLabel addfrijol[] = {Frijol1,Frijol2,Frijol3,Frijol4,Frijol5};
        byte contador = 0;
        for (int i = 0; i < frijoles.length; i++) {
            frijoles[i]=r.nextBoolean();
            System.out.println(frijoles[i]);
        }
        for (int i = 0; i < frijoles.length; i++) {
            if(frijoles[i]){
                    addfrijol[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/frijol2.png")));
                    contador++;
                    System.out.println(contador);
            }else{
                    addfrijol[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/frijol sin nada.png")));        
            }
        }
        
        if(contador==0){
            JOptionPane.showMessageDialog(this, contador+ " casillas no avanza, Siguente turno");
        }else{
            JOptionPane.showMessageDialog(this, "Avanzas "+movimiento+" casillas"); 
        }
        return movimiento;  
    }
    
    /////////////////Para el jugador//////////////////////
    public int tirarFijolesJugador(){
        
        Reglas reglas = new Reglas();
        Random r = new Random();
        boolean frijoles [] = new boolean[5];
        JLabel addfrijol[] = {Frijol1,Frijol2,Frijol3,Frijol4,Frijol5};
        byte contador = 0;
        for (int i = 0; i < frijoles.length; i++) {
            frijoles[i]=r.nextBoolean();
            System.out.println(frijoles[i]);
        }
        for (int i = 0; i < frijoles.length; i++) {
            if(frijoles[i]){
                    addfrijol[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/frijol2.png")));
                    contador++;
                    System.out.println(contador);
            }else{
                    addfrijol[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/frijol sin nada.png")));        
            }
        }
        
        if(contador==0){
            JOptionPane.showMessageDialog(this, contador+ " casillas no avanza, Siguente turno");
        }else{
            JOptionPane.showMessageDialog(this, "Avanzas "+reglas.Avanzar(contador)+" casillas"); 
        }
        return reglas.Avanzar(contador);  
    }
    
    
    
    
    public void desabilitarJugador3(){
        
        JLabel lbldesabilitar [] = {lblJugador3,lblFichajugador3,lblFichasCruzadasJ3,lblFondoJugador3,lblFondoRJugador3};
        for (int i = 0; i < lbldesabilitar.length; i++) {
            lbldesabilitar[i].setForeground(Color.white);
        }
        JButton btndesabilitar [] = {btnFicha1_J3,btnFicha2_J3,btnFicha3_J3,btnFicha4_J3,btnFicha5_J3,btnFicha6_J3,
                                     btnFichaObt1_J3,btnFichaObt2_J3,btnFichaObt3_J3,btnFichaObt4_J3,btnFichaObt5_J3,btnFichaObt6_J3};
        for (int i = 0; i < btndesabilitar.length; i++) {
                btndesabilitar[i].enable(false);
                btndesabilitar[i].setBorderPainted(false);
                btndesabilitar[i].setContentAreaFilled(false);
        }
        LineBorder lb = new LineBorder(Color.white);
        pnlJugador3.setBorder(lb);
    }
    
    public void desabilitarJugador4(){
        
        JLabel lbldesabilitar [] = {lblJugador4,lblFichajugador4,lblFichasCruzadasJ4,lblFondoJugador4,lblFondoRJugador4};
        for (int i = 0; i < lbldesabilitar.length; i++) {
            lbldesabilitar[i].setForeground(Color.white);
        }
        JButton btndesabilitar [] = {btnFicha1_J4,btnFicha2_J4,btnFicha3_J4,btnFicha4_J4,btnFicha5_J4,btnFicha6_J4,
                                     btnFichaObt1_J4,btnFichaObt2_J4,btnFichaObt3_J4,btnFichaObt4_J4,btnFichaObt5_J4,btnFichaObt6_J4};
        for (int i = 0; i < btndesabilitar.length; i++) {
                btndesabilitar[i].enable(false);
                btndesabilitar[i].setBorderPainted(false);
                btndesabilitar[i].setContentAreaFilled(false);
        }
        LineBorder lb = new LineBorder(Color.white);
        pnlJugador4.setBorder(lb);
    }
    
    //PONER LAS FICHAS A CADA JUGADOR
    public void ponerFichas(int jugadores, int nfichas){
        JButton btnFichaJ1 [] = {btnFicha1_J1,btnFicha2_J1,btnFicha3_J1,btnFicha4_J1,btnFicha5_J1,btnFicha6_J1};
        JButton btnFichaJ2 [] = {btnFicha1_J2,btnFicha2_J2,btnFicha3_J2,btnFicha4_J2,btnFicha5_J2,btnFicha6_J2};
        JButton btnFichaJ3 [] = {btnFicha1_J3,btnFicha2_J3,btnFicha3_J3,btnFicha4_J3,btnFicha5_J3,btnFicha6_J3};
        JButton btnFichaJ4 [] = {btnFicha1_J4,btnFicha2_J4,btnFicha3_J4,btnFicha4_J4,btnFicha5_J4,btnFicha6_J4};
        
        if(jugadores==2){
            
            for (int i = 0; i < nfichas; i++) {
                btnFichaJ1[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/fichas/fichaAzul.png"))); 
                btnFichaJ2[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/fichas/fichaRoja.png"))); 
            }
        }else if(jugadores==3){
            for (int i = 0; i < nfichas; i++) {
                btnFichaJ1[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/fichas/fichaAzul.png"))); 
                btnFichaJ2[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/fichas/fichaRoja.png"))); 
                btnFichaJ3[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/fichas/fichaAmarillo.png"))); 
            }
        }else{
            for (int i = 0; i < nfichas; i++) {
                btnFichaJ1[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/fichas/fichaAzul.png"))); 
                btnFichaJ2[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/fichas/fichaRoja.png"))); 
                btnFichaJ3[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/fichas/fichaAmarillo.png"))); 
                btnFichaJ4[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/fichas/fichaVerde.png"))); 
            }
        }  
    }
    
    public void MoverFichaJugador4(int movimientos){
//            
//        cJ4++;
//        JButton btnFichasJ4 [] = {btn39,btn40,btn41,btn42,btn43,btn44,
//                                  btn45,btn46,btn47,btn48,btn49,btn50,btn51,btn52,btn53,btn54,btn55,btn56,btn57,btn58,
//                                  btn59,btn60,btn1,btn2,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,
//                                  btn15,btn16,btn17,btn18,btn19,btn20,btn21,btn22,btn23,btn24,btn25,btn26,btn27,btn28,btn29,
//                                  btn30,btn31,btn32,btn33,btn34,btn35,btn36,btn37,btn38,btn39};
//        
//        int m=j.getJugadores().get(3).S(movimientos);
//        if(movimientos!=0){
//                System.out.println("casillas que se mueve "+m);
//            for (int i = 0; i < btnFichasJ4.length; i++) {
//                if(cJ4==1){
//                    if((i+1)==m){
//                        btnFichasJ4[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/fichas/fichaVerde.png")));    
//                   }  
//                }else{
//                    if((i+1)==m){
//                        btnFichasJ4[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/fichas/fichaVerde.png"))); 
//                        btnFichasJ4[i-movimientos].setIcon(new javax.swing.ImageIcon(getClass().getResource(""))); 
//                   }
//                } 
//            }
//        }
//  
    }
    
    
    public void MoverFichaJugador3(int movimientos){
//            
//        cJ3++;
//        JButton btnFichasJ3 [] = {btn24,btn25,btn26,btn27,btn28,btn29,
//                                  btn30,btn31,btn32,btn33,btn34,btn35,btn36,btn37,btn38,btn39,btn40,btn41,btn42,btn43,btn44,
//                                  btn45,btn46,btn47,btn48,btn49,btn50,btn51,btn52,btn53,btn54,btn55,btn56,btn57,btn58,
//                                  btn59,btn60,btn1,btn2,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,
//                                  btn16,btn15,btn16,btn18,btn17,btn18,btn19,btn20,btn21,btn22,btn23,btn24};
//        
//        int m=j.getJugadores().get(2).mover_Ficha(movimientos);
//        if(movimientos!=0){
//                System.out.println("casillas que se mueve "+m);
//            for (int i = 0; i < btnFichasJ3.length; i++) {
//                if(cJ3==1){
//                    if((i+1)==m){
//                        btnFichasJ3[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/fichas/fichaAmarillo.png")));    
//                   }  
//                }else{
//                    if((i+1)==m){
//                        btnFichasJ3[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/fichas/fichaAmarillo.png"))); 
//                        btnFichasJ3[i-movimientos].setIcon(new javax.swing.ImageIcon(getClass().getResource(""))); 
//                   }
//                } 
//            }
//        }
//        
//        
        
    }
    
    public void MoverFichaJugador2(int movimientos){
//            
//        cJ2++;
//        JButton btnFichasJ2 [] = {btn9,btn10,btn11,btn12,btn13,btn14,
//                                  btn16,btn15,btn16,btn17,btn18,btn19,btn20,btn21,btn22,btn23,btn24,btn25,btn26,btn27,btn28,btn29,btn30,
//                                  btn31,btn32,btn33,btn34,btn35,btn36,btn37,btn38,btn39,btn40,btn41,btn42,btn43,btn44,
//                                  btn45,btn46,btn47,btn48,btn49,btn50,btn51,btn52,btn53,btn54,btn55,btn56,btn57,btn58,
//                                  btn59,btn60,btn1,btn2,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9};
//        
//        int m=j.getJugadores().get(1).mover_Ficha(movimientos);
//        if(movimientos!=0){
//                System.out.println("casillas que se mueve "+m);
//            for (int i = 0; i < btnFichasJ2.length; i++) {
//                if(cJ2==1){
//                    if((i+1)==m){
//                        btnFichasJ2[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/fichas/fichaRoja.png")));  
//                        System.out.println("Posicion en X"+btnFichasJ2[i].getX());
//                        System.out.println("Posicion en Y"+btnFichasJ2[i].getY());
//                    }  
//                }else{
//                    if((i+1)==m){
//                        btnFichasJ2[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/fichas/fichaRoja.png"))); 
//                        btnFichasJ2[i-movimientos].setIcon(new javax.swing.ImageIcon(getClass().getResource(""))); 
//                        System.out.println("Posicion en X"+btnFichasJ2[i].getX());
//                        System.out.println("Posicion en Y"+btnFichasJ2[i].getY());
//                    }
//                } 
//            } 
//        }
        
        
        
    }
    
    public void MoverFichaJugador1(int movimientos){
            
       // cJ1++;
        JButton btnFichasJ1 [] = {btn54,btn55,btn56,btn57,btn58,
                                  btn59,btn60,btn1,btn2,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,
                                  btn15,btn16,btn17,btn18,btn19,btn20,btn21,btn22,btn23,btn24,btn25,btn26,btn27,btn28,btn29,
                                  btn30,btn31,btn32,btn33,btn34,btn35,btn36,btn37,btn38,btn39,btn40,btn41,btn42,btn43,btn44,
                                  btn45,btn46,btn47,btn48,btn49,btn50,btn51,btn52,btn53,btn54};
        
//        int m=j.getJugadores().get(0).mover_Ficha(movimientos);
//        if(movimientos!=0){
//            System.out.println("casillas que se mueve "+m);
        
        int x=0, y=0;    
        for (int k = 0; k < j.getJugadores().get(0).getFichas().size(); k++) {
            
            x = j.getJugadores().get(0).getFichas().get(k).getPosicionX();
            y = j.getJugadores().get(0).getFichas().get(k).getPosicionY();
            for (int i = 0; i < btnFichasJ1.length; i++) {
              
                if(x == btnFichasJ1[i].getX() && y == btnFichasJ1[i].getY()){
                    btnFichasJ1[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/fichas/fichaAzul.png"))); 
                }            
                //j.getJugadores().get(0).getFichas().get(i).setMovimientos();
                
                   
            }
            
        }
        
          
        
    }
    
    public void amonos(){
        System.out.println(btn53.getName());
        System.out.println(btn53.getX());
        System.out.println(btn53.getY());
        System.out.println(btn38.getName());
        System.out.println(btn38.getX());
        System.out.println(btn38.getY());
    }
    // Hacer la implementacion de los sockets
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        
            /* Set the Nimbus look and feel */
            //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
            /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
            * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
            */
            try {
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Windows".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(TableroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(TableroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(TableroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(TableroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>
            //</editor-fold>
            //</editor-fold>
            //</editor-fold>
         
        
            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new TableroCliente().setVisible(true);
                }
            });
        
        //</editor-fold>
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Frijol1;
    private javax.swing.JLabel Frijol2;
    private javax.swing.JLabel Frijol3;
    private javax.swing.JLabel Frijol4;
    private javax.swing.JLabel Frijol5;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn14;
    private javax.swing.JButton btn15;
    private javax.swing.JButton btn16;
    private javax.swing.JButton btn17;
    private javax.swing.JButton btn18;
    private javax.swing.JButton btn19;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn20;
    private javax.swing.JButton btn21;
    private javax.swing.JButton btn22;
    private javax.swing.JButton btn23;
    private javax.swing.JButton btn24;
    private javax.swing.JButton btn25;
    private javax.swing.JButton btn26;
    private javax.swing.JButton btn27;
    private javax.swing.JButton btn28;
    private javax.swing.JButton btn29;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn30;
    private javax.swing.JButton btn31;
    private javax.swing.JButton btn32;
    private javax.swing.JButton btn33;
    private javax.swing.JButton btn34;
    private javax.swing.JButton btn35;
    private javax.swing.JButton btn36;
    private javax.swing.JButton btn37;
    private javax.swing.JButton btn38;
    private javax.swing.JButton btn39;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn40;
    private javax.swing.JButton btn41;
    private javax.swing.JButton btn42;
    private javax.swing.JButton btn43;
    private javax.swing.JButton btn44;
    private javax.swing.JButton btn45;
    private javax.swing.JButton btn46;
    private javax.swing.JButton btn47;
    private javax.swing.JButton btn48;
    private javax.swing.JButton btn49;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn50;
    private javax.swing.JButton btn51;
    private javax.swing.JButton btn52;
    private javax.swing.JButton btn53;
    private javax.swing.JButton btn54;
    private javax.swing.JButton btn55;
    private javax.swing.JButton btn56;
    private javax.swing.JButton btn57;
    private javax.swing.JButton btn58;
    private javax.swing.JButton btn59;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn60;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnFicha1_J1;
    private javax.swing.JButton btnFicha1_J2;
    private javax.swing.JButton btnFicha1_J3;
    private javax.swing.JButton btnFicha1_J4;
    private javax.swing.JButton btnFicha2_J1;
    private javax.swing.JButton btnFicha2_J2;
    private javax.swing.JButton btnFicha2_J3;
    private javax.swing.JButton btnFicha2_J4;
    private javax.swing.JButton btnFicha3_J1;
    private javax.swing.JButton btnFicha3_J2;
    private javax.swing.JButton btnFicha3_J3;
    private javax.swing.JButton btnFicha3_J4;
    private javax.swing.JButton btnFicha4_J1;
    private javax.swing.JButton btnFicha4_J2;
    private javax.swing.JButton btnFicha4_J3;
    private javax.swing.JButton btnFicha4_J4;
    private javax.swing.JButton btnFicha5_J1;
    private javax.swing.JButton btnFicha5_J2;
    private javax.swing.JButton btnFicha5_J3;
    private javax.swing.JButton btnFicha5_J4;
    private javax.swing.JButton btnFicha6_J1;
    private javax.swing.JButton btnFicha6_J2;
    private javax.swing.JButton btnFicha6_J3;
    private javax.swing.JButton btnFicha6_J4;
    private javax.swing.JButton btnFichaObt1_J1;
    private javax.swing.JButton btnFichaObt1_J2;
    private javax.swing.JButton btnFichaObt1_J3;
    private javax.swing.JButton btnFichaObt1_J4;
    private javax.swing.JButton btnFichaObt2_J1;
    private javax.swing.JButton btnFichaObt2_J2;
    private javax.swing.JButton btnFichaObt2_J3;
    private javax.swing.JButton btnFichaObt2_J4;
    private javax.swing.JButton btnFichaObt3_J1;
    private javax.swing.JButton btnFichaObt3_J2;
    private javax.swing.JButton btnFichaObt3_J3;
    private javax.swing.JButton btnFichaObt3_J4;
    private javax.swing.JButton btnFichaObt4_J1;
    private javax.swing.JButton btnFichaObt4_J2;
    private javax.swing.JButton btnFichaObt4_J3;
    private javax.swing.JButton btnFichaObt4_J4;
    private javax.swing.JButton btnFichaObt5_J1;
    private javax.swing.JButton btnFichaObt5_J2;
    private javax.swing.JButton btnFichaObt5_J3;
    private javax.swing.JButton btnFichaObt5_J4;
    private javax.swing.JButton btnFichaObt6_J1;
    private javax.swing.JButton btnFichaObt6_J2;
    private javax.swing.JButton btnFichaObt6_J3;
    private javax.swing.JButton btnFichaObt6_J4;
    private javax.swing.JButton btntirarFrijoles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblBanco;
    private javax.swing.JLabel lblFichajugador3;
    private javax.swing.JLabel lblFichajugador4;
    private javax.swing.JLabel lblFichasCruzadasJ3;
    private javax.swing.JLabel lblFichasCruzadasJ4;
    private javax.swing.JLabel lblFondoJugador3;
    private javax.swing.JLabel lblFondoJugador4;
    private javax.swing.JLabel lblFondoRJugador1;
    private javax.swing.JLabel lblFondoRJugador2;
    private javax.swing.JLabel lblFondoRJugador3;
    private javax.swing.JLabel lblFondoRJugador4;
    private javax.swing.JLabel lblJugador3;
    private javax.swing.JLabel lblJugador4;
    private javax.swing.JLabel lblNombreJ1;
    private javax.swing.JLabel lblNombreJ2;
    private javax.swing.JLabel lblNombreJ3;
    private javax.swing.JLabel lblNombreJ4;
    private javax.swing.JPanel pnlJugador1;
    private javax.swing.JPanel pnlJugador2;
    private javax.swing.JPanel pnlJugador3;
    private javax.swing.JPanel pnlJugador4;
    // End of variables declaration//GEN-END:variables

    
    
}
