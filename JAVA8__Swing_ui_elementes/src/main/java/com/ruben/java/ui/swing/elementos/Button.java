package com.ruben.java.ui.swing.elementos;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Button {

    
    public Button() {
        JFrame f=new JFrame("Button Example");  
        JButton b=new JButton("Click Here");  
        b.setBounds(50,100,95,30);  
        f.add(b);  
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  
    }

}
