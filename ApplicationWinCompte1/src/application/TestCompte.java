/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import modele.Compte;
import modele.CompteBancaire;
import modele.CompteEpargne;
import utilitaire.Conteneur;

/**
 *
 * @author Valentin
 */
public class TestCompte {
   public static void main(String[] args){ 
   try{    
    Map<String,Compte> comptes = new TreeMap<>();
    Compte compteBanc1 = new CompteBancaire(1000f,"1",200f,3f);
    Compte compteBanc2 = new CompteBancaire(1000f,"1",200f,3f);
    Compte compteEpar1 = new CompteEpargne(2000f,"1",3000f,30f);
    Compte compteEpar2 = new CompteEpargne(2000f,"1",3000f,30f);
    
    comptes.put(compteBanc1.getNumero(), compteBanc1);
    
    Conteneur listeComptes = new Conteneur();
    listeComptes.charger("F-TREEMAP");
    
    
    
   }catch(IOException e){}
   catch(ClassNotFoundException e){}
}   
}
