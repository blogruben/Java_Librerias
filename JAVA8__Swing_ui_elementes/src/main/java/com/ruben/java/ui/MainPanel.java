package com.ruben.java.ui;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;


public class MainPanel  {
   private int posCol1 = 30;
   private final static int SPACE = 25;
   private JFrame fr;  
   
   public MainPanel() {
      fr= new JFrame("Swing Elements");  
      fr.setSize(750,500);  
      fr.setLayout(null);  
      fr.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      ImageIcon img = new ImageIcon(App.class.getResource("/images/kittyIcon.png"));
      fr.setIconImage(img.getImage()); 
   }

   
   public void addTitulo(Position column, String titulo){
      JLabel l;  
      l=new JLabel(titulo);  
      l.setBounds(column.getPositionY(),20, 140,30); 
      l.setFont(new Font("Calibri", Font.BOLD, 20));
      fr.add(l);
   }

   public < T> void addLabels(Position pos, String nombre,Class<T> objeto){
      JLabel l;
      posCol1 = posCol1+SPACE;
      l=new JLabel(nombre);  
      l.setBounds(pos.getPositionY(),pos.getPositionX(), 140,30); 
      l.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
      l.setFont(new Font("Calibri", Font.PLAIN, 16));
      l.addMouseListener(new MouseAdapter() {
         public void mouseClicked(MouseEvent event) {
            try {
               objeto.newInstance();
            } catch (Exception e) {
               e.printStackTrace();
            } 
         } 
         public void mouseEntered(MouseEvent evt) {
            //l1.getFont().setSize(l1.getFont().getSize());
            l.setFont(new Font("Calibri", Font.BOLD, 16));
         } 
         public void mouseExited(MouseEvent evt) {
            l.setFont(new Font("Calibri", Font.PLAIN, 16));
         } 
      }); 
      fr.add(l); 
   }

   public void setVisible(){
      fr.setVisible(true);
   }

}