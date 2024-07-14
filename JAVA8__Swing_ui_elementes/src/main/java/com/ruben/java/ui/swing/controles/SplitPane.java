package com.ruben.java.ui.swing.controles;

import java.awt.FlowLayout;  
import java.awt.Panel;  
import javax.swing.JComboBox;  
import javax.swing.JFrame;  
import javax.swing.JSplitPane;   

public class SplitPane {
    
    public SplitPane() {  
        // Create and set up the window.  
        final JFrame frame = new JFrame("JSplitPane");  
        // Display the window.  
        frame.setSize(300, 300);  
        frame.setVisible(true);  
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        // set flow layout for the frame  
        frame.getContentPane().setLayout(new FlowLayout());  
        String[] option1 = { "A","B","C","D","E" };  
        JComboBox<String> box1 = new JComboBox<String>(option1);  
        String[] option2 = {"1","2","3","4","5"};  
        JComboBox<String> box2 = new JComboBox<String>(option2);  
        Panel panel1 = new Panel();  
        panel1.add(box1);  
        Panel panel2 = new Panel();  
        panel2.add(box2);  
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panel1, panel2);  
        // JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT,  
        // panel1, panel2);  
        frame.getContentPane().add(splitPane);  
    }  

}

