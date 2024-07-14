package com.ruben.java.ui.swing.controles;

import javax.swing.JFrame;
import javax.swing.JScrollBar;

public class ScrollBar {

    public ScrollBar() {
        JFrame f= new JFrame("Scrollbar Example");  
        JScrollBar s=new JScrollBar();  
        s.setBounds(100,100, 50,100);  
        f.add(s);  
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);   
    }
    
}
