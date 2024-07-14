package com.ruben.java.ui.swing.elementos;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class OptionPane_Warning {

    public OptionPane_Warning() {
        JFrame f=new JFrame();  
        JOptionPane.showMessageDialog(f,"Successfully Updated.","Alert",JOptionPane.WARNING_MESSAGE); 
    }
    
}
