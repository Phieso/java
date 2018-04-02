package week9;

import java.util.*;

public class Challenge_1 {
	
	static Scanner sc = new Scanner(System.in);
	static Random rand = new Random();
	static ArrayList <Integer> stock = new ArrayList <Integer> (Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1));
	static int nombreAleatoire;
	
	public static void allumettes() {
		System.out.println("\nIl y a " + stock.size() + " allumettes disponibles.");
		System.out.println(stock.toString());
		System.out.println("\n--------------------------------------------------------------");
		
	}
	
	public static void jeu() {
		
		 while (stock.size() > 0) {
			
		//Partie joueur
			 
			System.out.println("\nTOUR DU JOUEUR");
			System.out.println("Combien d'allumettes voulez-vous retirer (entre 1 et 3) ?");
			int allumetteRetiree = sc.nextInt();
				if(allumetteRetiree<1 || allumetteRetiree>3) {
					System.out.println("Veuillez choisir un nombre entre 1 et 3.");
				}
					else {
			for (int k = 0; k < allumetteRetiree; k++) {
				stock.remove(k);
			}
			int allumettesRestantes =  stock.size();
			System.out.println("\nIl reste "+ allumettesRestantes + " allumettes dans le jeu.");
			System.out.println(stock.toString());
			System.out.println("\n--------------------------------------------------------------");
			if(stock.size()==0) {
				System.out.println("Vous avez perdu !");
			}
			
		//Partie ordinateur
			
			System.out.println("\nTOUR DE L'ORDINATEUR");
			System.out.println("Combien d'allumettes voulez-vous retirer (entre 1 et 3) ?");
			nombreAleatoire = rand.nextInt(3 - 1 + 1) + 1;
//			Pour rendre l'ordi intelligent
//			while (stock.size() > 3) {
//			nombreAleatoire = rand.nextInt(3 - 1 + 1) + 1;
//			}
			switch(stock.size())
			{
			case 3: nombreAleatoire = 2;
				break;
			case 2: nombreAleatoire = 1;
				break;
			case 1: nombreAleatoire = 1;
				break;
			}
			
			System.out.println(nombreAleatoire);
			
			for (int j = 0; j < nombreAleatoire; j++) {
			stock.remove(j);
			}
			int resteAllumettes = stock.size();
			System.out.println("\nIl reste "+ resteAllumettes + " allumettes dans le jeu.");
			System.out.println(stock.toString());
			System.out.println("\n--------------------------------------------------------------");
			
		if(stock.size()==0) {
			System.out.println("L'ordinateur a perdu !");
		}
			}
		}
		}

	public static void main(String[] args) {
		System.out.println("Bienvenue sur le jeu des allumettes !");
		System.out.println("\nChacun des joueurs à son tour retire une à 3 allumettes maximum. \nCelui qui retire la ou les dernière(s) allumette(s) a perdu.");
		allumettes();
		jeu();
	}

}
