/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author vtorrese
 */
public class niveau {
    ArrayList retour = new ArrayList();
    
    public niveau() {
        
    }
    
    public ArrayList getAll() {
       String requete;
        requete = "SELECT id_niveau ID, lib_niveau LIB FROM niveau ORDER BY id_niveau";
        Connect demande = new Connect(requete);
        retour = demande.renvoi();//retour.add(demande.renvoi());
        return retour;
    }
    
    
    public String enregistreRet(String valeur) {
        String requete = null;
        String entree = null;
        String message = null;
            if(controlDB(valeur)==false) {
                entree = "(";
                entree = entree + "\"" + valeur + "\")";
                requete = "INSERT INTO `niveau`(`lib_niveau`) VALUES " + entree;
                new Connect(requete);
                message = "ok";
            } else {
                message = "ko";
            }
        return message;
        }
    
    public static boolean controlDB(String valeur) {
        String requete = null;
        boolean retour = false;
        requete = "SELECT COUNT(*) FROM `niveau` WHERE lib_niveau = \"" + valeur + "\"";
        Connect donnees = new Connect(requete);
        if(donnees.renvoi().get(0).toString().contains("1")) {
            retour = true;
        }
        return retour;
    }
    
    public static String lastID() {
        String requete = null;
        requete = "SELECT MAX(id_niveau) FROM niveau LIMIT 1";
        Connect lastID = new Connect(requete);
        return lastID.renvoi().get(0).toString();
        
    }
    
}
