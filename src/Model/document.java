/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;



import java.util.ArrayList;
/**
 *
 * @author vince
 */
public class document {
    int iddoc;
    ArrayList retour = new ArrayList();
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
    String sommaire = "";
    String resume ="";
    String url ="";
    boolean fichier;
    boolean image;
    String dateA ="";
    int periodique =0;
    int collection =0;
    int formation = 0;
    int promotion =0;
    String ISSN ="";
    String numero="";
    String entreprise = "";
    String tuteur ="";
    String duree="";

    public int getIddoc() {
        return iddoc;
    }

    public void setIddoc(int iddoc) {
        this.iddoc = iddoc;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    public int getSite() {
        return site;
    }

    public void setSite(int site) {
        this.site = site;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public int getControl() {
        return control;
    }

    public void setControl(int control) {
        this.control = control;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getSstitre() {
        return sstitre;
    }

    public void setSstitre(String sstitre) {
        this.sstitre = sstitre;
    }

    public String getDateP() {
        return dateP;
    }

    public void setDateP(String dateP) {
        this.dateP = dateP;
    }

    public String getLieuP() {
        return lieuP;
    }

    public void setLieuP(String lieuP) {
        this.lieuP = lieuP;
    }

    public int getEditeur() {
        return editeur;
    }

    public void setEditeur(int editeur) {
        this.editeur = editeur;
    }

    public String getMention() {
        return mention;
    }

    public void setMention(String mention) {
        this.mention = mention;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getLang() {
        return lang;
    }

    public void setLang(int lang) {
        this.lang = lang;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public String getSommaire() {
        return sommaire;
    }

    public void setSommaire(String sommaire) {
        this.sommaire = sommaire;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean getFichier() {
        return fichier;
    }

    public void setFichier(boolean fichier) {
        this.fichier = fichier;
    }

    public boolean getImage() {
        return image;
    }

    public void setImage(boolean image) {
        this.image = image;
    }

    public String getDateA() {
        return dateA;
    }

    public void setDateA(String dateA) {
        this.dateA = dateA;
    }

    public int getPeriodique() {
        return periodique;
    }

    public void setPeriodique(int periodique) {
        this.periodique = periodique;
    }

    public int getCollection() {
        return collection;
    }

    public void setCollection(int collection) {
        this.collection = collection;
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

    public String getISSN() {
        return ISSN;
    }

    public void setISSN(String ISSN) {
        this.ISSN = ISSN;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(String entreprise) {
        this.entreprise = entreprise;
    }

    public String getTuteur() {
        return tuteur;
    }

    public void setTuteur(String tuteur) {
        this.tuteur = tuteur;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }
    
    public document() {
        
    }
    
    public void enregistreDoc(int nbexemplaire, String notice, int site, String classification, int control,int page,int type,String titre,String sstitre,String dateP,String lieuP,int editeur,String mention,String ISBN,int lang,int niveau,String sommaire,String resume,String url,boolean fichier,boolean image,String dateA,int periodique,int collection,int formation,int promotion,String ISSN,String numero,String entreprise,String tuteur,String duree) {
        
        for(int a=0;a<nbexemplaire;a++) { // on répète l'opération autant de fois que d'exemplaires
            
               String table = null;
               String valeur = null;
               String requete = null;
               
               table = "(id_not,";
               valeur = "('" + notice + "',";
               
               table = table + "localisation_doc,";
               valeur = valeur + "'" + site + "',";
               
               table = table + "class_doc,";
               valeur = valeur + "'" + classification + "',";
               
               table = table + "control_doc,";
               valeur = valeur + "'" + control + "',";
               
               table = table + "page_doc,";
               valeur = valeur + "'" + page + "',";
               
               table = table + "type_doc,";
               valeur = valeur + "'" + type + "',";
               
               table = table + "titre_doc,";
               valeur = valeur + "'" + titre + "',";
               
               table = table + "sstitre_doc,";
               valeur = valeur + "'" + sstitre + "',";
               
               table = table + "dateP_doc,";
               valeur = valeur + "'" + dateP + "',";
               
               table = table + "lieu_doc,";
               valeur = valeur + "'" + lieuP + "',";              
               
               table = table + "edit_doc,";
               valeur = valeur + "'" + editeur + "',";
               
               table = table + "mention_doc,";
               valeur = valeur + "'" + mention + "',";
               
               table = table + "ISBN_doc,";
               valeur = valeur + "'" + ISBN + "',";
               
               table = table + "lang_doc,";
               valeur = valeur + "'" + lang + "',";
               
               table = table + "niveau_doc,";
               valeur = valeur + "'" + niveau + "',";
               
               table = table + "somm_doc,";
               valeur = valeur + "'" + sommaire + "',";

               table = table + "resum_doc,";
               valeur = valeur + "'" + resume + "',";

               table = table + "url_doc,";
               valeur = valeur + "'" + url + "',";
               
               table = table + "lien_doc,";
               int file = 0;
               if(fichier) {file = 1;}
               valeur = valeur + "'" + file + "',";
 
               table = table + "image_doc,";
               int img = 0;
               if(image) {img = 1;}
               valeur = valeur + "'" + img + "',";
               
               table = table + "date_doc,";
               valeur = valeur + "'" + dateA + "',";
               
               if(periodique>0) {
                    table = table + "period_doc,";
                    valeur = valeur + "'" + periodique + "',";
               }
              
               if(collection>0) {
                   table = table + "coll_doc,";
                    valeur = valeur + "'" + collection + "',";
               }
               
               if(formation>0 && promotion>0) {
                    table = table + "form_doc,";
                    valeur = valeur + "'" + formation + "',";

                    table = table + "promo_doc,";
                    valeur = valeur + "'" + promotion + "',";
               }
               
               table = table + "ISSN_doc,";
               valeur = valeur + "'" + ISSN + "',";
               
               table = table + "num_doc,";
               valeur = valeur + "'" + numero + "',";
               
               table = table + "ent_doc,";
               valeur = valeur + "'" + entreprise + "',";
               
               table = table + "tuto_doc,";
               valeur = valeur + "'" + tuteur + "',";
               
               if(duree.length()>1) {
               table = table + "duree_doc,";
               valeur = valeur + "'" + duree + "',";
               }
               
               requete = "INSERT INTO document " + table.substring(0, table.length()-1) + ") VALUES " + valeur.substring(0, valeur.length()-1) + ")";
               new Connect(requete);
               
        }
        
    }
    
    public void enregistreCompDoc(int lastID,ArrayList listauteur,ArrayList listmtclf) {
            
        for(int i=0;i<listauteur.size();i++) {
            String requete = null;
            requete = "INSERT INTO doc_auteur (doc_docauteur,auteur_docauteur) VALUES (" + lastID + ",'" + listauteur.get(i).toString() + "')";
            new Connect(requete);
        }
        
        for(int i=0;i<listmtclf.size();i++) {
            String requete = null;
            requete = "INSERT INTO doc_motclef (doc_docmotclef,motclef_docmotclef) VALUES (" + lastID + ",'" + listmtclf.get(i).toString() + "')";
            new Connect(requete);
        }
    } 
    public ArrayList cherche_doc(int type,String notice,String terme,int mtclf,int auteur,int site,String ISBN,String ISSN,String control,boolean fichier) {
    
    String requete = null;
    String condition = "";
    if(type>0) {
        condition = condition + "type_doc =" + type;
    }
    if(!notice.isEmpty()) {
        if(condition.length()>0) {
            condition = condition + " AND id_not='" + notice + "'";
        } else {condition = condition + "id_not='" + notice + "'";}
    }  
    if(!terme.isEmpty()) {
        if(condition.length()>0) {
            condition = condition + " AND (titre_doc LIKE ('%" + terme + "%') OR sstitre_doc LIKE ('%" + terme + "%') OR resum_doc LIKE ('%" + terme + "%'))";
        } else {condition = condition + "(titre_doc LIKE ('%" + terme + "%') OR sstitre_doc LIKE ('%" + terme + "%') OR resum_doc LIKE ('%" + terme + "%'))";}
    }
    if(mtclf>0) {
        if(condition.length()>0) {
            condition = condition + " AND motclef_docmotclef='" + mtclf + "'";
        } else {condition = condition + "motclef_docmotclef='" + mtclf + "'";}
    } 
    if(auteur>0) {
        if(condition.length()>0) {
            condition = condition + " AND auteur_docauteur='" + auteur + "'";
        } else {condition = condition + "auteur_docauteur='" + auteur + "'";}
    } 
   if(site>0) {
        if(condition.length()>0) {
            condition = condition + " AND localisation_doc='" + site + "'";
        } else {condition = condition + "localisation_doc='" + site + "'";}
    }
    if(!ISBN.isEmpty()) {
        if(condition.length()>0) {
            condition = condition + " AND ISBN_doc='" + ISBN + "'";
        } else {condition = condition + "ISBN_doc='" + ISBN + "'";}
    } 
    if(!ISSN.isEmpty()) {
        if(condition.length()>0) {
            condition = condition + " AND ISSN_doc='" + ISSN + "'";
        } else {condition = condition + "ISSN_doc='" + ISSN + "'";}
    } 
    if(!control.isEmpty()) {
        if(condition.length()>0) {
            condition = condition + " AND control_doc='" + control + "'";
        } else {condition = condition + "control_doc='" + control + "'";}
    } 
    
    requete = "SELECT id_doc, titre_doc, type_doc FROM document LEFT JOIN doc_motclef ON id_doc = doc_docmotclef LEFT JOIN doc_auteur ON id_doc = doc_docauteur ";
    if(condition.length()>0) {
        requete = requete + "WHERE " + condition;
    }
    requete = requete + " GROUP BY titre_doc ORDER BY titre_doc";
        
        Connect donnees = new Connect(requete);
        retour = donnees.renvoi();
        return retour; 
    }
    
    public ArrayList cherche_ById(int iddoc) {
        String requete = null;
        requete = "SELECT id_doc, id_not, class_doc, type_doc, titre_doc, sstitre_doc, period_doc, form_doc, promo_doc, ent_doc, tuto_doc, edit_doc, date_doc, lieu_doc, mention_doc, coll_doc, num_doc, ISBN_doc, ISSN_doc, lang_doc, DATE_FORMAT(dateP_doc, \"%d %M %Y\"), niveau_doc, page_doc, duree_doc, somm_doc, resum_doc, lien_doc, image_doc, url_doc, control_doc, localisation_doc FROM document WHERE id_doc = '" + iddoc + "'";
        Connect donnees = new Connect(requete);    
        retour = donnees.renvoi();
        return retour; 
    }
    
    public void supprimeDoc(int ID_doc) {
        //Controle nbre exemplaires
        
        //Controle prêt en cours (hors prêts terminés)
        
        //Controle réservation
        
        //Controle consultation
        
    }
    
    public ArrayList compteExemplaire(int iddoc) {
        String requete = null;
        requete = "SELECT COUNT(*) as exemplaire FROM document WHERE titre_doc IN (SELECT titre_doc FROM `document` WHERE id_doc=" + iddoc + ")";
        Connect donnees = new Connect(requete);
        return donnees.renvoi();
    }
    
    public static int lastIndex() {
        String requete = null;
        requete = "SELECT MAX(id_doc) FROM document LIMIT 1";
        Connect lastID = new Connect(requete);
        return lastID.renvoiInt();
        
    }
    
    
    
}
