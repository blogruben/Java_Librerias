package com.ruben.java.ui.swing.controles;

import javax.swing.JFileChooser;  
import javax.swing.filechooser.FileSystemView;  

public class FileChooser {

    public FileChooser() {
        //JFileChooser jf = new JFileChooser(); // default constructor JFileChooser is called.  
        //JFileChooser jf = new JFileChooser("c:"); // parameterised constructor JFileChooser( File currentDirectory) is called. 
        //JFileChooser jf = new JFileChooser("c:", FileSystemView.getFileSystemView()); // parameterised constructor JFileChooser(File currentDirectory, FileSystemViewfsv) is called.  
        //JFileChooser jf = new JFileChooser(FileSystemView.getFileSystemView()); // parameterised constructor JFileChooser(FileSystemViewfsv) is called.  
        //JFileChooser jf = new JFileChooser("C:\\ruta"); // parameterised constructor JFileChooser(string current DirectoryPath) is called.  
        //JFileChooser jf = new JFileChooser("C:", FileSystemView.getFileSystemView());// parameterised constructor JFileChooser( String currentDirectoryPath, FileSystemViewfsv ) is called.  
        //JFileChooser jf = new JFileChooser(new File(" C:\\Users "));// parameterised constructor JFileChooser( file ) is called.  
        //JFileChooser jf = new JFileChooser(new File("C:\\ruta\\"), FileSystemView.getFileSystemView());// parameterised constructor JFileChooser( file ) is called. 

        JFileChooser jf = new JFileChooser(FileSystemView.getFileSystemView()); 
        jf.showSaveDialog(null);  
    }
    
}
