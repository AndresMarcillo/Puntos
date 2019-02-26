/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amarcillo.modelo;

import com.amarcillo.controlador.Arista;
import com.amarcillo.controlador.Aristas;
import com.amarcillo.controlador.Punto;
import com.amarcillo.controlador.Puntos;
import java.awt.*;
import javax.swing.JPanel;

/**
 *
 * @author Andres
 */
public class PanelPuntos extends JPanel{
    private Puntos puntos;
    private Aristas aristas;

    public PanelPuntos(Puntos puntos, Aristas aristas) {
        this.puntos = puntos;
        this.aristas = aristas;
        setPreferredSize(new Dimension(400,400));
        setBackground(Color.LIGHT_GRAY);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int i=0;
        Punto p;
    
        while ((p = puntos.punto(i)) != null){
            g.drawString(String.valueOf(i), p.x, p.y);
            i++;
        }
        i=0;
        Arista a;
        while ((a = aristas.arista(i)) != null){
            g.drawLine(a.ptoIni.x, a.ptoIni.y, a.ptoFin.x, a.ptoFin.y);
            i++;
        }
    }
}
