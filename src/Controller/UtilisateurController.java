/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author vtorrese
 */

import Model.*;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.ArrayList;

public class UtilisateurController {

    public UtilisateurController() {
        
    }
    
    public static void insereUser(int status, String nom, String prenom, int site, int formation, int promotion, int civil, String adresse, String CP, String ville, String tel, String mail, String mdp) {
        //String message = null;
        utilisateur newuser = new utilisateur();
        newuser.enregistre_user(status,nom,prenom,site,formation,promotion,civil,adresse,CP,ville,tel,mail,UtilisateurController.SHA1(mdp));            
        
    }
    
    public static void modifierUser(int ID, int status, String nom, String prenom, int site, int formation, int promotion, int civil, String adresse, String CP, String ville, String tel, String mail, String mdp) {
        //String message = null;
        utilisateur newuser = new utilisateur();
        if(mdp.isEmpty()) {
            mdp = "";
        } else {
            mdp = UtilisateurController.SHA1(mdp);
        }
        
        newuser.modifier_user(ID,status,nom,prenom,site,formation,promotion,civil,adresse,CP,ville,tel,mail,mdp);            
        
    }
    
    public static void supprimerUser(String iduser) {
        utilisateur supuser = new utilisateur();
        supuser.supprimer_user(iduser);
        
    }
    
    public static ArrayList chercheUser(int status,String nom,int formation,int promotion) {
        utilisateur chercheuser = new utilisateur();
        /*ArrayList resultat = new ArrayList();
        resultat = chercheuser.cherche_user(status, nom, formation, promotion);
        return resultat;*/
        return chercheuser.cherche_user(status, nom, formation, promotion);
    }
    
    public static ArrayList chercheUserById(int iduser,int idstatus) {
        utilisateur chercheuserbyid = new utilisateur();
        return chercheuserbyid.cherche_userById(iduser,idstatus);
    }
    
   public static ArrayList cherchePrtByUser(int iduser) {
       pret chercheByUser = new pret();
       return chercheByUser.cherche_ByUser(iduser);
    }
   
    public static ArrayList chercheResByUser(int iduser) {
       reservation chercheByUser = new reservation();
       return chercheByUser.cherche_ByUser(iduser);
    }

    private static String SHA1(String value) {
		
		String sha1 = "";
		
		// With the java libraries
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-1");
	        digest.reset();
	        digest.update(value.getBytes("utf8"));
	        sha1 = String.format("%040x", new BigInteger(1, digest.digest()));
		} catch (Exception e){
			e.printStackTrace();
		}

		return sha1;
                }
    

}
