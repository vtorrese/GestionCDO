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
public class pret {
    
    ArrayList retour = new ArrayList();
    int id_prt;
    String DateS;
    String DateR;
    int user;
    int site;
    int status_prt;
    int doc_prt;

    public int getId_prt() {
        return id_prt;
    }

    public void setId_prt(int id_prt) {
        this.id_prt = id_prt;
    }

    public String getDateS() {
        return DateS;
    }

    public void setDateS(String DateS) {
        this.DateS = DateS;
    }

    public String getDateR() {
        return DateR;
    }

    public void setDateR(String DateR) {
        this.DateR = DateR;
    }

    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }

    public int getSite() {
        return site;
    }

    public void setSite(int site) {
        this.site = site;
    }

    public int getStatus_prt() {
        return status_prt;
    }

    public void setStatus_prt(int status_prt) {
        this.status_prt = status_prt;
    }

    public int getDoc_prt() {
        return doc_prt;
    }

    public void setDoc_prt(int doc_prt) {
        this.doc_prt = doc_prt;
    }
    
    public pret() {
        
    }
    
    public ArrayList cherche_ByUser(int iduser) {
        String requete = null;
        requete = "SELECT titre_doc, CASE status_prt WHEN 1 THEN 'En cours' WHEN 2 THEN 'Terminé' ELSE lib_stat_prt END, CONCAT(Day(`dateR_prt`),\"/\",MONTH(`dateR_prt`),\"/\",YEAR(`dateR_prt`)) as datex, CASE WHEN status_prt=1 AND dateR_prt < NOW() THEN \"en retard\" ELSE \"OK\" END FROM `pret` LEFT JOIN document ON doc_prt = id_doc LEFT JOIN status_prt ON status_prt = id_stat_prt WHERE `user_prt` ='" + iduser + "' ORDER BY dateR_prt DESC";
        Connect donnees = new Connect(requete);
        retour = donnees.renvoi();
        return retour; 
    }
    
    public static int compte_ByIDDOC(int iddoc) {
        String requete = null;
        requete = "SELECT COUNT(*) as EnCours FROM pret WHERE `doc_prt` ='" + iddoc + "'";
        Connect donnees = new Connect(requete);
        return donnees.renvoiInt();
    }
    
    
}
