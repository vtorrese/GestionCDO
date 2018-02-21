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
        requete = "SELECT `id_auteur` ID, CONCAT(`prenom_auteur`,\" \",`nom_auteur`) Lib FROM `auteur` ORDER BY `nom_auteur`";
        Connect demande = new Connect(requete);
        retour = demande.renvoi();//retour.add(demande.renvoi());
        return retour;
    }
            
}
