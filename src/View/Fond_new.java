/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


import java.awt.BorderLayout;

import java.util.ArrayList;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import View.formulaire_fond;
=======
import javax.swing.JOptionPane;




>>>>>>> 2514b494ad620b15d56e0b232f112d6fc019d06e
=======

>>>>>>> parent of 248379f... erreur
=======

>>>>>>> parent of 248379f... erreur



/**
 *
 * @author vince
 */
public class Fond_new extends javax.swing.JPanel {
  
    /**
     * Creates new form Fond_new
     */
    String notice = "";
    int site = 0;
    String classification = "";
    int control =0;
    int page = 0;
    int type = 0;
    String titre = "";
    String sstitre ="";
    String dateP = "";
    String lieuP = "";
    int editeur = 0;
    String mention = "";
    String ISBN = "";
    int lang = 0;
    int niveau = 0;
    
    
    
    public Fond_new(ArrayList donnees) {
        initComponents();
        formulaire_fond inclus = new formulaire_fond(donnees);
         formul.setLayout(new BorderLayout());
         formul.add(inclus, BorderLayout.CENTER);
       



    }
    
    
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        formul = new javax.swing.JPanel();
        Btn_NewDoc = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(900, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Créer une référence", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rockwell", 1, 11))); // NOI18N

        javax.swing.GroupLayout formulLayout = new javax.swing.GroupLayout(formul);
        formul.setLayout(formulLayout);
        formulLayout.setHorizontalGroup(
            formulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 486, Short.MAX_VALUE)
        );
        formulLayout.setVerticalGroup(
            formulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 418, Short.MAX_VALUE)
        );

        Btn_NewDoc.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        Btn_NewDoc.setText("Enregistrer");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(formul, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(Btn_NewDoc)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(formul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Btn_NewDoc)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(382, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

<<<<<<< HEAD
<<<<<<< HEAD
    private void Btn_NewDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_NewDocActionPerformed
<<<<<<< HEAD
        // TODO add your handling code here:
      
=======
        
    // Contrôles
      
        if(formulaire_fond.notice_doc.getText().equals("")) {
            JOptionPane.showMessageDialog(this,"Numéro de notice invalide !");
        }
        else if(formulaire_fond.localisation_doc.getSelectedIndex()<=0) {
            JOptionPane.showMessageDialog(this,"Localisation de la référence invalide !");
        }
        else if(formulaire_fond.classification_doc.getText().equals("")) {
            JOptionPane.showMessageDialog(this,"Numéro de classification invalide !");
        }
        else if(formulaire_fond.control_doc.getText().equals("")) {
            JOptionPane.showMessageDialog(this,"Contrôle invalide !");
        }
        else if(formulaire_fond.type_doc.getSelectedIndex()<=0) {
            JOptionPane.showMessageDialog(this,"Type invalide !");
        }
        else if(formulaire_fond.titre_doc.getText().equals("")) {
            JOptionPane.showMessageDialog(this,"Titre invalide !");
        }
        else if(formulaire_fond.dateP_doc.getDate() == null) {
            JOptionPane.showMessageDialog(this,"Date de publication invalide !");
        }
        else if(formulaire_fond.editeur_doc.getSelectedIndex()<=0) {
            JOptionPane.showMessageDialog(this,"Editeur invalide !");
        }
        else if(formulaire_fond.lang_doc.getSelectedIndex()<=0) {
            JOptionPane.showMessageDialog(this,"Langue invalide !");
        }
        else if(formulaire_fond.niveau_doc.getSelectedIndex()<=0) {
            JOptionPane.showMessageDialog(this,"Niveau invalide !");
        }
        else if(formulaire_fond.list_auteur.getModel().getSize() == 0) {
            JOptionPane.showMessageDialog(this,"Aucun auteur ?!");
        }
        
>>>>>>> 2514b494ad620b15d56e0b232f112d6fc019d06e
    }//GEN-LAST:event_Btn_NewDocActionPerformed

=======
>>>>>>> parent of 248379f... erreur
=======
>>>>>>> parent of 248379f... erreur
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_NewDoc;
    private javax.swing.JPanel formul;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables


    
}

