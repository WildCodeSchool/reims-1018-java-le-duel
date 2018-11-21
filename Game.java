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
				//GameDisplay.hallOfFameDisplay();
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
	
	public static void party(){
		var spellInit = new SpellInit();
		int choice1 = GameDisplay.partyDisplay();
		int choice2 = GameDisplay.partyDisplay();
		String spellType1 = spellInit.getSpellType(choice1);
		String spellType2= spellInit.getSpellType(choice2);
		String spellWeakness1 = spellInit.getSpellWeakness(choice1);
		String spellWeakness2= spellInit.getSpellWeakness(choice2);
		String result = Game.battle(spellType1, spellType2, spellWeakness1, spellWeakness2);
		System.out.println(result);
	}

	public static String battle(String spellType1, String spellType2, String spellWeakness1, String spellWeakness2){

		if (spellType1.equals(spellType2)){
			return "Egalité!";
		}
		if (spellType1.equals(spellWeakness2)){
			return "Joueur 1 remporte le duel";
		}
		if (spellType2.equals(spellWeakness1)){
			return "Joueur 2 remporte le duel!";
		}
		else{
			return "BOOM! Les 2 joueurs sont à terre!";
		}
	}
}
