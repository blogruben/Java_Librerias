package com.ruben.java.ui.swing.elementos;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBox {

    public ComboBox() {
        JFrame f=new JFrame("ComboBox");    
        String country[]={"Raul","Rodrigo","Ruben","Roberto","Ricardo","Ronaldo"};        
        JComboBox<String> cb=new JComboBox<String>(country);    
        cb.setBounds(50, 50,120,20);    
        f.add(cb);        
        f.setLayout(null);    
        f.setSize(400,500);    
        f.setVisible(true);      
        f.setVisible(true);  
    }
}


