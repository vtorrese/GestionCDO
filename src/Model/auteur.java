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
public class auteur {
    ArrayList retour = new ArrayList();
    
    public auteur() {
        
    }
    
    public ArrayList getAll() {
       String requete;
        requete = "SELECT `id_auteur` ID, CONCAT(`nom_auteur`,\" \",`prenom_auteur`) Lib FROM `auteur` ORDER BY `nom_auteur`";
        Connect demande = new Connect(requete);
        retour = demande.renvoi();//retour.add(demande.renvoi());
        return retour;
    }
    
        public String enregistreRet(String nom, String prenom) {
        String requete = null;
        String valeur = null;
        String message = null;
            if(controlDB(nom,prenom)==false) {
                valeur = "(";
                valeur = valeur + "\"" + nom + "\",";
                valeur = valeur + "\"" + prenom + "\")";
                requete = "INSERT INTO `auteur`(`nom_auteur`,`prenom_auteur`) VALUES " + valeur;
                new Connect(requete);
                message = "ok";
            } else {
                message = "ko";
            }
        return message;
        }
    
    public static boolean controlDB(String nom, String prenom) {
        String requete = null;
        boolean retour = false;
        requete = "SELECT COUNT(*) FROM `auteur` WHERE nom_auteur = \"" + nom + "\" AND prenom_auteur=\"" + prenom + "\"";
        Connect donnees = new Connect(requete);
        if(donnees.renvoi().get(0).toString().contains("1")) {
            retour = true;
        }
        return retour;
    }
    
    public ArrayList cherche_ByIddociddoc( int iddoc) {
        String requete = null;
        requete = "SELECT auteur_docauteur as IDauteur, CONCAT(nom_auteur,\" \",prenom_auteur) as Nom FROM `doc_auteur` JOIN auteur ON `auteur_docauteur` = id_auteur where `doc_docauteur` = '" + iddoc + "'";
        Connect donnees = new Connect(requete);
        retour = donnees.renvoi();//retour.add(demande.renvoi());
        return retour;
    }
    
    
    public static String lastID() {
        String requete = null;
        requete = "SELECT MAX(id_auteur) FROM auteur LIMIT 1";
        Connect lastID = new Connect(requete);
        return lastID.renvoi().get(0).toString();
        
    }
            
}
