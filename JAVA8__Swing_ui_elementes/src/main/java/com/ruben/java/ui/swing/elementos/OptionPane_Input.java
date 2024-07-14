package com.ruben.java.ui.swing.elementos;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class OptionPane_Input {

    public OptionPane_Input() {
        JFrame f= new JFrame();   
        String name=JOptionPane.showInputDialog(f,"Enter Name");   
        System.out.println("Enter Name "+name);
    }
    
}
