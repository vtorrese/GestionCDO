/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import Model.*;
import java.util.ArrayList;
import view.MaFenetre;

/**
 *
 * @author vince
 */
public class MainController {
    
    public MainController() {
        
        status status = new status();
        site site = new site();
        civilite civil = new civilite();
        formation formation = new formation();
        promotion promotion = new promotion();
       
        ArrayList donnees = new ArrayList();
        donnees.add(status.getAll());
        donnees.add(site.getAll());
        donnees.add(civil.getAll());
        donnees.add(formation.getAll());
        donnees.add(promotion.getAll());
        
        new MaFenetre(donnees);
        
    }




   


}