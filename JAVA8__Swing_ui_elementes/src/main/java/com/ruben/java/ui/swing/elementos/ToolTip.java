package com.ruben.java.ui.swing.elementos;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JLabel;

public class ToolTip {

    public ToolTip() {
        JFrame f = new JFrame("Password Field");
        // Creating PasswordField and label
        JPasswordField value = new JPasswordField();
        value.setBounds(100, 100, 100, 30);
        value.setToolTipText("Enter your Password");
        JLabel l1 = new JLabel("Password:");
        l1.setBounds(20, 100, 80, 30);
        // Adding components to frame
        f.add(value);
        f.add(l1);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
    
}