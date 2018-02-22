/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import View.formulaire_fond;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author vince
 */
public class FondController {
    
    public FondController() {
        
    }
    
    public static void ajoutCategory(String table) {
        JFrame frame = new JFrame();
        frame.setTitle(table);
        String name = JOptionPane.showInputDialog(frame, table);
        
        if(!name.isEmpty()) {
            switch (table)
            {
            case "editeur":
                /*Action*/;
                editeur editeur = new editeur();
                editeur.enregistre(name);
                String ID = editeur.lastID(); // fo vérifier le retour de l'enregistrement !!
                formulaire_fond.editeur_doc.addItem(name);
                formulaire_fond.EditeurMap.put(ID, name);
                formulaire_fond.editeur_doc.setSelectedItem(name);
                break;        
            default:
                /*Action*/;
                frame.dispose();
                
            }
        }
        else
        {
            frame.dispose();
           
        }
        
    }
}
