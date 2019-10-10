/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author CRUZLEIJA
 */
public class ListenersGrises implements ActionListener{
    private Display display;

    public ListenersGrises(Display display) {
        this.display = display;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
       JButtonC aux = (JButtonC) e.getSource();
       switch(aux.getText()){
           
           case "+":{
           
           break;
           }
           case "-":{
           
           break;
           }
           case "X":{
           
           break;
           }
           case "/":{
          System.out.println();
           break;
           }
           case "=":{
          System.out.println();
           break;
           }
       
       
       }
    }

   
    
}
