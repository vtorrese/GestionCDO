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
    
    public void enregistre_user(int status, String nom, String prenom, int site, int formation, int promotion, int civil, String adresse, String CP, String ville, String tel, String mail, String mdp) {
        String requete = null;
        String valeur = null;
        //System.out.println(status);
        if(status==2) {
        valeur = "(\"" + nom + "\",\"" + prenom + "\",'"  + mdp + "',\""  + adresse + "\",'" + CP + "',\"" + ville + "\",'" + tel + "','" + mail + "','"  + status + "','"  + site + "','" + civil + "','" + promotion + "','" + formation + "')"; 
        requete = "INSERT INTO `user`(`nom_user`, `prenom_user`, `mdp_user`, `adresse_user`, `CP_user`, `ville_user`, `phone_user`, `mail_user`, `status_user`, `site_user`, `civil_user`, `promo_user`, `form_user`) VALUES ";
        } 
        else
        {
        valeur = "(\"" + nom + "\",\"" + prenom + "\",'"  + mdp + "',\""  + adresse + "\",'" + CP + "',\"" + ville + "\",'" + tel + "','" + mail + "','"  + status + "','"  + site + "','" + civil + "')"; 
        requete = "INSERT INTO `user`(`nom_user`, `prenom_user`, `mdp_user`, `adresse_user`, `CP_user`, `ville_user`, `phone_user`, `mail_user`, `status_user`, `site_user`, `civil_user`) VALUES ";  
        }
        
        new Connect(requete + valeur);
    }
    
    public ArrayList cherche_user(int status,String nom,int formation,int promotion) {
        String requete = null;
        String req_status = "";
        String req_nom = "";
        String req_form = "";
        String req_promo = "";
        String and = " AND ";
        boolean controle = false;
        if(status!=2){
            requete = "SELECT `id_user`, `nom_user`, `prenom_user`, `mdp_user`, `adresse_user`, `CP_user`, `ville_user`, `phone_user`, `mail_user`, `status_user`, lib_stat_user, `site_user`, lib_site, `civil_user`, lib_civil FROM `user` JOIN status_user ON status_user = id_stat_user JOIN site ON site_user = id_site JOIN civilite ON civil_user = id_civil WHERE ";
        } else {
            requete = "SELECT `id_user`, `nom_user`, `prenom_user`, `mdp_user`, `adresse_user`, `CP_user`, `ville_user`, `phone_user`, `mail_user`, `status_user`, lib_stat_user, `site_user`, lib_site, `civil_user`, lib_civil, form_user, lib_formation, promo_user, lib_promotion FROM `user` JOIN status_user ON status_user = id_stat_user JOIN site ON site_user = id_site JOIN civilite ON civil_user = id_civil JOIN formation ON form_user = id_formation JOIN promotion ON promo_user = id_promotion WHERE ";
        }
        
        if(status==0){req_status = req_status;} else {req_status = "status_user = '" + status + "'";controle = true;}
        if(nom.isEmpty()){req_nom = req_nom;} else {req_nom = "nom_user LIKE (\"%" + nom + "%\")";if(controle==true) {req_nom = and.concat(req_nom);};controle = true;}
        if(formation==0){req_form = req_form;} else {req_form = "form_user = '" + formation + "'";if(controle==true) {req_form = and.concat(req_form);};controle = true;}
        if(promotion==0){req_promo = req_promo;} else {req_promo = "promo_user = '" + promotion + "'";if(controle==true) {req_promo = and.concat(req_promo);};controle = true;}
        requete = requete+=req_status+=req_nom+=req_form+=req_promo;
        
        Connect donnees = new Connect(requete);
        retour = donnees.renvoi();
        return retour; 
    }
    
    public ArrayList cherche_userById(int iduser, int idstatus) {
        String requete = null;
        if(idstatus==2) {  
        requete = "SELECT `id_user`, `nom_user`, `prenom_user`, `mdp_user`, `adresse_user`, `CP_user`, `ville_user`, `phone_user`, `mail_user`, `status_user`, lib_stat_user, `site_user`, lib_site, `civil_user`, lib_civil, form_user, lib_formation, promo_user, lib_promotion FROM `user` LEFT JOIN status_user ON status_user = id_stat_user LEFT JOIN site ON site_user = id_site LEFT JOIN civilite ON civil_user = id_civil LEFT JOIN formation ON form_user = id_formation LEFT JOIN promotion ON promo_user = id_promotion WHERE id_user='" + iduser + "' ORDER BY Nom_user";
        }
        else
        {
        requete = "SELECT `id_user`, `nom_user`, `prenom_user`, `mdp_user`, `adresse_user`, `CP_user`, `ville_user`, `phone_user`, `mail_user`, `status_user`, lib_stat_user, `site_user`, lib_site, `civil_user`, lib_civil FROM `user` LEFT JOIN status_user ON status_user = id_stat_user LEFT JOIN site ON site_user = id_site LEFT JOIN civilite ON civil_user = id_civil WHERE id_user='" + iduser + "' ORDER BY Nom_user";
        }
        Connect donnees = new Connect(requete);
        retour = donnees.renvoi();
        
        return retour; 
    }
    
    public void supprimer_user(String iduser) {
        String requete = null;
        requete = "DELETE FROM user WHERE id_user ='" + iduser + "'";
        new Connect(requete);
    }
    
    public void modifier_user(int ID, int status, String nom, String prenom, int site, int formation, int promotion, int civil, String adresse, String CP, String ville, String tel, String mail, String mdp) {
        String requete = null;
        requete = "UPDATE `user` SET `nom_user`=\"" + nom + "\",`prenom_user`=\"" + prenom + "\",`adresse_user`=\"" + adresse + "\",`CP_user`='" + CP + "',`ville_user`=\"" + ville + "\",`phone_user`='" + tel + "',`mail_user`='" +  mail + "',`status_user`='" + status + "',`site_user`='" + site + "',`civil_user`='" + civil + "' ";
        if(!mdp.isEmpty()) {
            requete = requete + ", mdp_user ='" + mdp + "' ";
           
        }
        if(status==2) {
            requete = requete + ",`promo_user`='" +  promotion + "',`form_user`='" + formation + "'";
        }
        
        requete = requete + " WHERE `id_user`='" + ID + "'";
       
        new Connect(requete);
    }
    
    public ArrayList getAll() {
        String requete;
        requete = "SELECT `id_user`, `nom_user`, `prenom_user`, `mdp_user`, `adresse_user`, `CP_user`, `ville_user`, `phone_user`, `mail_user`, `status_user`, lib_stat_user, `site_user`, lib_site, `civil_user`, lib_civil FROM `user` LEFT JOIN status_user ON status_user = id_stat_user LEFT JOIN site ON site_user = id_site LEFT JOIN civilite ON civil_user = id_civil ORDER BY Nom_user";
        Connect demande = new Connect(requete);
        retour = demande.renvoi();//retour.add(demande.renvoi());
        return retour;
    }
}
