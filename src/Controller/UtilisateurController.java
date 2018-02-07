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
        
        utilisateur newuser = new utilisateur();
        newuser.enregistre_user(status,nom,prenom,site,formation,promotion,civil,adresse,CP,ville,tel,mail,UtilisateurController.SHA1(mdp));

    }
    
    public static ArrayList chercheUser(int status,String nom,int formation,int promotion) {
        utilisateur chercheuser = new utilisateur();
        ArrayList resultat = new ArrayList();
        resultat = chercheuser.cherche_user(status, nom, formation, promotion);
        return resultat;
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
