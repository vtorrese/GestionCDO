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
    
}
