/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author vince
 */
public class Connect {

    private ArrayList al = new ArrayList();
    String mdp = "";
    
    public Connect(String data) {
        
        Connection connexion = null;
        
        if (data.startsWith("S",0)) {
            try {
            
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("Le pilote JDBC MySQL a été chargé");
                connexion = DriverManager.getConnection("jdbc:mysql://localhost/cdo", "root", mdp);



                    //System.out.println(data.charAt(0));

                     try (Statement state = connexion.createStatement();

                     ResultSet result = state.executeQuery(data)) {
                        ResultSetMetaData resultMeta = result.getMetaData();
                        while(result.next()){
                            for(int i = 1; i <= resultMeta.getColumnCount(); i++)
                            al.add(result.getObject(i).toString());
                            }
                        }
                connexion.close();
                  
                this.al = al;
                }
            catch (Exception e) {
            e.printStackTrace();
            }   
        }
        else
        {
            try {
            
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("Le pilote JDBC MySQL a été chargé");
                connexion = DriverManager.getConnection("jdbc:mysql://localhost/cdo", "root", mdp);

                     Statement state = connexion.createStatement();
                     state.executeUpdate(data);
                     connexion.close();
                
                }
            catch (Exception e) {
            e.printStackTrace();
            }  
        }
      
    }

  ArrayList renvoi() {
            return al;
        }

 
}
