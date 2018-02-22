/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import Model.*;
import java.util.ArrayList;
import view.MaFenetre;

/**
 *
 * @author vince
 */
public class MainController {
    
    public MainController() {
        
        status status = new status();
        site site = new site();
        civilite civil = new civilite();
        formation formation = new formation();
        promotion promotion = new promotion();
        type type = new type();
        editeur editeur = new editeur();
        langue langue = new langue();
        niveau niveau = new niveau();
        auteur auteur = new auteur();
        mtclf mtclf = new mtclf();
        periodique periodique = new periodique();
        collection collection = new collection();
        utilisateur utilisateur = new utilisateur();
        
        ArrayList donnees = new ArrayList();
        donnees.add(status.getAll());       //0
        donnees.add(site.getAll());         //1
        donnees.add(civil.getAll());        //2
        donnees.add(formation.getAll());    //3
        donnees.add(promotion.getAll());    //4
        donnees.add(type.getAll());         //5
        donnees.add(editeur.getAll());      //6
        donnees.add(langue.getAll());       //7
        donnees.add(niveau.getAll());       //8
        donnees.add(auteur.getAll());       //9
        donnees.add(mtclf.getAll());        //10
        donnees.add(periodique.getAll());   //11
        donnees.add(collection.getAll());   //12
        donnees.add(utilisateur.getAll());   //13
        
        new MaFenetre(donnees);
        
    }
    
 

}