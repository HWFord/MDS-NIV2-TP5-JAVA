package com.tactfactory.javaniveau2.tps.tp5;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
*
* @author tactfactory
*
*  - Créer un programme qui possède deux scénarios
*    - 1 : Demander à l'utilisateur de saisir une date dans la console avec le format de la constante DATE_FORMAT.
*       Si la date n'est pas valide alors l'utilisateur doit saisir une date valide.
*       La date saisie par l'utilisateur est considéré comme la date UTC de base.
*       Demander à l'utilisateur de chosir un des éléments présent dans "ZoneId.getAvailableZoneIds()", si la saisie
*         n'est pas bonne l'utilisateur doit réeffectuer une saisie
*       Le programme doit afficher à l'utilisateur : "Pour la localisation %s depuis la date UTC %s il serai %s"
*    - 2 : Demander à l'utilisateur de choisir une localisation depuis "ZoneId.getAvailableZoneIds()"
*       Demannder ensuite à l'utilisateur de sélectionner 3 autres localisation. Attention il ne doit pas être possible
*         de sélectionner plusieurs fois la même localisation.
*       Afficher à l'utilisateur les dates actuelles pour les 4 localisations choisies.
*/
public class Tp5 {
  private static final String DATE_FORMAT = "dd/MM/yyyy HH:mm:ss";

  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    scene1(sc);
    scene2(sc);
    
    sc.close();
  }

  private static void scene1(Scanner sc) {
	System.out.println("Follow the instructions to enter a date");
	String str[] = {"year", "month", "day","hours","minutes","seconds" };
    String date = "";
    String time = "";
    
    for(int i=0; i<3; i++) {
        System.out.println("Enter " + str[i] + ": ");
        date = date + sc.next() + "/";
    }
    date = date.substring(0, date.length()-1);
    
    for(int i=3; i<6; i++) {
        System.out.println("Enter " + str[i] + ": ");
        time = time + sc.next() + ":";
    }
    time = time.substring(0, time.length()-1);
    
    String dateAndTime = date +" "+ time;
    

	Date parsedDate = null;
	SimpleDateFormat dateFormat = new SimpleDateFormat("DATE_FORMAT");
	 try {
		 parsedDate = dateFormat.parse(dateAndTime);
	    } catch (ParseException e) {
	        e.printStackTrace();
	    }
	 System.out.println(parsedDate);
	 
  }

  private static void scene2(Scanner sc) {
	  System.out.println("Choose geographical zone ");
  }
}
