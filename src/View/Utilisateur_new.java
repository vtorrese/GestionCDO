/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Controller.UtilisateurController;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author vince
 */
public class Utilisateur_new extends javax.swing.JPanel {

        int status =0;
        int formation =0;
        int promotion =0;
        int site =0;
        int civil =0;
        String nom = "";
        String prenom = "";
        String adresse = "";
        String ville = "";
        String CP = "";
        String tel = "";
        String mail = "";
        String mdp = "";
       
        //récupérations des valeurs des combo box
        Map<String, String> StatusMap = new HashMap<String, String>();
        Map<String, String> SiteMap = new HashMap<String, String>();
        Map<String, String> CivilMap = new HashMap<String, String>();
        Map<String, String> FormMap = new HashMap<String, String>();
        Map<String, String> PromoMap = new HashMap<String, String>();
        
    public Utilisateur_new(ArrayList donnees) {
        initComponents();
        
        //remplissage des combobox
        
        //combobox status
        ArrayList status = new ArrayList();
        
        status = (ArrayList) donnees.get(0);
        Status_user.addItem("");
        for(int i=0;i<status.size();i++) {
            ArrayList texte = (ArrayList) status.get(i);
            Status_user.addItem(texte.get(1).toString());
            StatusMap.put(texte.get(0).toString(), texte.get(1).toString());
            
        }
        
        //combobox site
       ArrayList site = new ArrayList();
       
        site = (ArrayList) donnees.get(1);
        Site_user.addItem("");
        for(int i=0;i<site.size();i++) {
            ArrayList texte = (ArrayList) site.get(i);
            Site_user.addItem(texte.get(1).toString());
            SiteMap.put(texte.get(0).toString(), texte.get(1).toString());
        }
       
        //combobox civilite
        ArrayList civil = new ArrayList();
        civil = (ArrayList) donnees.get(2);
        Civil_user.addItem("");
        for(int i=0;i<civil.size();i++) {
            ArrayList texte = (ArrayList) civil.get(i);
            Civil_user.addItem(texte.get(1).toString());
            CivilMap.put(texte.get(0).toString(), texte.get(1).toString());
        }
        
         //combobox formation
        ArrayList formation = new ArrayList();
        formation = (ArrayList) donnees.get(3);
        Form_user.addItem("");
        for(int i=0;i<formation.size();i++) {
            ArrayList texte = (ArrayList) formation.get(i);
            Form_user.addItem(texte.get(1).toString());
            FormMap.put(texte.get(0).toString(), texte.get(1).toString());
        }
        
        //combobox promotion
        ArrayList promotion = new ArrayList();
        promotion = (ArrayList) donnees.get(4);
        Promo_user.addItem("");
        for(int i=0;i<promotion.size();i++) {
             ArrayList texte = (ArrayList) promotion.get(i);
            Promo_user.addItem(texte.get(1).toString());
            PromoMap.put(texte.get(0).toString(), texte.get(1).toString());
        }
        
       mdp_user.setColumns(15);
       mdp_user.setText("");
        
    }

  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Nom_user = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Prenom_user = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Adresse_user = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Commune_user = new javax.swing.JTextField();
        CP_user = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Tel_user = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        Mail_user = new javax.swing.JTextField();
        Civil_user = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        mdp_user = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        Status_user = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        Site_user = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        Form_user = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        Promo_user = new javax.swing.JComboBox<>();
        Btn_enregistrer = new javax.swing.JButton();
        Btn_init = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(900, 550));
        setPreferredSize(new java.awt.Dimension(900, 550));

        Nom_user.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        Nom_user.setForeground(new java.awt.Color(153, 0, 153));
        Nom_user.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Nom_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nom_userActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel1.setText("Nom");

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel2.setText("Adresse");

        Prenom_user.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        Prenom_user.setForeground(new java.awt.Color(153, 0, 153));
        Prenom_user.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel3.setText("Prénom");

        Adresse_user.setColumns(20);
        Adresse_user.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        Adresse_user.setForeground(new java.awt.Color(153, 0, 153));
        Adresse_user.setRows(5);
        Adresse_user.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setViewportView(Adresse_user);

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel4.setText("CP");

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel5.setText("Commune");

        Commune_user.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        Commune_user.setForeground(new java.awt.Color(153, 0, 153));
        Commune_user.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        CP_user.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        CP_user.setForeground(new java.awt.Color(153, 0, 153));
        CP_user.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel6.setText("Tel");

        Tel_user.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        Tel_user.setForeground(new java.awt.Color(153, 0, 153));
        Tel_user.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel7.setText("Formation");

        Mail_user.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        Mail_user.setForeground(new java.awt.Color(153, 0, 153));
        Mail_user.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Civil_user.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        Civil_user.setForeground(new java.awt.Color(153, 0, 153));
        Civil_user.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel8.setText("Civil");

        jLabel9.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel9.setText("Mdp");

        mdp_user.setText("jPasswordField1");

        jLabel10.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel10.setText("Statut");

        Status_user.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        Status_user.setForeground(new java.awt.Color(153, 0, 153));

        jLabel11.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel11.setText("Site");

        Site_user.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        Site_user.setForeground(new java.awt.Color(153, 0, 153));
        Site_user.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel12.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel12.setText("Mail/Login");

        Form_user.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        Form_user.setForeground(new java.awt.Color(153, 0, 153));

        jLabel13.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel13.setText("Promotion");

        Promo_user.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        Promo_user.setForeground(new java.awt.Color(153, 0, 153));

        Btn_enregistrer.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        Btn_enregistrer.setForeground(new java.awt.Color(204, 0, 51));
        Btn_enregistrer.setText("Enregistrer");
        Btn_enregistrer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Btn_enregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_enregistrerActionPerformed(evt);
            }
        });

        Btn_init.setFont(new java.awt.Font("Rockwell", 0, 10)); // NOI18N
        Btn_init.setText("Initialiser");
        Btn_init.setBorder(null);
        Btn_init.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_initActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(10, 10, 10)
                                .addComponent(Mail_user, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mdp_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel6))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Commune_user, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CP_user, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Tel_user, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Civil_user, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Nom_user)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Prenom_user, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Status_user, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Site_user, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Btn_init, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Btn_enregistrer))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Form_user, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(34, 34, 34)
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Promo_user, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 397, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Status_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(Site_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nom_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Prenom_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(Civil_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Commune_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(CP_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(Tel_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Mail_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(mdp_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Form_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(Promo_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_enregistrer)
                    .addComponent(Btn_init, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(185, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Nom_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nom_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nom_userActionPerformed

    private void Btn_initActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_initActionPerformed
        // TODO add your handling code here:
        initialiser();
    }//GEN-LAST:event_Btn_initActionPerformed

    private void Btn_enregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_enregistrerActionPerformed
        
        // Controles
       
      if(Status_user.getSelectedIndex()==0) {
            JOptionPane.showMessageDialog(this,"Statut invalide !");}
        
       else if(Status_user.getSelectedItem().equals("Etudiant") && Form_user.getSelectedIndex()==0){ // si étudiant controle des combobox promotion et formation
          
            JOptionPane.showMessageDialog(this,"Formation invalide !");}
            
       else if(Status_user.getSelectedItem().equals("Etudiant") && Promo_user.getSelectedIndex()==0) {
            JOptionPane.showMessageDialog(this,"Promotion invalide !");}

        
       else if(Site_user.getSelectedIndex()==0) {
            JOptionPane.showMessageDialog(this,"Site invalide !");}
       
       else if(Civil_user.getSelectedIndex()==0) {
            JOptionPane.showMessageDialog(this,"Civilité invalide !");}
       
       else if(Nom_user.getText().equals("")) {
          JOptionPane.showMessageDialog(this,"Nom invalide !");}
       
       else if(Prenom_user.getText().equals("")) {
          JOptionPane.showMessageDialog(this,"Prénom invalide !");}
        
       else if(Adresse_user.getText().equals("")) {
           JOptionPane.showMessageDialog(this,"Adresse invalide !");}
        
       else if(Commune_user.getText().equals("")) {
          JOptionPane.showMessageDialog(this,"Commune invalide !");}
        
       else if(CP_user.getText().length()!=5 || estUnEntier(CP_user.getText())==false) {
          JOptionPane.showMessageDialog(this,"Code postal invalide !");}
        
       else if(Tel_user.getText().length()!=10 || estUnEntier(Tel_user.getText())==false) {
          JOptionPane.showMessageDialog(this,"Numéro de téléphone invalide !");}
        
       else if(Mail_user.getText().equals("")) { // Voir pour améliorer controle conformité mail
          JOptionPane.showMessageDialog(this,"Mail invalide !");}
        
       else if(mdp_user.getText().length()<5) {
          JOptionPane.showMessageDialog(this,"Mot de passe invalide (au moins 5 caractères!)");}
       else 
       {

           status = Integer.parseInt(getKeyFromValue(StatusMap,Status_user.getSelectedItem()).toString());
           if(Form_user.getSelectedIndex()!=0){formation = Integer.parseInt(getKeyFromValue(FormMap,Form_user.getSelectedItem()).toString());}
           if(Promo_user.getSelectedIndex()!=0){promotion = Integer.parseInt(getKeyFromValue(PromoMap,Promo_user.getSelectedItem()).toString());}
           site = Integer.parseInt(getKeyFromValue(SiteMap,Site_user.getSelectedItem()).toString());
           civil = Integer.parseInt(getKeyFromValue(CivilMap,Civil_user.getSelectedItem()).toString());
           mdp = mdp_user.getText();
           mail = Mail_user.getText();
           tel = Tel_user.getText();
           CP = CP_user.getText();
           ville = Commune_user.getText();
           adresse = Adresse_user.getText();
           nom = Nom_user.getText();
           prenom = Prenom_user.getText();
           
            UtilisateurController.insereUser(status,nom,prenom,site,formation,promotion,civil,adresse,CP,ville,tel,mail,mdp);
            initialiser();
            JOptionPane.showMessageDialog(this,"Nouvel utilisateur ajouté !");
       }     
          
    }//GEN-LAST:event_Btn_enregistrerActionPerformed

 	public boolean estUnEntier(String chaine) {
		try {
			Integer.parseInt(chaine);
		} catch (NumberFormatException e){
			return false;
		}
		return true;
        }
        
        public static Object getKeyFromValue(Map hm, Object value) {
            for (Object o : hm.keySet()) {
              if (hm.get(o).equals(value)) {
                return o;
              }
            }
            return null;
          }
        
        public void initialiser() {
        Status_user.setSelectedIndex(0);
        Site_user.setSelectedIndex(0);
        Form_user.setSelectedIndex(0);
        Promo_user.setSelectedIndex(0);
        Civil_user.setSelectedIndex(0);
        Nom_user.setText("");
        Prenom_user.setText("");
        Adresse_user.setText("");
        CP_user.setText("");
        Commune_user.setText("");
        Mail_user.setText("");
        Tel_user.setText("");
        mdp_user.setText("");
        }

        
  
        
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Adresse_user;
    private javax.swing.JButton Btn_enregistrer;
    private javax.swing.JButton Btn_init;
    private javax.swing.JTextField CP_user;
    private javax.swing.JComboBox<String> Civil_user;
    private javax.swing.JTextField Commune_user;
    private javax.swing.JComboBox<String> Form_user;
    private javax.swing.JTextField Mail_user;
    private javax.swing.JTextField Nom_user;
    private javax.swing.JTextField Prenom_user;
    private javax.swing.JComboBox<String> Promo_user;
    private javax.swing.JComboBox<String> Site_user;
    private javax.swing.JComboBox<String> Status_user;
    private javax.swing.JTextField Tel_user;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField mdp_user;
    // End of variables declaration//GEN-END:variables
}

