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
public class langue {
    ArrayList retour = new ArrayList();
    
    public langue() {
        
    }
    
    public ArrayList getAll() {
       String requete;
        requete = "SELECT id_lang ID, lib_lang LIB FROM langue ORDER BY lib_lang";
        Connect demande = new Connect(requete);
        retour = demande.renvoi();//retour.add(demande.renvoi());
        return retour;
    }
        
    public String enregistreRet(String valeur) {
        String requete = null;
        String message = null;
            if(controlDB(valeur)==false && valeur.length()<3) {
                requete = "INSERT INTO `langue`(`lib_lang`) VALUES ('" + valeur + "')";
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
        requete = "SELECT COUNT(*) FROM `langue` WHERE lib_lang = '" + valeur + "'";
        Connect donnees = new Connect(requete);
        if(donnees.renvoi().get(0).toString().contains("1")) {
            retour = true;
        }
        return retour;
    }
    
    public static String lastID() {
        String requete = null;
        requete = "SELECT MAX(id_lang) FROM langue LIMIT 1";
        Connect lastID = new Connect(requete);
        return lastID.renvoi().get(0).toString();
        
    }
    
}
