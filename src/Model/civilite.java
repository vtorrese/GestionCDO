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
public class civilite {
    ArrayList retour = new ArrayList();
    
    public civilite() {
        
    }
    
    public ArrayList getAll() {
       String requete;
        requete = "SELECT id_civil ID, lib_civil LIB FROM civilite";
        Connect demande = new Connect(requete);
        retour = demande.renvoi();//retour.add(demande.renvoi());
        return retour;
    }
}
