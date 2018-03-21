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
public class reservation {
    
    ArrayList retour = new ArrayList();
    int id_reserv;
    String Date_reserv;
    int user_reserv;
    int doc_reserv;

    public int getId_reserv() {
        return id_reserv;
    }

    public void setId_reserv(int id_reserv) {
        this.id_reserv = id_reserv;
    }

    public String getDate_reserv() {
        return Date_reserv;
    }

    public void setDate_reserv(String Date_reserv) {
        this.Date_reserv = Date_reserv;
    }

    public int getUser_reserv() {
        return user_reserv;
    }

    public void setUser_reserv(int user_reserv) {
        this.user_reserv = user_reserv;
    }

    public int getDoc_reserv() {
        return doc_reserv;
    }

    public void setDoc_reserv(int doc_reserv) {
        this.doc_reserv = doc_reserv;
    }
    
    public ArrayList cherche_ByUser(int iduser) {
        String requete = null;
        requete = "SELECT `id_reserv`, CONCAT(Day(`date_reserv`),\"/\",MONTH(`date_reserv`),\"/\",YEAR(`date_reserv`),\" (\",HOUR(`date_reserv`),\"h \",MINUTE(`date_reserv`),\"mns)\") as datex, `user_reserv`, `doc_reserv`, titre_doc FROM `reservation` JOIN document ON `doc_reserv` = id_doc WHERE user_reserv ='" + iduser + "' ORDER BY date_reserv";
        Connect donnees = new Connect(requete);
        retour = donnees.renvoi();
        return retour; 
    }
    
    public static int compte_ByIDDOC(int iddoc) {
        String requete = null;
        requete = "SELECT COUNT(*) as EnCoursR FROM reservation WHERE `doc_reserv` ='" + iddoc + "'";
        Connect donnees = new Connect(requete);
        return donnees.renvoiInt();
    }
}
