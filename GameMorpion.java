package morpion;

import java.util.ArrayList;
import java.util.Scanner;

public class GameCorrige {
	
 static String joueur1, joueur2;
 static Scanner sc = new Scanner(System.in);
 static String symbole1;
 static String symbole2;
 
	public static void debutJeu() {
		
// Choix des noms et symboles des joueurs
		
		System.out.println("Bienvenue ! Le jeu du morpion est un jeu pour 2 joueurs.");
		System.out.println("\nEntrez le nom du premier joueur :");
		joueur1 = sc.next();
		System.out.println("Entrez le nom du deuxième joueur :");
		joueur2 = sc.next();
		
		System.out.println("\nChoisissez le symbole pour " + joueur1 + " :");
		symbole1 = sc.next();
		System.out.println("Choisissez le symbole pour " + joueur2 + " :");
		symbole2 = sc.next();
		System.out.println();
	}
	
	public static void jeu() {
		int i;
		int k;
		int l;
		int has_played = 0;
		
// Création d'un arraylist qui servira de grille
		
		ArrayList<String> grille = new ArrayList <String>();
		grille.add("1");
		grille.add("2");
		grille.add("3");
		grille.add("4");
		grille.add("5");
		grille.add("6");
		grille.add("7");
		grille.add("8");
		grille.add("9");

// Affichage de l'arraylist sous forme de grille
		
		for ( i = 0; i < grille.size(); i++) {
			System.out.print("["+grille.get(i)+"] ");
			if (i== 2 || i == 5 || i == 8) {
				System.out.println();
			}
		}
		
// Ici, les joueurs jouent à tour de rôle tant que les 9 cases n'ont pas été remplies
		
		for ( i = 0; i < grille.size(); i++) {
			
			System.out.println("\nÀ "+ joueur1 + " de jouer");
			System.out.println("Quelle case choisissez-vous ?\n");
		
		int choix1 = sc.nextInt();
		
		while(grille.get(choix1-1).equals(symbole1)||grille.get(choix1-1).equals(symbole2)){
			System.out.println("Cette case est deja remplie, choisissez une autre case.");
			choix1 = sc.nextInt();
		}
		
		switch(choix1)
		{
		case 1: grille.set(0, symbole1);
			break;
		case 2: grille.set(1, symbole1);
			break;
		case 3: grille.set(2, symbole1);
			break;
		case 4: grille.set(3, symbole1);
			break;
		case 5: grille.set(4, symbole1);
		break;
		case 6: grille.set(5, symbole1);
			break;
		case 7: grille.set(6, symbole1);
			break;
		case 8: grille.set(7, symbole1);
			break;
		case 9: grille.set(8, symbole1);
			break;
		}
		
		System.out.println(joueur1 + " Game board :");
		
		for (k = 0; k < grille.size(); k++) {
			System.out.print("["+grille.get(k)+"] ");
			if (k== 2 || k == 5 || k == 8) {
				System.out.println();
			}
		}
		
// Etape de vérification pour le joueur 1 : a-t-il gagné ?
		
		if (grille.get(0).equals(grille.get(1)) && grille.get(1).equals(grille.get(2)) && grille.get(2) == symbole1) {
			System.out.println(joueur1 + " a gagné la partie !");
			 
		}
		else if (grille.get(3).equals(grille.get(4)) && grille.get(4).equals(grille.get(5)) && grille.get(5) == symbole1) {
			System.out.println(joueur1 + " a gagné la partie !");
			 
		}
		else if (grille.get(6).equals(grille.get(7)) && grille.get(7).equals(grille.get(8)) && grille.get(8) == symbole1) {
			System.out.println(joueur1 + " a gagné la partie !");
			 
		}
		else if (grille.get(0).equals(grille.get(3)) && grille.get(3).equals(grille.get(6)) && grille.get(6) == symbole1) {
			System.out.println(joueur1 + " a gagné la partie !");
			 
		}
		else if (grille.get(1).equals(grille.get(4)) && grille.get(4).equals(grille.get(7)) && grille.get(7) == symbole1) {
			System.out.println(joueur1 + " a gagné la partie !");
			 
		}
		else if (grille.get(2).equals(grille.get(5)) && grille.get(5).equals(grille.get(8)) && grille.get(8) == symbole1) {
			System.out.println(joueur1 + " a gagné la partie !");
			 
		}
		else if (grille.get(0).equals(grille.get(4)) && grille.get(4).equals(grille.get(8)) && grille.get(8) == symbole1) {
			System.out.println(joueur1 + " a gagné la partie !");
			 
		}
		else if (grille.get(2).equals(grille.get(4)) && grille.get(4).equals(grille.get(6)) && grille.get(6) == symbole1) {
			System.out.println(joueur1 + " a gagné la partie !");
			
		}
		else {
				has_played++;

			if(has_played == grille.size()){
				System.out.println("Match nul !");
				break;
			}
		}
		
// Vérification pour le joueur 2 : a-t-il gagné ?
		
		if (grille.get(0).equals(grille.get(1)) && grille.get(1).equals(grille.get(2)) && grille.get(2) == symbole2) {
			System.out.println(joueur2 + " a gagné la partie !");
			 
		}
		else if (grille.get(3).equals(grille.get(4)) && grille.get(4).equals(grille.get(5)) && grille.get(5) == symbole2) {
			System.out.println(joueur2 + " a gagné la partie !");
			 
		}
		else if (grille.get(6).equals(grille.get(7)) && grille.get(7).equals(grille.get(8)) && grille.get(8) == symbole2) {
			System.out.println(joueur2 + " a gagné la partie !");
			 
		}
		else if (grille.get(0).equals(grille.get(3)) && grille.get(3).equals(grille.get(6)) && grille.get(6) == symbole2) {
			System.out.println(joueur2 + " a gagné la partie !");
			 
		}
		else if (grille.get(1).equals(grille.get(4)) && grille.get(4).equals(grille.get(7)) && grille.get(7) == symbole2) {
			System.out.println(joueur2 + " a gagné la partie !");
			 
		}
		else if (grille.get(2).equals(grille.get(5)) && grille.get(5).equals(grille.get(8)) && grille.get(8) == symbole2) {
			System.out.println(joueur2 + " a gagné la partie !");
			 
		}
		else if (grille.get(0).equals(grille.get(4)) && grille.get(4).equals(grille.get(8)) && grille.get(8) == symbole2) {
			System.out.println(joueur2 + " a gagné la partie !");
			 
		}
		else if (grille.get(2).equals(grille.get(4)) && grille.get(4).equals(grille.get(6)) && grille.get(6) == symbole2) {
			System.out.println(joueur2 + " a gagné la partie !");
			 
		}
		else {
			
				if(has_played == grille.size()){
					System.out.println("Match nul !");
					break;
				}
			}
		
		System.out.println("\nÀ "+ joueur2 + " de jouer");
		System.out.println("Quelle case choisissez-vous ?");
		int choix2 = sc.nextInt();
		
		while(grille.get(choix2-1).equals(symbole1)||grille.get(choix2-1).equals(symbole2)){
			System.out.println("Cette case est deja remplie, choisissez une autre case.");
			choix2 = sc.nextInt();
		}
		
		switch(choix2)
		{
		case 1: grille.set(0, symbole2);
			break;
		case 2: grille.set(1, symbole2);
			break;
		case 3: grille.set(2, symbole2);
			break;
		case 4: grille.set(3, symbole2);
			break;
		case 5: grille.set(4, symbole2);
		break;
		case 6: grille.set(5, symbole2);
			break;
		case 7: grille.set(6, symbole2);
			break;
		case 8: grille.set(7, symbole2);
			break;
		case 9: grille.set(8, symbole2);
			break;
		}
		
		System.out.println(joueur2 + " Game board :");
		
		for (l = 0; l < grille.size(); l++) {
			System.out.print("["+grille.get(l)+"] ");
			if (l== 2 || l == 5 || l == 8) {
				System.out.println();
			}
		}
		
// Vérification pour le joueur 1 : a-t-il gagné ?
		
		if (grille.get(0).equals(grille.get(1)) && grille.get(1).equals(grille.get(2)) && grille.get(2) == symbole1) {
			System.out.println(joueur1 + " a gagné la partie !");
			 
		}
		else if (grille.get(3).equals(grille.get(4)) && grille.get(4).equals(grille.get(5)) && grille.get(5) == symbole1) {
			System.out.println(joueur1 + " a gagné la partie !");
			 
		}
		else if (grille.get(6).equals(grille.get(7)) && grille.get(7).equals(grille.get(8)) && grille.get(8) == symbole1) {
			System.out.println(joueur1 + " a gagné la partie !");
			 
		}
		else if (grille.get(0).equals(grille.get(3)) && grille.get(3).equals(grille.get(6)) && grille.get(6) == symbole1) {
			System.out.println(joueur1 + " a gagné la partie !");
			 
		}
		else if (grille.get(1).equals(grille.get(4)) && grille.get(4).equals(grille.get(7)) && grille.get(7) == symbole1) {
			System.out.println(joueur1 + " a gagné la partie !");
			 
		}
		else if (grille.get(2).equals(grille.get(5)) && grille.get(5).equals(grille.get(8)) && grille.get(8) == symbole1) {
			System.out.println(joueur1 + " a gagné la partie !");
			 
		}
		else if (grille.get(0).equals(grille.get(4)) && grille.get(4).equals(grille.get(8)) && grille.get(8) == symbole1) {
			System.out.println(joueur1 + " a gagné la partie !");
			 
		}
		else if (grille.get(2).equals(grille.get(4)) && grille.get(4).equals(grille.get(6)) && grille.get(6) == symbole1) {
			System.out.println(joueur1 + " a gagné la partie !");
			 
		}
		else {
				
				if(has_played == grille.size()){
					System.out.println("Match nul !");
					break;
				}
			}
		
// Vérification pour le joueur 2 : a-t-il gagné ?
		
		if (grille.get(0).equals(grille.get(1)) && grille.get(1).equals(grille.get(2)) && grille.get(2) == symbole2) {
			System.out.println(joueur2 + " a gagné la partie !");
			
		}
		else if (grille.get(3).equals(grille.get(4)) && grille.get(4).equals(grille.get(5)) && grille.get(5) == symbole2) {
			System.out.println(joueur2 + " a gagné la partie !");
			
		}
		else if (grille.get(6).equals(grille.get(7)) && grille.get(7).equals(grille.get(8)) && grille.get(8) == symbole2) {
			System.out.println(joueur2 + " a gagné la partie !");
			
		}
		else if (grille.get(0).equals(grille.get(3)) && grille.get(3).equals(grille.get(6)) && grille.get(6) == symbole2) {
			System.out.println(joueur2 + " a gagné la partie !");
			
		}
		else if (grille.get(1).equals(grille.get(4)) && grille.get(4).equals(grille.get(7)) && grille.get(7) == symbole2) {
			System.out.println(joueur2 + " a gagné la partie !");
			
		}
		else if (grille.get(2).equals(grille.get(5)) && grille.get(5).equals(grille.get(8)) && grille.get(8) == symbole2) {
			System.out.println(joueur2 + " a gagné la partie !");
			
		}
		else if (grille.get(0).equals(grille.get(4)) && grille.get(4).equals(grille.get(8)) && grille.get(8) == symbole2) {
			System.out.println(joueur2 + " a gagné la partie !");
			
		}
		else if (grille.get(2).equals(grille.get(4)) && grille.get(4).equals(grille.get(6)) && grille.get(6) == symbole2) {
			System.out.println(joueur2 + " a gagné la partie !");
			
		}
		
		else {
					has_played++;
					
				if(has_played == grille.size()){
					System.out.println("Match nul !");
					break;
				}
			}
		
		}
		
	}
	public static void main(String[] args) {
		debutJeu();
		jeu();

	}

}
