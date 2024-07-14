package com.ruben.java.ui.swing.apps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Seleccionar  extends JFrame implements ActionListener {
    JLabel l;  
    JCheckBox cb1,cb2,cb3;  
    JButton b;  

    public Seleccionar() {
        l=new JLabel("Pedido Comida");  
        l.setBounds(50,50,300,20);  
        cb1=new JCheckBox("Pizza - 25€");  
        cb1.setBounds(100,100,150,20);  
        cb2=new JCheckBox("Hamburguesas - 18€");  
        cb2.setBounds(100,150,150,20);  
        cb3=new JCheckBox("Sandwich - 12€");  
        cb3.setBounds(100,200,150,20);  
        b=new JButton("Pedido");  
        b.setBounds(100,250,80,30);  
        b.addActionListener(this);  
        add(l);add(cb1);add(cb2);add(cb3);add(b);  
        setSize(400,400);  
        setLayout(null);  
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){  
        float amount=0;  
        String msg="";  
        if(cb1.isSelected()){  
            amount+=25;  
            msg="Pizza: 25\n";  
        }  
        if(cb2.isSelected()){  
            amount+=18;  
            msg+="Hamburguesa: 18\n";  
        }  
        if(cb3.isSelected()){  
            amount+=12;  
            msg+="sandwich: 12\n";  
        }  
        msg+="-----------------\n";  
        JOptionPane.showMessageDialog(this,msg+"Total: "+amount);  
    }

    
}
