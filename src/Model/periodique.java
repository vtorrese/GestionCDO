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
public class periodique {
    ArrayList retour = new ArrayList();
    
    public periodique() {
        
    }
    
    public ArrayList getAll() {
       String requete;
        requete = "SELECT id_periodique ID, lib_periodique LIB FROM periodique";
        Connect demande = new Connect(requete);
        retour = demande.renvoi();//retour.add(demande.renvoi());
        return retour;
    }
    
}
