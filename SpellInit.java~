import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

// Compile : javac -cp .:json-simple-1.1.1.jar Game.java
// Execute : java -cp .:json-simple-1.1.1.jar Game

public class SpellInit{
	
	private static String JSON_SPELL_PATH = "Spell.json";
	
	public static Spell spellCast(int choice){
		
		FileReader jsonFile = null;
        try {
            // lecture du fichier json
            jsonFile = new FileReader(JSON_SPELL_PATH);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        //TODO parser le fichier
			JSONParser parser = new JSONParser();
			Object jsonParsed = null;
			try{
				jsonParsed = parser.parse(jsonFile);
			} catch (ParseException | IOException e) {
				e.printStackTrace();
			}
			
			JSONArray root = (JSONArray) jsonParsed;
			
			JSONObject spellObject = (JSONObject) root.get(choice - 1);
			
			int id = Math.toIntExact((long) spellObject.get("id")); // Math.toIntExact to cast a long 
    		String name = (String) spellObject.get("name");
    		int level = Math.toIntExact((long) spellObject.get("level")); // Math.toIntExact to cast a long 
    		String type = (String) spellObject.get("type");
    		
    		Spell spell = new Spell(id, name, level, type);
    		
    		return spell;
	}      
}