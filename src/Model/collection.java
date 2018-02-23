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
public class collection {
    ArrayList retour = new ArrayList();
    
    public collection() {
        
    }
    
    public ArrayList getAll() {
       String requete;
        requete = "SELECT id_collection ID, lib_collection LIB FROM collection";
        Connect demande = new Connect(requete);
        retour = demande.renvoi();//retour.add(demande.renvoi());
        return retour;
    }
    
    public String enregistreRet(String valeur) {
        String requete = null;
        String message = null;
            if(controlDB(valeur)==false) {
                requete = "INSERT INTO `collection`(`lib_collection`) VALUES ('" + valeur + "')";
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
        requete = "SELECT COUNT(*) FROM `collection` WHERE lib_collection = '" + valeur + "'";
        Connect donnees = new Connect(requete);
        if(donnees.renvoi().get(0).toString().contains("1")) {
            retour = true;
        }
        return retour;
    }
    
    public static String lastID() {
        String requete = null;
        requete = "SELECT MAX(id_collection) FROM collection LIMIT 1";
        Connect lastID = new Connect(requete);
        return lastID.renvoi().get(0).toString();
        
    }
}
