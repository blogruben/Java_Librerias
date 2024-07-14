package com.ruben.java.ui.swing.elementos;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Opcion {

    public Opcion() {
        JFrame f= new JFrame("Opcion");      
        JRadioButton r1=new JRadioButton("Hombre");    
        JRadioButton r2=new JRadioButton("Mujer");    
        r1.setBounds(75,50,100,30);    
        r2.setBounds(75,100,100,30);    
        ButtonGroup bg=new ButtonGroup();    
        bg.add(r1);bg.add(r2);    
        f.add(r1);f.add(r2);      
        f.setSize(300,300);    
        f.setLayout(null);            
        f.setVisible(true);   
    }
}
