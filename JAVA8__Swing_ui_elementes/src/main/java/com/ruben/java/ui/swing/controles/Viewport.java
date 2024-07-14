package com.ruben.java.ui.swing.controles;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JViewport;

public class Viewport {

    public Viewport() {
        //JViewport se usa para hacer scrolling

        JFrame f = new JFrame("JViewport"); 
        f.setLayout(new BorderLayout()); 

        JLabel l1 = new JLabel("Raul"); 
        l1.setFont(new Font("Arial", Font.BOLD, 40)); 
        l1.setForeground(Color.GREEN); 
        l1.setHorizontalAlignment(JLabel.CENTER); 
  
        JLabel l2 = new JLabel("Aprendiendo Java Swing!"); 
        l2.setFont(new Font("Arial", Font.PLAIN, 14)); 
  
        // Create a JViewport 
        JViewport j = new JViewport(); 
        j.setView(l1); 
        // Set the view position of the viewport 
        j.setViewPosition(new Point(50, 25)); 
        // Set the size of the viewport 
        j.setPreferredSize(new Dimension(350, 200)); 
        // Add the scrollable properties 
        j.setScrollMode(JViewport.SIMPLE_SCROLL_MODE); 
  
        JPanel p = new JPanel(); 
        p.add(j); 
        p.add(l2); 
  
        f.add(p, BorderLayout.CENTER); 
        //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        f.setSize(400, 400); 
        f.setVisible(true);    
    }
}
