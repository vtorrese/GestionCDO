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
}
