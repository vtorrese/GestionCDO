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
public class formation {
        ArrayList retour = new ArrayList();
    
    public formation() {
    
    } 
    
    public ArrayList getAll() {
       String requete;
        requete = "SELECT id_formation ID, lib_formation LIB FROM formation ORDER BY LIB";
        Connect demande = new Connect(requete);
        retour = demande.renvoi();//retour.add(demande.renvoi());
        return retour;
    }
}
