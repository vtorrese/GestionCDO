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
public class mtclf {
    ArrayList retour = new ArrayList();
    
    public mtclf() {
        
    }
    
    public ArrayList getAll() {
       String requete;
        requete = "SELECT id_motclef ID, lib_motclef LIB FROM motclef ORDER BY lib_motclef";
        Connect demande = new Connect(requete);
        retour = demande.renvoi();//retour.add(demande.renvoi());
        return retour;
    }
    
    public String enregistreRet(String valeur) {
        String requete = null;
        String message = null;
            if(controlDB(valeur)==false) {
                requete = "INSERT INTO `motclef`(`lib_motclef`) VALUES ('" + valeur + "')";
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
        requete = "SELECT COUNT(*) FROM `motclef` WHERE lib_motclef = '" + valeur + "'";
        Connect donnees = new Connect(requete);
        if(donnees.renvoi().get(0).toString().contains("1")) {
            retour = true;
        }
        return retour;
    }
    
    public ArrayList cherche_ByIddociddoc( int iddoc) {
        String requete = null;
        requete = "SELECT motclef_docmotclef as IDmotclef, lib_motclef FROM `doc_motclef` JOIN motclef ON `motclef_docmotclef` = id_motclef where `doc_docmotclef` = '" + iddoc + "'";
        Connect donnees = new Connect(requete);
        retour = donnees.renvoi();//retour.add(demande.renvoi());
        return retour;
    }
    
    public static String lastID() {
        String requete = null;
        requete = "SELECT MAX(id_motclef) FROM motclef LIMIT 1";
        Connect lastID = new Connect(requete);
        return lastID.renvoi().get(0).toString();
        
    }
    
}
