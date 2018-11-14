import java.util.Scanner;
import java.util.InputMismatchException;

public class Game{

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		GameDisplay.welcomeDisplay();
		
		GameDisplay.menuDisplay();
		
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
	}
}
