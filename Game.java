import java.util.Scanner;

public class Game{
	
	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);

		GameDisplay.welcomeDisplay();

		GameDisplay.menuDisplay();

		int choice= sc.nextInt();
	}
}
