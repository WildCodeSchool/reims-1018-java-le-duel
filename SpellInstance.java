import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;   
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

// Compile : javac -cp .:json-simple-.11.1.jar SpellInstance.java

public class SpellInstance {

    
    private static String JSON_SPELLS_PATH = "Spells.json";
    
    public static void SpellInstance (){
    
        FileReader jsonFile = null;
        try {
    // récupération du fichier en lecture
            jsonFile = new FileReader(JSON_SPELLS_PATH);
         }          
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        JSONParser parser = new JSONParser();
        Object jsonParsed = null;
        try {
            jsonParsed = parser.parse(jsonFile);
        }   
        catch (ParseException | IOException e) {
            e.printStackTrace();
        }
        JSONArray root = (JSONArray) jsonParsed;
        
        for (int loop = 0; loop < root.size();loop ++){
            JSONObject SpellsObj = (JSONObject) root.get(loop);
            int id = (int) SpellsObj.get("id");
            String name = (String) SpellsObj.get("name");
            int level = (int) SpellsObj.get("level");
            String type = (String) SpellsObj.get("type");
            
            Spell spell = new Spell(id, name, level, type);

        }
    }
}    





    



























