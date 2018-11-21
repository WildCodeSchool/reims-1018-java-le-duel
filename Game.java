public class Game{

	public static void main (String[] args) {
		
		GameDisplay.welcomeDisplay();
		
		Game.menu();
		
	}
	
	public static void menu(){
		int choice = GameDisplay.menuDisplay();
		switch(choice){
			case 1:
				Game.party();
				break;
			case 2:
				Game.hallOfFame();
				break;
			case 3:
				Game.rules();
				break;		
		}
	}
	
	public static void rules(){
		GameDisplay.rulesDisplay();
		Game.menu();		
	}
	
	public static void hallOfFame(){
		GameDisplay.hallOfFameDisplay();
		Game.menu();		
	}
	
	public static void party(){
		int choice1 = GameDisplay.partyDisplay();
	
		int choice2 = GameDisplay.partyDisplay();
	}
}
