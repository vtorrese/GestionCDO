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
public class editeur {
    ArrayList retour = new ArrayList();

    
    public editeur() {
        
    }
    
    public ArrayList getAll() {
       String requete;
        requete = "SELECT id_edit ID, lib_edit LIB FROM editeur ORDER BY lib_edit";
        Connect demande = new Connect(requete);
        retour = demande.renvoi();//retour.add(demande.renvoi());
        return retour;
    }
    
    public void enregistre(String valeur) {
        String requete = null;
        
        if(controlDB(valeur)==false) {
            requete = "INSERT INTO `editeur`(`lib_edit`) VALUES ('" + valeur + "')";
            new Connect(requete);
        }
            // voir pour faire un message retour
    }
    
    public static boolean controlDB(String valeur) {
        String requete = null;
        boolean retour = false;
        requete = "SELECT COUNT(*) FROM `editeur` WHERE lib_edit = '" + valeur + "'";
        Connect donnees = new Connect(requete);
        if(donnees.renvoi().get(0).toString().contains("1")) {
            retour = true;
        }
        return retour;
    }
    
    public static String lastID() {
        String requete = null;
        requete = "SELECT MAX(id_edit) FROM editeur LIMIT 1";
        Connect lastID = new Connect(requete);
        return lastID.renvoi().get(0).toString();
        
    }
    
}
