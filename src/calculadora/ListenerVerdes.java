/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

/**
 *
 * @author CRUZLEIJA
 */
public class ListenerVerdes implements ActionListener{

    private Display display;

    public ListenerVerdes(Display display) {
        this.display = display;
    }
        
    @Override
    public void actionPerformed(ActionEvent e) {
       JButtonC aux = (JButtonC) e.getSource();
       
       if (aux.getText().equals("+/-")){
          if(display.getNumero().isNegativo()){
              display.getNumero().setNegativo(false);
          }else{
              display.getNumero().setNegativo(true);
              
          }
        // display.getNumero().concatenar(display.getNumero().getValue()+"");
         display.setText(display.getNumero().getValue()+"");
         
       }else{
         display.concatenar(aux.getText());
         display.setText(display.getNumero().getValue()+"");
       }

    }
    
}
