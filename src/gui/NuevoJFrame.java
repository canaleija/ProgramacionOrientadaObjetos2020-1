/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author CRUZLEIJA
 */
public class NuevoJFrame extends JFrame {
    
    public NuevoJFrame (String titulo,int w,int h){
        super(titulo);
        setSize(new Dimension(w,h));
        //setSize(w,h);
        setVisible(true);
        
}
}
