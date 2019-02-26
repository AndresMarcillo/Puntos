/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amarcillo.modelo;

import com.amarcillo.controlador.Arista;
import com.amarcillo.controlador.Aristas;
import com.amarcillo.controlador.Puntos;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Andres
 */
public class VentanaPuntos extends JFrame{
    private Puntos puntos = new Puntos();
    private Aristas aristas = new Aristas();
    
    private JButton bAgregaAristas = new JButton("Agrega Aristas");
    private PanelPuntos panelPuntos = new PanelPuntos(puntos, aristas);
 
    private DialogAgregaAristas dialogAgregaAristas = new DialogAgregaAristas(this);
    
    public VentanaPuntos(){
        super("Une Puntos");
        add(panelPuntos, BorderLayout.CENTER);
        JPanel pB = new JPanel(new FlowLayout());
        pB.add(bAgregaAristas);
        add(pB, BorderLayout.SOUTH);
        
        bAgregaAristas.addActionListener(new manejadorBotonAgregar());
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
       
    private class manejadorBotonAgregar implements ActionListener {
    
        public void actionPerformed(ActionEvent e){
            int[] ptos = dialogAgregaAristas.muestra();
            if(ptos != null){
                for(int i=0; i<ptos.length; i++)
                    aristas.agrega(new Arista(puntos.punto(ptos[i]),puntos.punto(ptos[i+1])));
                panelPuntos.repaint();
            }
        }
    }
    
    
    
    public static void main(String[] args) {
        new VentanaPuntos();
    }
}
