package com.ruben.java.ui;

import com.ruben.java.ui.swing.apps.LongitudTexto;
import com.ruben.java.ui.swing.apps.Seleccionar;
import com.ruben.java.ui.swing.apps.SumarNumeros;
import com.ruben.java.ui.swing.apps.VerDirectorios;
import com.ruben.java.ui.swing.controles.MenuBar;
import com.ruben.java.ui.swing.controles.CheckBoxMenuItem;
import com.ruben.java.ui.swing.controles.Menu;
import com.ruben.java.ui.swing.controles.Panel;
import com.ruben.java.ui.swing.controles.RootPane;
import com.ruben.java.ui.swing.controles.ScrollBar;
import com.ruben.java.ui.swing.controles.FileChooser;
import com.ruben.java.ui.swing.controles.ToolBar;
import com.ruben.java.ui.swing.controles.Tree;
import com.ruben.java.ui.swing.controles.ScrollPane;
import com.ruben.java.ui.swing.controles.SplitPane;
import com.ruben.java.ui.swing.controles.TextPane;
import com.ruben.java.ui.swing.controles.Viewport;
import com.ruben.java.ui.swing.elementos.ToggleButton;
import com.ruben.java.ui.swing.elementos.ToolTip;
import com.ruben.java.ui.swing.elementos.Button;
import com.ruben.java.ui.swing.elementos.Checkbox;
import com.ruben.java.ui.swing.elementos.ComboBox;
import com.ruben.java.ui.swing.elementos.Component;
import com.ruben.java.ui.swing.elementos.DesktopPane;
import com.ruben.java.ui.swing.elementos.EditorPane;
import com.ruben.java.ui.swing.elementos.Label;
import com.ruben.java.ui.swing.elementos.LayeredPane;
import com.ruben.java.ui.swing.elementos.Input;
import com.ruben.java.ui.swing.elementos.List;
import com.ruben.java.ui.swing.elementos.PopupMenu;
import com.ruben.java.ui.swing.elementos.OptionPane_Warning;
import com.ruben.java.ui.swing.elementos.OptionPane;
import com.ruben.java.ui.swing.elementos.OptionPane_Input;
import com.ruben.java.ui.swing.elementos.Opcion;
import com.ruben.java.ui.swing.elementos.Tabla;
import com.ruben.java.ui.swing.elementos.TextArea;
import com.ruben.java.ui.swing.elementos.TextField;
import com.ruben.java.ui.swing.elementos.Icon;

import static  com.ruben.java.ui.Position.FIRST_COLUMN;
import static  com.ruben.java.ui.Position.SECOND_COLUMN;
import static  com.ruben.java.ui.Position.THIRD_COLUMN;
import static  com.ruben.java.ui.Position.FOURTH_COLUMN;

import com.ruben.java.ui.swing.apps.Login;


public class App {
   public static void main(String[] args) {
      MainPanel mp = new MainPanel();

      mp.addTitulo(FIRST_COLUMN,"Elementos");
      mp.addLabels(FIRST_COLUMN, "Button",Button.class);
      mp.addLabels(FIRST_COLUMN,"Checkbox", Checkbox.class);
      mp.addLabels(FIRST_COLUMN,"ComboBox",ComboBox.class);
      mp.addLabels(FIRST_COLUMN,"Label",Label.class);
      mp.addLabels(FIRST_COLUMN,"Input",Input.class);
      mp.addLabels(FIRST_COLUMN,"Opcion",Opcion.class);
      mp.addLabels(FIRST_COLUMN,"Tabla",Tabla.class);
      mp.addLabels(FIRST_COLUMN,"List",List.class);
      mp.addLabels(FIRST_COLUMN,"ToggleButton", ToggleButton.class);
      mp.addLabels(FIRST_COLUMN,"OptionPane",OptionPane.class);

      mp.addTitulo(SECOND_COLUMN,"Elementos");
      mp.addLabels(SECOND_COLUMN,"OptionPane_Warning",OptionPane_Warning.class);
      mp.addLabels(SECOND_COLUMN,"OptionPane_Input",OptionPane_Input.class);
      mp.addLabels(SECOND_COLUMN,"PopupMenu",PopupMenu.class);
      mp.addLabels(SECOND_COLUMN,"TextField",TextField.class);
      mp.addLabels(SECOND_COLUMN,"TextArea",TextArea.class);
      mp.addLabels(SECOND_COLUMN,"Component",Component.class);
      mp.addLabels(SECOND_COLUMN,"LayeredPane",LayeredPane.class);
      mp.addLabels(SECOND_COLUMN,"DesktopPane",DesktopPane.class);
      mp.addLabels(SECOND_COLUMN,"EditorPane",EditorPane.class);
      mp.addLabels(SECOND_COLUMN,"ToolTip",ToolTip.class);
      mp.addLabels(SECOND_COLUMN,"Icon",Icon.class);

      mp.addTitulo(THIRD_COLUMN,"Controles");
      mp.addLabels(THIRD_COLUMN,"CheckBoxMenuItem",CheckBoxMenuItem.class);
      mp.addLabels(THIRD_COLUMN,"ScrollBar",ScrollBar.class);
      mp.addLabels(THIRD_COLUMN,"MenuBar",MenuBar.class);
      mp.addLabels(THIRD_COLUMN,"ToolBar",ToolBar.class);
      mp.addLabels(THIRD_COLUMN,"Menu",Menu.class);
      mp.addLabels(THIRD_COLUMN,"Tree",Tree.class);
      mp.addLabels(THIRD_COLUMN,"Panel",Panel.class);
      mp.addLabels(THIRD_COLUMN,"FileChooser",FileChooser.class);
      mp.addLabels(THIRD_COLUMN,"ScrollPane",ScrollPane.class);
      mp.addLabels(THIRD_COLUMN,"Viewport",Viewport.class);
      mp.addLabels(THIRD_COLUMN,"SplitPane",SplitPane.class);
      mp.addLabels(THIRD_COLUMN,"TextPane",TextPane.class);
      mp.addLabels(THIRD_COLUMN,"RootPane",RootPane.class);

      mp.addTitulo(FOURTH_COLUMN,"Apps Simples");
      mp.addLabels(FOURTH_COLUMN,"SumarNumeros",SumarNumeros.class);
      mp.addLabels(FOURTH_COLUMN,"Seleccionar",Seleccionar.class);
      mp.addLabels(FOURTH_COLUMN,"LongitudTexto",LongitudTexto.class);
      mp.addLabels(FOURTH_COLUMN,"Login",Login.class);
      //
      mp.addLabels(FOURTH_COLUMN,"VerDirectorios",VerDirectorios.class);





      mp.setVisible();
   }


}