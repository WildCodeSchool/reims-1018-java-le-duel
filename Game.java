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
		var spellInit = new SpellInit();
		String player1Name = GameDisplay.playerDisplay();
		String player2Name = GameDisplay.playerDisplay();
		Player player1 = new Player(player1Name);
		Player player2 = new Player(player2Name);
		int choice1 = GameDisplay.partyDisplay();
		int choice2 = GameDisplay.partyDisplay();
		String spellType1 = spellInit.getSpellType(choice1);
		String spellType2 = spellInit.getSpellType(choice2);
		String spellWeakness1 = spellInit.getSpellWeakness(choice1);
		String spellWeakness2 = spellInit.getSpellWeakness(choice2);
		String result = Game.battle(spellType1, spellType2, spellWeakness1, spellWeakness2, player1, player2);
		System.out.println(result);
	}

	public static String battle(String spellType1, String spellType2, String spellWeakness1, String spellWeakness2, Player player1, Player player2){
		if (spellType1.equals(spellType2)){
			return "Egalité!";
		}
		if (spellType1.equals(spellWeakness2)){
			return player1.getName() + " remporte le duel";
		}
		if (spellType2.equals(spellWeakness1)){
			return player2.getName() + " remporte le duel!";
		}
		else{
			return "BOOM! " + player1.getName() + " et " + player2.getName() + " sont à terre!";
		}
	}
}
