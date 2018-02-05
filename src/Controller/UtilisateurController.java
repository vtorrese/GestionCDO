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




public class UtilisateurController {

    public UtilisateurController() {
        
    }
    
    public static void insereUser(int status, String nom, String prenom, int site, int formation, int promotion, int civil, String adresse, String CP, String ville, String tel, String mail, String mdp) {
        
        System.out.println(UtilisateurController.SHA1(mdp));
            
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
