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
public class utilisateur {
    ArrayList retour = new ArrayList();
    
        int status;
        int formation;
        int promotion;
        int site;
        int civil;
        String nom;
        String prenom;
        String adresse;
        String ville;
        String CP;
        String tel;
        String mail;
        String mdp;

    public ArrayList getRetour() {
        return retour;
    }

    public void setRetour(ArrayList retour) {
        this.retour = retour;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getFormation() {
        return formation;
    }

    public void setFormation(int formation) {
        this.formation = formation;
    }

    public int getPromotion() {
        return promotion;
    }

    public void setPromotion(int promotion) {
        this.promotion = promotion;
    }

    public int getSite() {
        return site;
    }

    public void setSite(int site) {
        this.site = site;
    }

    public int getCivil() {
        return civil;
    }

    public void setCivil(int civil) {
        this.civil = civil;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getCP() {
        return CP;
    }

    public void setCP(String CP) {
        this.CP = CP;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

        public utilisateur() {
    
        } 
        
        
}
