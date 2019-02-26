/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amarcillo.controlador;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Andres
 */
public class Puntos {
    private ArrayList<Punto> puntos = new ArrayList<Punto>();
    //puntos(0,0);
    public Puntos() {
    }
    
    public Punto punto(int i){
        if (i<0 || i>=puntos.size())
            return null;
        return puntos.get(i);
    }
}
