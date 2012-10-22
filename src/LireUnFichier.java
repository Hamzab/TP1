/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Hamza
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LireUnFichier {
  public static String chargerUnFichier(String unFichier)throws FileNotFoundException, IOException{
          File nouveauFichier=new File(unFichier);
          int longueurUnFichier=(int)nouveauFichier.length();
          byte [] longueurFichier= new byte[longueurUnFichier];
          FileInputStream entrerStream= new FileInputStream(unFichier);
          entrerStream.read(longueurFichier);
          String retournerUnFichier=new String (longueurFichier);
          return retournerUnFichier;
          
          }
    
    
}
