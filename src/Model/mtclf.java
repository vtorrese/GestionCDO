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
    
}
