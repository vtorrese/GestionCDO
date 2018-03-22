/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.ArrayList;

/**
 *
 * @author vtorrese
 */
public class Parametre extends javax.swing.JInternalFrame {
    
        public Parametre(String titre, String sstitre, ArrayList donnees) {
        
            initComponents();
        
        this.setTitle(titre + " (" + sstitre + ")");
        this.setClosable(true);
        this.setResizable(true);
        this.setMaximizable(true);
        this.setIconifiable(true);
        this.toFront();
        this.setSize(600, 400);
       
        if(sstitre=="Catégories") {
               Parametre_cat nouveau = new Parametre_cat(donnees);
            this.setContentPane(nouveau);
            //pann.setVisible(true);  
        }
        else if(sstitre=="Règles") {
                Parametre_reg nouveau = new Parametre_reg(donnees);
            this.setContentPane(nouveau);
        }
        
    }
    
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        setPreferredSize(new java.awt.Dimension(900, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 928, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 509, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>   
}
