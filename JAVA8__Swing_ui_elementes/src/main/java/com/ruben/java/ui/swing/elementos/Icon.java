package com.ruben.java.ui.swing.elementos;

import java.awt.Toolkit;

import javax.swing.JFrame;

import java.awt.Frame;    
import java.awt.Image;    

public class Icon {

    public Icon() {
        Frame f = new JFrame("Swing Elements");  
        Image icon = Toolkit.getDefaultToolkit().getImage(Icon.class.getResource("/images/kittyIcon.png"));
        f.setIconImage(icon);
        f.setLayout(null);
        f.setSize(400, 400);
        f.setVisible(true);
    }

}


