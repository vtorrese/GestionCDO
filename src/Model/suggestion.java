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
public class suggestion {
     ArrayList retour = new ArrayList();
     
     public suggestion() {
     }
     
    public void supprimer_sug(int iddoc) {
        String sup_doc = null;
        sup_doc = "DELETE FROM `suggestion` WHERE `doc_suggest` ='" + iddoc + "'";
        new Connect(sup_doc);
     }
    
    public static int compte_ByIDDOC(int iddoc) {
        String requete = null;
        requete = "SELECT COUNT(*) as EnSug FROM suggestion WHERE `doc_suggest` ='" + iddoc + "'";
        Connect donnees = new Connect(requete);
        return donnees.renvoiInt();
    }
}
