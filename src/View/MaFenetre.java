/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import java.awt.BorderLayout;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EventListener;


import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.UIManager;

/**
 *
 * @author vince
 */
public class MaFenetre implements EventListener {
    
    
    public MaFenetre(ArrayList donnees) {
            JFrame fenetreP = new JFrame();
            fenetreP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fenetreP.setSize(900, 600);
            fenetreP.setLocationRelativeTo(null);
            fenetreP.setTitle("Gestion du Centre de Documentation");
            fenetreP.setDefaultLookAndFeelDecorated(true);
            fenetreP.setExtendedState(fenetreP.MAXIMIZED_BOTH);
            
            final JDesktopPane desktop = new JDesktopPane();
            fenetreP.add(desktop, BorderLayout.CENTER);
            
            
              final JMenuBar menu = new JMenuBar();
  
                JMenu fichier = new JMenu("Fichier");
                    JMenuItem repaint = new JMenuItem("Tout fermer");
                    fichier.add(repaint);
                    JMenuItem quitter = new JMenuItem("Quitter");
                    fichier.add(quitter);
                
                JMenu user = new JMenu("Utilisateurs");
                    JMenuItem profil = new JMenuItem("Profil");
                    user.add(profil);
                    JMenuItem nouveau = new JMenuItem("Nouveau");
                    user.add(nouveau);
                     

                JMenu fond = new JMenu("Fond");
                    JMenuItem consulter = new JMenuItem("Consulter");
                    fond.add(consulter);
                    JMenuItem ajouter = new JMenuItem("Ajouter");
                    fond.add(ajouter);
                    
                JMenu pret = new JMenu("Prêts");
                    JMenuItem retour = new JMenuItem("Retours");
                    pret.add(retour);
                    JMenuItem sortie = new JMenuItem("Emprunts");
                    pret.add(sortie);
                    JMenuItem etat = new JMenuItem("Etats");
                    pret.add(etat);
                
                JMenu param = new JMenu("Paramètres");
                    JMenuItem categorie = new JMenuItem("Catégories");
                    param.add(categorie);
                    JMenuItem regle = new JMenuItem("Règles");
                    param.add(regle);
                
                fenetreP.add(menu, BorderLayout.NORTH);
                menu.add(fichier);
                menu.add(user);
                menu.add(fond);
                menu.add(pret);
                menu.add(param);
                
                //Pour quitter l'application
                quitter.addActionListener((ActionEvent e) -> {
                System.exit(0);
                });
                
                //Pour fermer toutes les fenetres inetrnes
                repaint.addActionListener((ActionEvent e) -> {
                desktop.removeAll();
                desktop.repaint();
                });
                
                profil.addActionListener((ActionEvent e) -> {
                   JInternalFrame[] tab = desktop.getAllFrames();
                   if(Arrays.toString(tab).indexOf("Voir profil")==-1){
                        Utilisateur panneau = new Utilisateur("Utilisateurs","Voir profil",donnees);
                        desktop.add(panneau);
                        panneau.setVisible(true);
                        }
                });
                
                nouveau.addActionListener((ActionEvent e) -> {
                   JInternalFrame[] tab = desktop.getAllFrames();
                   if(Arrays.toString(tab).indexOf("Nouvel utilisateur")==-1){
                        Utilisateur panneau = new Utilisateur("Utilisateurs","Nouvel utilisateur",donnees);
                        desktop.add(panneau);
                        panneau.setVisible(true);
                        }
                });
                

                ajouter.addActionListener((ActionEvent e) -> {
                    JInternalFrame[] tab = desktop.getAllFrames();
                    if(Arrays.toString(tab).indexOf("Ajouter")==-1){
                        View.Fond panneau = new View.Fond("Fond","Ajouter",donnees);
                        desktop.add(panneau);
                        panneau.setVisible(true);
                        }
                });
                
                consulter.addActionListener((ActionEvent e) -> {
                    JInternalFrame[] tab = desktop.getAllFrames();
                    if(Arrays.toString(tab).indexOf("Consulter")==-1){
                        View.Fond panneau = new View.Fond("Fond","Consulter",donnees);
                        desktop.add(panneau);
                        panneau.setVisible(true);
                        }
                });
                
                /*retour.addActionListener((ActionEvent e) -> {
                   Pret panneau = new Pret("Prêts","Gestion des retours");
                   desktop.add(panneau);
                   panneau.setVisible(true);
                });
                
                sortie.addActionListener((ActionEvent e) -> {
                   Pret panneau = new Pret("Prêts","Gestion des emprunts");
                   desktop.add(panneau);
                   panneau.setVisible(true);
                });
                
                
                etat.addActionListener((ActionEvent e) -> {
                   Pret panneau = new Pret("Prêts","Etat des prêts");
                   desktop.add(panneau);
                   panneau.setVisible(true);
                });
                
                categorie.addActionListener((ActionEvent e) -> {
                   Parametres panneau = new Parametres("Paramètres","Configuration des catégories");
                   desktop.add(panneau);
                   panneau.setVisible(true);
                });
                
                regle.addActionListener((ActionEvent e) -> {
                   Parametres panneau = new Parametres("Paramètres","Configuration des règles");
                   desktop.add(panneau);
                   panneau.setVisible(true);
                });*/
            
                JScrollPane scroll=new JScrollPane(desktop);
                scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
                
                fenetreP.getContentPane().add(scroll);
          
                fenetreP.setVisible(true);
    }
    
  
    
    public static void main(String[] args){
    
    try{
     UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
    }
    catch(Exception e){}
    
   
  

    
    }

}
