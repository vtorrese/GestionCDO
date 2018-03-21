/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static view.Utilisateur_new.getKeyFromValue;
import Controller.FondController;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author vince
 */
public class formulaire_fond extends javax.swing.JPanel {

    /**
     * Creates new form formulaire_fond
     */
    public static Map<String, String>  SiteMap = new HashMap<String, String>();
    public static Map<String, String>  TypeMap = new HashMap<String, String>();
    public static Map<String, String>  EditeurMap = new HashMap<String, String>();
    public static Map<String, String>  LangMap = new HashMap<String, String>();
    public static Map<String, String>  NiveauMap = new HashMap<String, String>();
    public static Map<String, String>  PeriodMap = new HashMap<String, String>();
    public static Map<String, String>  CollMap = new HashMap<String, String>();
    public static Map<String, String>  UserMap = new HashMap<String, String>();
    public static Map<String, String>  FormationMap = new HashMap<String, String>();
    public static Map<String, String>  PromotionMap = new HashMap<String, String>();
    public static Map<String, String>  AuteurMap = new HashMap<String, String>();
    public static Map<String, String>  MtclfMap = new HashMap<String, String>();
    
    public formulaire_fond(ArrayList donnees) {
        initComponents();
        ID_doc.setVisible(false);
        Date date = new Date();
        dateA_doc.setDate(date);
        page_doc.setText("0");
        
        //combobox localisation
        ArrayList localisation = new ArrayList();
        localisation = (ArrayList) donnees.get(1);
        localisation_doc.addItem("");
        for(int i=0;i<localisation.size();i++) {
            ArrayList texte = (ArrayList) localisation.get(i);
            localisation_doc.addItem(texte.get(1).toString());
            SiteMap.put(texte.get(0).toString(), texte.get(1).toString());
        }
        
        //combobox type
        ArrayList type = new ArrayList();
        type = (ArrayList) donnees.get(5);
        type_doc.addItem("");
        for(int i=0;i<type.size();i++) {
            ArrayList texte = (ArrayList) type.get(i);
            type_doc.addItem(texte.get(1).toString());
            TypeMap.put(texte.get(0).toString(), texte.get(1).toString());
        }
        
        //combobox editeur
        ArrayList editeur = new ArrayList();
        editeur = (ArrayList) donnees.get(6);
        editeur_doc.addItem("");
        for(int i=0;i<editeur.size();i++) {
            ArrayList texte = (ArrayList) editeur.get(i);
            editeur_doc.addItem(texte.get(1).toString());
            EditeurMap.put(texte.get(0).toString(), texte.get(1).toString());
        }
        
        //combobox langue
        ArrayList langue = new ArrayList();
        langue = (ArrayList) donnees.get(7);
        lang_doc.addItem("");
        for(int i=0;i<langue.size();i++) {
            ArrayList texte = (ArrayList) langue.get(i);
            lang_doc.addItem(texte.get(1).toString());
            LangMap.put(texte.get(0).toString(), texte.get(1).toString());
        }
        
        //combobox niveau
        ArrayList niveau = new ArrayList();
        niveau = (ArrayList) donnees.get(8);
        niveau_doc.addItem("");
        for(int i=0;i<niveau.size();i++) {
            ArrayList texte = (ArrayList) niveau.get(i);
            niveau_doc.addItem(texte.get(1).toString());
            NiveauMap.put(texte.get(0).toString(), texte.get(1).toString());
        }
        
       //combobox auteur
        ArrayList auteur = new ArrayList();
        auteur = (ArrayList) donnees.get(9);
        auteur_doc.addItem("");
        for(int i=0;i<auteur.size();i++) {
            ArrayList texte = (ArrayList) auteur.get(i);
            auteur_doc.addItem(texte.get(1).toString());
            AuteurMap.put(texte.get(0).toString(), texte.get(1).toString());
        }
        
        //combobox mot-clef
        ArrayList mtclf = new ArrayList();
        mtclf = (ArrayList) donnees.get(10);
        mtclf_doc.addItem("");
        for(int i=0;i<mtclf.size();i++) {
            ArrayList texte = (ArrayList) mtclf.get(i);
            mtclf_doc.addItem(texte.get(1).toString());
            MtclfMap.put(texte.get(0).toString(), texte.get(1).toString());
        }
        
       //combobox periodique
        ArrayList periodique = new ArrayList();
        periodique = (ArrayList) donnees.get(11);
        period_doc.addItem("");
        for(int i=0;i<periodique.size();i++) {
            ArrayList texte = (ArrayList) periodique.get(i);
            period_doc.addItem(texte.get(1).toString());
            PeriodMap.put(texte.get(0).toString(), texte.get(1).toString());
        }
        
        //combobox collection
        ArrayList collection = new ArrayList();
        collection = (ArrayList) donnees.get(12);
        coll_doc.addItem("");
        for(int i=0;i<collection.size();i++) {
            ArrayList texte = (ArrayList) collection.get(i);
            coll_doc.addItem(texte.get(1).toString());
            CollMap.put(texte.get(0).toString(), texte.get(1).toString());
        }
        
        //combobox formation
        ArrayList formation = new ArrayList();
        formation = (ArrayList) donnees.get(3);
        form_doc.addItem("");
        for(int i=0;i<formation.size();i++) {
            ArrayList texte = (ArrayList) formation.get(i);
            form_doc.addItem(texte.get(1).toString());
            FormationMap.put(texte.get(0).toString(), texte.get(1).toString());
        }
        
        //combobox ^promotion
        ArrayList promotion = new ArrayList();
        promotion = (ArrayList) donnees.get(4);
        promo_doc.addItem("");
        for(int i=0;i<promotion.size();i++) {
            ArrayList texte = (ArrayList) promotion.get(i);
            promo_doc.addItem(texte.get(1).toString());
            PromotionMap.put(texte.get(0).toString(), texte.get(1).toString());
        }
        
        //combobox etudiant auteur rapport
        ArrayList etudiant = new ArrayList();
        etudiant = (ArrayList) donnees.get(13);
        auteurRapport.addItem("");
        for(int i=0;i<etudiant.size();i++) {
            ArrayList texte = (ArrayList) etudiant.get(i);
            auteurRapport.addItem(texte.get(1).toString() + " " + texte.get(2).toString());
            UserMap.put(texte.get(0).toString(), texte.get(1).toString() + " " + texte.get(2).toString());
        }
        
        DefaultTableModel auteurtab = (DefaultTableModel) list_auteur.getModel();
        auteurtab.setRowCount(0);
        DefaultTableModel mtclftab = (DefaultTableModel) list_mtclf.getModel();
        mtclftab.setRowCount(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ID_doc = new javax.swing.JTextField();
        notice_doc = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        classification_doc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        type_doc = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        titre_doc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        sstitre_doc = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        period_doc = new javax.swing.JComboBox<>();
        Btn_period = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        form_doc = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        promo_doc = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        ent_doc = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tuto_doc = new javax.swing.JTextField();
        Btn_Form = new javax.swing.JButton();
        Btn_Promo = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lieuP_doc = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        editeur_doc = new javax.swing.JComboBox<>();
        Btn_editeur = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        mention_doc = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        num_doc = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        isbn_doc = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        issn_doc = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        lang_doc = new javax.swing.JComboBox<>();
        Btn_lang = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        niveau_doc = new javax.swing.JComboBox<>();
        Btn_niveau = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        page_doc = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        dureeH_doc = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        sommaire_doc = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        resum_doc = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        url_doc = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        localisation_doc = new javax.swing.JComboBox<>();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        control_doc = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        auteur_doc = new javax.swing.JComboBox<>();
        Btn_auteur = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        mtclf_doc = new javax.swing.JComboBox<>();
        Btn_mtclf = new javax.swing.JButton();
        Btn_coll = new javax.swing.JButton();
        coll_doc = new javax.swing.JComboBox<>();
        jLabel37 = new javax.swing.JLabel();
        Btn_Doc_Init = new javax.swing.JButton();
        dateP_doc = new com.toedter.calendar.JDateChooser();
        auteurRapport = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        list_auteur = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        list_mtclf = new javax.swing.JTable();
        jLabel38 = new javax.swing.JLabel();
        dateA_doc = new com.toedter.calendar.JDateChooser();
        jLabel39 = new javax.swing.JLabel();
        dureeM_doc = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        file_doc = new javax.swing.JCheckBox();
        img_doc = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(900, 600));
        setPreferredSize(new java.awt.Dimension(900, 600));

        notice_doc.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        notice_doc.setForeground(new java.awt.Color(153, 0, 153));

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        jLabel1.setText("N° Notice");

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        jLabel2.setText("N° Class.");

        classification_doc.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        classification_doc.setForeground(new java.awt.Color(153, 0, 153));

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        jLabel3.setText("Type");

        type_doc.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        type_doc.setForeground(new java.awt.Color(153, 0, 153));
        type_doc.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        jLabel4.setText("Titre");

        titre_doc.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        titre_doc.setForeground(new java.awt.Color(153, 0, 153));

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        jLabel5.setText("Ss-Titre");

        sstitre_doc.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        sstitre_doc.setForeground(new java.awt.Color(153, 0, 153));

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        jLabel6.setText("Périodique");

        period_doc.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        period_doc.setForeground(new java.awt.Color(153, 0, 153));
        period_doc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                period_docActionPerformed(evt);
            }
        });

        Btn_period.setText("+");
        Btn_period.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_periodActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        jLabel7.setText("Formation");

        form_doc.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        form_doc.setForeground(new java.awt.Color(153, 0, 153));

        jLabel8.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        jLabel8.setText("Promotion");

        promo_doc.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        promo_doc.setForeground(new java.awt.Color(153, 0, 153));
        promo_doc.setToolTipText("");

        jSeparator1.setForeground(new java.awt.Color(153, 0, 153));

        jLabel9.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 0, 153));
        jLabel9.setText("Rapports");

        jSeparator2.setForeground(new java.awt.Color(153, 0, 153));

        jLabel10.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 0, 153));
        jLabel10.setText("Périodiques");

        ent_doc.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        ent_doc.setForeground(new java.awt.Color(153, 0, 153));

        jLabel11.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        jLabel11.setText("Entreprise");

        jLabel12.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        jLabel12.setText("Tuteur");

        tuto_doc.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        tuto_doc.setForeground(new java.awt.Color(153, 0, 153));

        Btn_Form.setText("+");
        Btn_Form.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_FormActionPerformed(evt);
            }
        });

        Btn_Promo.setText("+");
        Btn_Promo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_PromoActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        jLabel13.setText("Date Parution");

        jLabel14.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        jLabel14.setText("Lieu Parution");

        lieuP_doc.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        lieuP_doc.setForeground(new java.awt.Color(153, 0, 153));

        jLabel15.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        jLabel15.setText("Editeur");

        editeur_doc.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        editeur_doc.setForeground(new java.awt.Color(153, 0, 153));
        editeur_doc.setToolTipText("");
        editeur_doc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editeur_docActionPerformed(evt);
            }
        });

        Btn_editeur.setText("+");
        Btn_editeur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_editeurActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        jLabel16.setText("Mention");

        mention_doc.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        mention_doc.setForeground(new java.awt.Color(153, 0, 153));

        jLabel18.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        jLabel18.setText("Numéro");

        num_doc.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        num_doc.setForeground(new java.awt.Color(153, 0, 153));

        jLabel19.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        jLabel19.setText("ISBN");

        isbn_doc.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        isbn_doc.setForeground(new java.awt.Color(153, 0, 153));

        jLabel20.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        jLabel20.setText("ISSN");

        issn_doc.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        issn_doc.setForeground(new java.awt.Color(153, 0, 153));

        jLabel21.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        jLabel21.setText("Langue");

        lang_doc.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        lang_doc.setForeground(new java.awt.Color(153, 0, 153));
        lang_doc.setToolTipText("");
        lang_doc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lang_docActionPerformed(evt);
            }
        });

        Btn_lang.setText("+");
        Btn_lang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_langActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        jLabel23.setText("Niveau");

        niveau_doc.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        niveau_doc.setForeground(new java.awt.Color(153, 0, 153));
        niveau_doc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                niveau_docActionPerformed(evt);
            }
        });

        Btn_niveau.setText("+");
        Btn_niveau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_niveauActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        jLabel24.setText("Nb pages");

        page_doc.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        page_doc.setForeground(new java.awt.Color(153, 0, 153));

        jLabel25.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(153, 0, 153));
        jLabel25.setText("DVD/CD-ROM");

        jSeparator3.setForeground(new java.awt.Color(153, 0, 153));

        dureeH_doc.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        dureeH_doc.setForeground(new java.awt.Color(153, 0, 153));

        jLabel26.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        jLabel26.setText("Durée (00:00)");

        jLabel27.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        jLabel27.setText("Sommaire");

        sommaire_doc.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        sommaire_doc.setForeground(new java.awt.Color(153, 0, 153));

        jLabel28.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        jLabel28.setText("Résumé");

        resum_doc.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        resum_doc.setForeground(new java.awt.Color(153, 0, 153));

        jLabel30.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        jLabel30.setText("Lien URL");

        url_doc.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        url_doc.setForeground(new java.awt.Color(153, 0, 153));

        jLabel31.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        jLabel31.setText("Lien fichier");

        jLabel32.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        jLabel32.setText("Localisation");

        localisation_doc.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        localisation_doc.setForeground(new java.awt.Color(153, 0, 153));
        localisation_doc.setToolTipText("");

        jLabel33.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        jLabel33.setText("Image");

        jLabel34.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        jLabel34.setText("Contrôle");

        control_doc.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        control_doc.setForeground(new java.awt.Color(153, 0, 153));

        jLabel29.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        jLabel29.setText("Auteur(s)");

        auteur_doc.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        auteur_doc.setForeground(new java.awt.Color(153, 0, 153));
        auteur_doc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                auteur_docActionPerformed(evt);
            }
        });

        Btn_auteur.setText("+");
        Btn_auteur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_auteurActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        jLabel36.setText("Auteur");

        jLabel35.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        jLabel35.setText("Mot-clef");

        mtclf_doc.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        mtclf_doc.setForeground(new java.awt.Color(153, 0, 153));
        mtclf_doc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mtclf_docActionPerformed(evt);
            }
        });

        Btn_mtclf.setText("+");
        Btn_mtclf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_mtclfActionPerformed(evt);
            }
        });

        Btn_coll.setText("+");
        Btn_coll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_collActionPerformed(evt);
            }
        });

        coll_doc.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        coll_doc.setForeground(new java.awt.Color(153, 0, 153));
        coll_doc.setAutoscrolls(true);
        coll_doc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coll_docActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        jLabel37.setText("Collection");

        Btn_Doc_Init.setFont(new java.awt.Font("Rockwell", 0, 10)); // NOI18N
        Btn_Doc_Init.setText("Initialiser");
        Btn_Doc_Init.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Doc_InitActionPerformed(evt);
            }
        });

        dateP_doc.setForeground(new java.awt.Color(153, 0, 153));

        auteurRapport.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        auteurRapport.setForeground(new java.awt.Color(153, 0, 153));

        list_auteur.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        list_auteur.setForeground(new java.awt.Color(153, 0, 153));
        list_auteur.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDauteur", "Auteurs"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        list_auteur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list_auteurMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(list_auteur);
        if (list_auteur.getColumnModel().getColumnCount() > 0) {
            list_auteur.getColumnModel().getColumn(0).setMinWidth(0);
            list_auteur.getColumnModel().getColumn(0).setPreferredWidth(0);
            list_auteur.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        list_mtclf.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        list_mtclf.setForeground(new java.awt.Color(153, 0, 153));
        list_mtclf.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDmtclf", "Mots-clefs"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        list_mtclf.getTableHeader().setReorderingAllowed(false);
        list_mtclf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list_mtclfMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(list_mtclf);
        if (list_mtclf.getColumnModel().getColumnCount() > 0) {
            list_mtclf.getColumnModel().getColumn(0).setMinWidth(0);
            list_mtclf.getColumnModel().getColumn(0).setPreferredWidth(0);
            list_mtclf.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        jLabel38.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        jLabel38.setText("Date Acquisition");

        dateA_doc.setForeground(new java.awt.Color(153, 0, 153));

        jLabel39.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel39.setText("H");

        dureeM_doc.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        dureeM_doc.setForeground(new java.awt.Color(153, 0, 153));

        jLabel40.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel40.setText("Mns");

        file_doc.setBackground(new java.awt.Color(255, 255, 255));

        img_doc.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mtclf_doc, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Btn_mtclf)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addComponent(jLabel38)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dateA_doc, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ID_doc, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Btn_Doc_Init))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(coll_doc, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Btn_coll))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(num_doc, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(issn_doc, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(period_doc, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Btn_period))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tuto_doc))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(ent_doc))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(promo_doc, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Btn_Promo))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lang_doc, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Btn_lang))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(niveau_doc, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Btn_niveau))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(editeur_doc, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Btn_editeur))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(sstitre_doc, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                                .addComponent(titre_doc)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(auteur_doc, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Btn_auteur)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(auteurRapport, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(form_doc, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Btn_Form))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(dureeH_doc, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel39)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(dureeM_doc, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel40))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(notice_doc)
                                        .addComponent(classification_doc)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(type_doc, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel32)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(localisation_doc, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(control_doc, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(file_doc)
                            .addGap(60, 60, 60)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(img_doc)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mention_doc, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel19))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dateP_doc, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel14)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lieuP_doc, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                            .addComponent(isbn_doc)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(page_doc, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addComponent(jLabel25)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jSeparator3))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jSeparator1))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jSeparator2))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(url_doc))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(resum_doc))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(sommaire_doc, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {classification_doc, mention_doc, notice_doc, num_doc, type_doc});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Btn_Form, Btn_Promo, Btn_auteur, Btn_editeur, Btn_lang, Btn_niveau, Btn_period});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {sstitre_doc, titre_doc});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ID_doc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Btn_Doc_Init))
                    .addComponent(dateA_doc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(notice_doc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(localisation_doc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel32)
                        .addComponent(jLabel38)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(classification_doc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(control_doc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel34)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(page_doc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(type_doc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(titre_doc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sstitre_doc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateP_doc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(lieuP_doc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(editeur_doc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_editeur, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mention_doc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(isbn_doc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(lang_doc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_lang, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(niveau_doc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_niveau, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel29)
                                .addComponent(auteur_doc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Btn_auteur, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel35)
                                    .addComponent(mtclf_doc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Btn_mtclf, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sommaire_doc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel27))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(resum_doc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel28))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(url_doc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel30))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel31)
                                        .addComponent(file_doc))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(img_doc)
                                        .addComponent(jLabel33)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(period_doc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Btn_period, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel37)
                                    .addComponent(coll_doc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Btn_coll, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(num_doc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18)
                                    .addComponent(issn_doc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel36)
                                    .addComponent(auteurRapport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(form_doc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Btn_Form, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(promo_doc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Btn_Promo, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(ent_doc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(tuto_doc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel25))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dureeM_doc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel40)
                                    .addComponent(jLabel39)
                                    .addComponent(dureeH_doc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26)))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, notice_doc});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel3, type_doc});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Btn_Form, Btn_Promo, Btn_auteur, Btn_editeur, Btn_lang, Btn_niveau, Btn_period, jLabel6, period_doc});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel32, localisation_doc});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Btn_mtclf, mtclf_doc});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Btn_coll, coll_doc});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {dateA_doc, jLabel38});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {dureeH_doc, dureeM_doc, jLabel26, jLabel39, jLabel40});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {file_doc, img_doc, jLabel31, jLabel33});

    }// </editor-fold>//GEN-END:initComponents

    private void period_docActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_period_docActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_period_docActionPerformed

    private void Btn_periodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_periodActionPerformed
        // TODO add your handling code here:
        String table = "periodique";
        FondController.ajoutCategory(table);
    }//GEN-LAST:event_Btn_periodActionPerformed

    private void Btn_FormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_FormActionPerformed
        // TODO add your handling code here:
                String table = "formation";
        FondController.ajoutCategory(table);
    }//GEN-LAST:event_Btn_FormActionPerformed

    private void Btn_PromoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_PromoActionPerformed
        // TODO add your handling code here:
                String table = "promotion";
        FondController.ajoutCategory(table);
    }//GEN-LAST:event_Btn_PromoActionPerformed

    private void editeur_docActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editeur_docActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editeur_docActionPerformed

    private void Btn_editeurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_editeurActionPerformed
        // TODO add your handling code here:
        String table = "editeur";
        FondController.ajoutCategory(table);
        
             
    }//GEN-LAST:event_Btn_editeurActionPerformed

    private void lang_docActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lang_docActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lang_docActionPerformed

    private void Btn_langActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_langActionPerformed
        // TODO add your handling code here:
        String table = "langue";
        FondController.ajoutCategory(table);
        
    }//GEN-LAST:event_Btn_langActionPerformed

    private void niveau_docActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_niveau_docActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_niveau_docActionPerformed

    private void Btn_niveauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_niveauActionPerformed
        // TODO add your handling code here:
        String table = "niveau";
        FondController.ajoutCategory(table);
    }//GEN-LAST:event_Btn_niveauActionPerformed

    private void Btn_auteurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_auteurActionPerformed
        // TODO add your handling code here:
        FondController.ajoutAuteur();
    }//GEN-LAST:event_Btn_auteurActionPerformed

    private void mtclf_docActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mtclf_docActionPerformed
        // TODO add your handling code here:
        if(!formulaire_fond.mtclf_doc.getSelectedItem().equals("")) {
            Object idmtclf = getKeyFromValue(formulaire_fond.MtclfMap,formulaire_fond.mtclf_doc.getSelectedItem());
            
            boolean control = true;
            for(int i=0;i<list_mtclf.getRowCount();i++) {
                if(list_mtclf.getValueAt(i, 0).equals(idmtclf)) {
                    control = false;
                }
             }   

            if (control==true){
                DefaultTableModel mtclfs = (DefaultTableModel) list_mtclf.getModel(); 
                    mtclfs.addRow(new Object[]{idmtclf,formulaire_fond.mtclf_doc.getSelectedItem()});
                    formulaire_fond.mtclf_doc.setSelectedIndex(0);
            } else
            {
                JOptionPane.showMessageDialog(this,"Ce mot-clé existe déjà pour cette référence !");
                formulaire_fond.mtclf_doc.setSelectedIndex(0);
            } 
        }
    }//GEN-LAST:event_mtclf_docActionPerformed

    private void Btn_mtclfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_mtclfActionPerformed
        // TODO add your handling code here:
        String table = "mtclf";
        FondController.ajoutCategory(table);
    }//GEN-LAST:event_Btn_mtclfActionPerformed

    private void Btn_collActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_collActionPerformed
        // TODO add your handling code here:
        String table = "collection";
        FondController.ajoutCategory(table);
    }//GEN-LAST:event_Btn_collActionPerformed

    private void coll_docActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coll_docActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coll_docActionPerformed

    private void Btn_Doc_InitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Doc_InitActionPerformed
        // TODO add your handling code here:
    initialise();
      
        
    }//GEN-LAST:event_Btn_Doc_InitActionPerformed

    public static void initialise() {
        ID_doc.setText("");
        notice_doc.setText("");
        classification_doc.setText("");
        localisation_doc.setSelectedIndex(0);
        control_doc.setText("");
        page_doc.setText("0");
        type_doc.setSelectedIndex(0);
        titre_doc.setText("");
        sstitre_doc.setText("");
        dateP_doc.setDate(null);
        lieuP_doc.setText("");
        editeur_doc.setSelectedIndex(0);
        mention_doc.setText("");
        isbn_doc.setText("");
        lang_doc.setSelectedIndex(0);
        niveau_doc.setSelectedIndex(0);
        auteur_doc.setSelectedIndex(0);  
        mtclf_doc.setSelectedIndex(0);
        sommaire_doc.setText("");
        resum_doc.setText("");
        url_doc.setText("");
        img_doc.setSelected(false);
        
        dateA_doc.setDate(null);
        period_doc.setSelectedIndex(0);
        coll_doc.setSelectedIndex(0);
        num_doc.setText("");
        issn_doc.setText("");      
        file_doc.setSelected(false);
        form_doc.setSelectedIndex(0);
        promo_doc.setSelectedIndex(0);
        ent_doc.setText("");
        tuto_doc.setText("");
        dureeH_doc.setText("");
        dureeM_doc.setText("");
        auteurRapport.setSelectedIndex(0);
        DefaultTableModel auteur = (DefaultTableModel) list_auteur.getModel();
        auteur.setRowCount(0);
        DefaultTableModel mtclf = (DefaultTableModel) list_mtclf.getModel();
        mtclf.setRowCount(0);

    }
    
    private void auteur_docActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_auteur_docActionPerformed
        // TODO add your handling code here:
        if(!formulaire_fond.auteur_doc.getSelectedItem().equals("")) {
            Object idauteur = getKeyFromValue(formulaire_fond.AuteurMap,formulaire_fond.auteur_doc.getSelectedItem());
            
            boolean control = true;
            for(int i=0;i<list_auteur.getRowCount();i++) {
                if(list_auteur.getValueAt(i, 0).equals(idauteur)) {
                    control = false;
                }
             }   

            if (control==true){
                DefaultTableModel auteurs = (DefaultTableModel) list_auteur.getModel(); 
                    auteurs.addRow(new Object[]{idauteur,formulaire_fond.auteur_doc.getSelectedItem()});
                    formulaire_fond.auteur_doc.setSelectedIndex(0);
            } else
            {
                JOptionPane.showMessageDialog(this,"Cet auteur existe déjà pour cette référence !");
                formulaire_fond.auteur_doc.setSelectedIndex(0);
            } 
        }
    }//GEN-LAST:event_auteur_docActionPerformed

    private void list_auteurMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list_auteurMouseClicked
        // TODO add your handling code here:
         JTable source = (JTable)evt.getSource();
         DefaultTableModel auteurs = (DefaultTableModel) list_auteur.getModel();
            int row = source.rowAtPoint( evt.getPoint() );
            auteurs.removeRow(row);
    }//GEN-LAST:event_list_auteurMouseClicked

    private void list_mtclfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list_mtclfMouseClicked
        // TODO add your handling code here:
         JTable source = (JTable)evt.getSource();
         DefaultTableModel mtclfs = (DefaultTableModel) list_mtclf.getModel();
            int row = source.rowAtPoint( evt.getPoint() );
            mtclfs.removeRow(row);
    }//GEN-LAST:event_list_mtclfMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Doc_Init;
    private javax.swing.JButton Btn_Form;
    private javax.swing.JButton Btn_Promo;
    private javax.swing.JButton Btn_auteur;
    private javax.swing.JButton Btn_coll;
    private javax.swing.JButton Btn_editeur;
    private javax.swing.JButton Btn_lang;
    private javax.swing.JButton Btn_mtclf;
    private javax.swing.JButton Btn_niveau;
    private javax.swing.JButton Btn_period;
    public static javax.swing.JTextField ID_doc;
    public static javax.swing.JComboBox<String> auteurRapport;
    public static javax.swing.JComboBox<String> auteur_doc;
    public static javax.swing.JTextField classification_doc;
    public static javax.swing.JComboBox<String> coll_doc;
    public static javax.swing.JTextField control_doc;
    public static com.toedter.calendar.JDateChooser dateA_doc;
    public static com.toedter.calendar.JDateChooser dateP_doc;
    public static javax.swing.JTextField dureeH_doc;
    public static javax.swing.JTextField dureeM_doc;
    public static javax.swing.JComboBox<String> editeur_doc;
    public static javax.swing.JTextField ent_doc;
    public static javax.swing.JCheckBox file_doc;
    public static javax.swing.JComboBox<String> form_doc;
    public static javax.swing.JCheckBox img_doc;
    public static javax.swing.JTextField isbn_doc;
    public static javax.swing.JTextField issn_doc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    public static javax.swing.JComboBox<String> lang_doc;
    public static javax.swing.JTextField lieuP_doc;
    public static javax.swing.JTable list_auteur;
    public static javax.swing.JTable list_mtclf;
    public static javax.swing.JComboBox<String> localisation_doc;
    public static javax.swing.JTextField mention_doc;
    public static javax.swing.JComboBox<String> mtclf_doc;
    public static javax.swing.JComboBox<String> niveau_doc;
    public static javax.swing.JTextField notice_doc;
    public static javax.swing.JTextField num_doc;
    public static javax.swing.JTextField page_doc;
    public static javax.swing.JComboBox<String> period_doc;
    public static javax.swing.JComboBox<String> promo_doc;
    public static javax.swing.JTextField resum_doc;
    public static javax.swing.JTextField sommaire_doc;
    public static javax.swing.JTextField sstitre_doc;
    public static javax.swing.JTextField titre_doc;
    public static javax.swing.JTextField tuto_doc;
    public static javax.swing.JComboBox<String> type_doc;
    public static javax.swing.JTextField url_doc;
    // End of variables declaration//GEN-END:variables
}
