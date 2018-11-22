import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.Console;

public class GameDisplay{

	static Scanner sc = new Scanner(System.in);

	public static void welcomeDisplay() {
		System.out.println("Bienvenue à la taverne des Gobelins Fringants!!! \nEtes-vous prêts à entamer un terrrrrrible duel de sorciers?");
	}

	public static int menuDisplay() {
		System.out.println("1-Jouer \n2-Hall of Fame \n3-Règles du jeu");

		boolean erreur;
		int choice = 0;
		do {
    			erreur = false;

    			try {
        			choice = sc.nextInt();
        			if(choice < 1 || choice > 3){
    					erreur = true;
    					System.out.println("ON T'A DIT METTRE UN NOMBRE ENTRE 1 et 3 PETIT TROLL");
    				}

    			} catch (InputMismatchException e) {
       				erreur = true;
       				System.out.println("Tu n'as pas rentré un nombre Moldu!!");
       				sc.nextLine();
    			}
		} while (erreur);
		sc.nextLine();
		return choice;
	}

	public static int partyDisplay(String playerName){
		System.out.println(playerName + ", choisis un sort");
		System.out.println("1 - feudeymon (feu)");
		System.out.println("2 - aguamenti (eau)");
		System.out.println("3 - ventus (vent)");
		System.out.println("4 - terra (terre)");
		System.out.println("5 - fulgerys (foudre)");

		boolean erreur;
		int choice=0;

		do {
    			erreur = false;

    			try {
   	 				choice=sc.nextInt();
   	 				System.out.print("\033[H\033[2J");
        			if(choice < 1 || choice > 5){
    					erreur = true;
    					System.out.println("ON T'A DIT METTRE UN NOMBRE ENTRE 1 et 5 PETIT TROLL");
    				}

    			} catch (InputMismatchException e) {
       				erreur = true;
       				System.out.println("Tu n'as pas rentré un nombre Moldu!!");
       				sc.nextLine();
    			}
		} while (erreur);
		return choice;
	}

	public static String playerDisplay(){
		System.out.println("Entre ton nom, apprenti sorcier!");
		String pseudo = sc.nextLine();
		return pseudo;
	}

	public static boolean playAgainDisplay(){
		System.out.println("Tapez 'Oubliette' pour revenir au menu principal");
		sc.nextLine();
		String backMenu = sc.nextLine();
		backMenu = backMenu.toUpperCase();
			if(backMenu.equals("OUBLIETTE")){
				System.out.print("\033[H\033[2J");
				return true;
			}
			else{
				return false;
			}
	}


	public static void rulesDisplay(){
		System.out.println("                                   Règles du jeu:\n");
		System.out.println("         Dans 'Duel de sorcier' 2 joueurs s'affrontent en jetant des sorts\n");
		System.out.println("                     Chaque sorcier dispose de 3 points de vie\n");
		System.out.println("                            Il existe 5 types de sorts.");
		System.out.println("                             Le feu, l' eau, le vent, la terre et la foudre");
		System.out.println("                                 Le feu bat le vent");
		System.out.println("                                 L'eau bat le feu");
		System.out.println("                                 Le vent bat la foudre");
		System.out.println("                                 La foudre bat la terre");
		System.out.println("                                 La terre bat l'eau\n");
		System.out.println("              Chaque joueur est amené à choisir un sort à tour de rôle.");
		System.out.println("  Celui dont le sort bat l'autre gagne le duel et fait perdre 1 point de vie à son adversaire");
		System.out.println("            En cas d'égalité aucun des 2 sorciers ne perd de point de vie.");
		System.out.println("  Le sorcier qui réduit les points de vie de son adversaire à zéro remporte la partie.\n");
		System.out.println("Tapez 'ACCIO' pour revenir au menu ");
		boolean error = false;
		do{
			error = false;
			String backMenu = sc.nextLine();
			backMenu = backMenu.toUpperCase();
			if(backMenu.equals("ACCIO")){
				System.out.print("\033[H\033[2J");
				break;
			} else {
				System.out.println("Révises tes sorts sang-de-bourbe");
				error = true;
			}

		} while (error);
	}

	public static void hallOfFameDisplay(){
		System.out.println("                Work in progress. \n");
		System.out.println("Tapez 'LUMOS' pour revenir au menu ");
		boolean error = false;
		do{
			error = false;
			String backMenu = sc.nextLine();
			backMenu = backMenu.toUpperCase();
			if(backMenu.equals("LUMOS")){
				System.out.print("\033[H\033[2J");
				break;
			} else {
				System.out.println("Tu ne gagneras pas la coupe de feu comme ça");
				error = true;
			}

		} while (error);
	}
}
