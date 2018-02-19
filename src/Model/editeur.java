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
    
}
