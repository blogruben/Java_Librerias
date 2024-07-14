package com.ruben.java.ui.swing.controles;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu {

    public Menu() {
        JMenu menu;    
        JMenuItem i1, i2;         
        JFrame f= new JFrame("Separator Example");    
        JMenuBar mb=new JMenuBar();    
        menu=new JMenu("Menu");    
        i1=new JMenuItem("Item 1");    
        i2=new JMenuItem("Item 2");       
        menu.add(i1);  
        menu.addSeparator();  
        menu.add(i2);  
        mb.add(menu);    
        f.setJMenuBar(mb);    
        f.setSize(400,400);    
        f.setLayout(null);    
        f.setVisible(true);    
    }
    
}
