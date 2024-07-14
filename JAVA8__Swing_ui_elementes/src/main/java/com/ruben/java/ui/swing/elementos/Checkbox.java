package com.ruben.java.ui.swing.elementos;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Checkbox {

    public Checkbox() {
        JFrame f= new JFrame("CheckBox Example");  
        JCheckBox checkBox1 = new JCheckBox("Tarea 1");  
        checkBox1.setBounds(100,100, 80,50);  
        JCheckBox checkBox2 = new JCheckBox("Tarea 2", true);  
        checkBox2.setBounds(100,150, 80,50);  
        f.add(checkBox1);  
        f.add(checkBox2);  
        f.setSize(400,400);  
        f.setLayout(null);    
        f.setVisible(true);   
    }
}
