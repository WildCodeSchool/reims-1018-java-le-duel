import java.util.Scanner;
import java.util.InputMismatchException;

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
		return choice;
	}
	
	public static int partyDisplay(){
		System.out.println("Choisis un sort");
		System.out.println("1 - feudeymon (feu)");
		System.out.println("2 - aguamenti (eau)");
		System.out.println("3 - ventus (vent)");
		
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
		return choice;
	}
	
	public static void rulesDisplay(){
		System.out.println("                                   Règles du jeu:\n");	
		System.out.println("         Dans 'Duel de sorcier' 2 joueurs s'affrontent en jetant des sorts\n");
		System.out.println("                     Chaque sorcier dispose de 3 points de vie\n");
		System.out.println("                            Il existe 3 types de sorts.");
		System.out.println("                             Le feu, l' eau et le vent");
		System.out.println("                                 Le feu bat le vent");
		System.out.println("                                 L'eau bat le feu");
		System.out.println("                                 Le vent bat l'eau\n");
		System.out.println("              Chaque joueur est amené a choisir un sort à tour de rôle.");
		System.out.println("  Celui dont le sort bas l'autre gagne le duel et fait perdre 1 point de vie à son adversaire");
		System.out.println("            En cas d'égalité aucun des 2 sorciers ne perdent de point de vie.");
		System.out.println("  Le sorcier qui réduit les points de vie de son adversaire à zéro remporte la partie.\n");	
		System.out.println("Tapez 'EXPELLIARMUS' pour revenir au menu ");
		sc.nextLine();
		boolean error = false;
		do{
			error = false;
			String backMenu = sc.nextLine();
			backMenu = backMenu.toUpperCase();
			if(backMenu.equals("EXPELLIARMUS")){
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
		sc.nextLine();
		boolean error = false;
		do{
			error = false;
			String backMenu = sc.nextLine();
			backMenu = backMenu.toUpperCase();
			if(backMenu.equals("LUMOS")){
				break;
			} else {
				System.out.println("Tu ne gagneras pas la coupe de feu comme ça");
				error = true;
			}
		
		} while (error);
	}
}