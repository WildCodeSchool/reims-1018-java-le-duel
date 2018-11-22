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
		//boucle
		while(!player1.isKo() && !player2.isKo()){
			int choice1 = GameDisplay.partyDisplay(player1Name);
			int choice2 = GameDisplay.partyDisplay(player2Name);
			String spellType1 = spellInit.getSpellType(choice1);
			String spellType2 = spellInit.getSpellType(choice2);
			String spellWeakness1 = spellInit.getSpellWeakness(choice1);
			String spellWeakness2 = spellInit.getSpellWeakness(choice2);
			Game.battle(spellType1, spellType2, spellWeakness1, spellWeakness2, player1, player2);
		}

	}

	public static void battle(String spellType1, String spellType2, String spellWeakness1, String spellWeakness2, Player player1, Player player2){
		if (spellType1.equals(spellType2)){
			System.out.println("Aucun des joueurs ne perd de point de vie");
		}
		else if (spellType1.equals(spellWeakness2)){
			player2.takeHit();
		}
		else if (spellType2.equals(spellWeakness1)){
			player1.takeHit();
		}
		else{
			player1.takeHit();
			player2.takeHit();
		}
	}
}
