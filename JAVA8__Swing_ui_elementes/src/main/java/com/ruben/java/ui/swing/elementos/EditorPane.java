package com.ruben.java.ui.swing.elementos;

import javax.swing.JEditorPane;  
import javax.swing.JFrame;  
  
public class EditorPane {  
    JFrame f = null;  
  
    public EditorPane() {  
        f = new JFrame("JEditorPane");  
        //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        f.setSize(400, 200);  
        JEditorPane p = new JEditorPane();  
        p.setContentType("text/plain");  
        p.setText("Este es un texto."  
                + " De ejemplo.");  
        f.setContentPane(p);  
        f.setVisible(true);  
    }  
}  
    

