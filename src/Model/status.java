/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author vince
 */
public class status {
    
    ArrayList retour = new ArrayList();
    
    public status() {
 
    }
    
    public ArrayList getAll() {
       String requete;
        requete = "SELECT id_stat_user ID, lib_stat_user LIB FROM status_user ORDER BY LIB ";
        Connect demande = new Connect(requete);
        retour = demande.renvoi();//retour.add(demande.renvoi());
        return retour;
    }
  
}
