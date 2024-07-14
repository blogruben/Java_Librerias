package com.ruben.java.ui.swing.elementos;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class TextArea {
    
    public TextArea() {
        JFrame f= new JFrame();  
        JTextArea area=new JTextArea("Hola mundo");  
        area.setBounds(10,30, 200,200);  
        f.add(area);  
        f.setSize(300,300);  
        f.setLayout(null);   
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);  
    }
}
