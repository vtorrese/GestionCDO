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
import View.Fond_new;
/**
 *
 * @author vince
 */
public class FondController {
    
    public FondController() {
        
    }
    //VERSION AVEC BUG SUR ANNULER
    public static void ajoutCategory(String table) {
        JFrame frame = new JFrame();
        JTextField name = new JTextField();
        Object[] message = {
            "Libellé :", name
            };
        int option = JOptionPane.showConfirmDialog(frame, message, table, JOptionPane.OK_CANCEL_OPTION);
                if (option == JOptionPane.OK_OPTION)
                {
                    if(name.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(frame,"Libellé invalide !");
                        } 
                        else
                        {
                            switch (table)
                            {
                            case "site":
                                /*Action*/;
                                site site = new site();
                                if(site.enregistreRet(name.getText()).contains("ok")) {
                                    JOptionPane.showMessageDialog(frame,"Nouvel élément bien enregistré !");
                                formulaire_fond.localisation_doc.addItem(name.getText());
                                formulaire_fond.SiteMap.put(site.lastID(), name.getText());
                                formulaire_fond.localisation_doc.setSelectedItem(name.getText());
                                } else {JOptionPane.showMessageDialog(frame,"Enregistrement échoué !");}
                                break;


                            case "editeur":
                                /*Action*/;
                                editeur editeur = new editeur();
                                if(editeur.enregistreRet(name.getText()).contains("ok")) {
                                formulaire_fond.editeur_doc.addItem(name.getText());
                                formulaire_fond.EditeurMap.put(editeur.lastID(), name.getText());
                                formulaire_fond.editeur_doc.setSelectedItem(name);
                                } else {JOptionPane.showMessageDialog(frame,"Enregistrement échoué !");}
                                break; 

                           case "langue":
                                /*Action*/;
                                langue langue = new langue();
                                if(langue.enregistreRet(name.getText()).contains("ok")) {
                                formulaire_fond.lang_doc.addItem(name.getText());
                                formulaire_fond.LangMap.put(langue.lastID(), name.getText());
                                formulaire_fond.lang_doc.setSelectedItem(name);
                                } else {JOptionPane.showMessageDialog(frame,"Enregistrement échoué !");}
                                break; 

                            case "niveau":
                                /*Action*/;
                                niveau niveau = new niveau();
                                if(niveau.enregistreRet(name.getText()).contains("ok")) {
                                formulaire_fond.niveau_doc.addItem(name.getText());
                                formulaire_fond.NiveauMap.put(niveau.lastID(), name.getText());
                                formulaire_fond.niveau_doc.setSelectedItem(name);
                                } else {JOptionPane.showMessageDialog(frame,"Enregistrement échoué !");}
                                break;   

                            case "mtclf":
                                /*Action*/;
                                mtclf mtclf = new mtclf();
                                if(mtclf.enregistreRet(name.getText()).contains("ok")) {
                                formulaire_fond.mtclf_doc.addItem(name.getText());
                                formulaire_fond.MtclfMap.put(mtclf.lastID(), name.getText());
                                formulaire_fond.mtclf_doc.setSelectedItem(name);
                                } else {JOptionPane.showMessageDialog(frame,"Enregistrement échoué !");}
                                break;     

                            case "periodique":
                                /*Action*/;
                                periodique periodique = new periodique();
                                if(periodique.enregistreRet(name.getText()).contains("ok")) {
                                formulaire_fond.period_doc.addItem(name.getText());
                                formulaire_fond.PeriodMap.put(periodique.lastID(), name.getText());
                                formulaire_fond.period_doc.setSelectedItem(name);
                                } else {JOptionPane.showMessageDialog(frame,"Enregistrement échoué !");}
                                break;  

                            case "collection":
                                /*Action*/;
                                collection collection = new collection();
                                if(collection.enregistreRet(name.getText()).contains("ok")) {
                                formulaire_fond.coll_doc.addItem(name.getText());
                                formulaire_fond.CollMap.put(collection.lastID(), name.getText());
                                formulaire_fond.coll_doc.setSelectedItem(name);
                                } else {JOptionPane.showMessageDialog(frame,"Enregistrement échoué !");}
                                break;  

                            case "formation":
                                /*Action*/;
                                formation formation = new formation();
                                if(formation.enregistreRet(name.getText()).contains("ok")) {
                                formulaire_fond.form_doc.addItem(name.getText());
                                formulaire_fond.FormationMap.put(formation.lastID(), name.getText());
                                formulaire_fond.form_doc.setSelectedItem(name);
                                } else {JOptionPane.showMessageDialog(frame,"Enregistrement échoué !");}
                                break; 

                            case "promotion":
                                /*Action*/;
                                promotion promotion = new promotion();
                                if(promotion.enregistreRet(name.getText()).contains("ok")) {
                                formulaire_fond.promo_doc.addItem(name.getText());
                                formulaire_fond.PromotionMap.put(promotion.lastID(), name.getText());
                                formulaire_fond.promo_doc.setSelectedItem(name);
                                } else {JOptionPane.showMessageDialog(frame,"Enregistrement échoué !");}
                                break; 


                            default:
                                /*Action*/;
                                frame.dispose();

                            } // switch

                        }
                } // Si on coche l'option OK
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
                if(nom.getText().isEmpty() || prenom.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(frame,"Nom et/ou prénom invalide(s) !");
                } else
                {
                    String Nom = nom.getText();
                    String Prenom = prenom.getText();
                    auteur auteur = new auteur();
                    String ident = Nom + " " + Prenom;
                    if(auteur.enregistreRet(Nom,Prenom).contains("ok")) {
                        formulaire_fond.auteur_doc.addItem(ident);
                        formulaire_fond.AuteurMap.put(promotion.lastID(), ident);
                        formulaire_fond.auteur_doc.setSelectedItem(ident);
                        } 
                }               
            }
    }
    
    public static void enregistreDoc(int nbexemplaire, String notice, int site, String classification, int control,int page,int type,String titre,String sstitre,String dateP,String lieuP,int editeur,String mention,String ISBN,int lang,int niveau,String sommaire,String resume,String url,boolean fichier,boolean image,String dateA,int periodique,int collection,int formation,int promotion,String ISSN,String numero,String entreprise,String tuteur,String duree) {
        document document = new document();
        document.enregistreDoc(nbexemplaire, notice, site, classification, control,page,type,titre,sstitre,dateP,lieuP,editeur,mention,ISBN,lang,niveau,sommaire,resume,url, fichier,image,dateA,periodique,collection,formation,promotion,ISSN,numero,entreprise,tuteur,duree);
    }
    
    public static void modifieDoc(int iddoc, String notice, int site, String classification, int control,int page,int type,String titre,String sstitre,String dateP,String lieuP,int editeur,String mention,String ISBN,int lang,int niveau,String sommaire,String resume,String url,boolean fichier,boolean image,String dateA,int periodique,int collection,int formation,int promotion,String ISSN,String numero,String entreprise,String tuteur,String duree) {
        document document = new document();
        document.modifieDoc(iddoc, notice, site, classification, control,page,type,titre,sstitre,dateP,lieuP,editeur,mention,ISBN,lang,niveau,sommaire,resume,url, fichier,image,dateA,periodique,collection,formation,promotion,ISSN,numero,entreprise,tuteur,duree);
    }
    
    public static void enregistreCompDoc(int lastID,ArrayList listauteur,ArrayList listmtclf) {
        document document = new document();
        document.enregistreCompDoc(lastID,listauteur,listmtclf);
    }
    
    public static String supprimeDoc(int ID_doc) {
        document document = new document();
        return document.supprimeDoc(ID_doc);
    }
    
    public static ArrayList chercheDoc(int type,String notice,String terme,int mtclf,int auteur,int site,String ISBN,String ISSN,int control,boolean fichier) {
        document document = new document();
        return document.cherche_doc(type,notice,terme,mtclf,auteur,site,ISBN,ISSN,control,fichier);
    }
    
    public static ArrayList chercheDocbyId(int iddoc) {
       document chercheByID = new document();
       return chercheByID.cherche_ById(iddoc);
    }
    
    public static ArrayList chercheDocAuteurbyId(int iddoc) {
        auteur chercheByIddoc = new auteur();
       return chercheByIddoc.cherche_ByIddociddoc(iddoc);
    }
     
    public static ArrayList chercheDocMtclfbyId(int iddoc) {
        mtclf chercheByIddoc = new mtclf();
       return chercheByIddoc.cherche_ByIddociddoc(iddoc);
    }
    
    public static int compteExempbyId(int iddoc) {
        document cptex = new document();
        return cptex.compteExemplaire(iddoc);
    }
        
    public static int compteSuggestionById(int iddoc) {
        suggestion sugg = new suggestion();
        return sugg.compte_ByIDDOC(iddoc);
    }
    
    public static void ActionSuggestion(int action,int iddoc) { // pour ajouter supprimer référence de la liste de suggestion
        if(action==1) {
            suggestion suggestion = new suggestion();
            suggestion.affecter_sug(iddoc);
        } else {
            suggestion suggestion = new suggestion();
            suggestion.supprimer_sug(iddoc);
        }
    }
    
    
    public static int lastIndex() {
        document document = new document();
        return document.lastIndex();
    }
}
