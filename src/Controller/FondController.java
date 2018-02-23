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
import javax.swing.JTextField;
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
                if(editeur.enregistreRet(name).contains("ok")) {
                formulaire_fond.editeur_doc.addItem(name);
                formulaire_fond.EditeurMap.put(editeur.lastID(), name);
                formulaire_fond.editeur_doc.setSelectedItem(name);
                }
                break; 
                
           case "langue":
                /*Action*/;
                langue langue = new langue();
                if(langue.enregistreRet(name).contains("ok")) {
                formulaire_fond.lang_doc.addItem(name);
                formulaire_fond.LangMap.put(langue.lastID(), name);
                formulaire_fond.lang_doc.setSelectedItem(name);
                }
                break; 
                
            case "niveau":
                /*Action*/;
                niveau niveau = new niveau();
                if(niveau.enregistreRet(name).contains("ok")) {
                formulaire_fond.niveau_doc.addItem(name);
                formulaire_fond.NiveauMap.put(niveau.lastID(), name);
                formulaire_fond.niveau_doc.setSelectedItem(name);
                }
                break;   
             
            case "mtclf":
                /*Action*/;
                mtclf mtclf = new mtclf();
                if(mtclf.enregistreRet(name).contains("ok")) {
                formulaire_fond.mtclf_doc.addItem(name);
                formulaire_fond.MtclfMap.put(mtclf.lastID(), name);
                formulaire_fond.mtclf_doc.setSelectedItem(name);
                }
                break;     
                
            case "periodique":
                /*Action*/;
                periodique periodique = new periodique();
                if(periodique.enregistreRet(name).contains("ok")) {
                formulaire_fond.period_doc.addItem(name);
                formulaire_fond.PeriodMap.put(periodique.lastID(), name);
                formulaire_fond.period_doc.setSelectedItem(name);
                }
                break;  
                
            case "collection":
                /*Action*/;
                collection collection = new collection();
                if(collection.enregistreRet(name).contains("ok")) {
                formulaire_fond.coll_doc.addItem(name);
                formulaire_fond.CollMap.put(collection.lastID(), name);
                formulaire_fond.coll_doc.setSelectedItem(name);
                }
                break;  
                
            case "formation":
                /*Action*/;
                formation formation = new formation();
                if(formation.enregistreRet(name).contains("ok")) {
                formulaire_fond.form_doc.addItem(name);
                formulaire_fond.FormationMap.put(formation.lastID(), name);
                formulaire_fond.form_doc.setSelectedItem(name);
                }
                break; 
                
            case "promotion":
                /*Action*/;
                promotion promotion = new promotion();
                if(promotion.enregistreRet(name).contains("ok")) {
                formulaire_fond.promo_doc.addItem(name);
                formulaire_fond.PromotionMap.put(promotion.lastID(), name);
                formulaire_fond.promo_doc.setSelectedItem(name);
                }
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
    
    public static void ajoutAuteur() {
        JFrame frame = new JFrame();
        JTextField nom = new JTextField();
        JTextField prenom = new JTextField();
        Object[] message = {
            "Nom :", nom,
            "Prénom :", prenom
            };
        int option = JOptionPane.showConfirmDialog(frame, message, "Nouvel auteur", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION)
            {
                if(!nom.getText().isEmpty() || !prenom.getText().isEmpty()) {
                    String Nom = nom.getText();
                    String Prenom = prenom.getText();
                    System.out.println(Nom+" "+Prenom);
                } else
                {
                    JOptionPane.showMessageDialog(frame,"Nom et/ou prénom invalide(s) !");
                }
                
            }
       
    }
}
