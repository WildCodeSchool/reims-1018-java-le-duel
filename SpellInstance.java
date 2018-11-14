import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

// Compile : javac -cp .:json-simple-1.1.1.jar SpellInstance.java

public class SpellInstance {

    private static String JSON_SPELLS_PATH = "Spells.json";

    public static void main (String[] args)
    {
    FileReader jsonFile = null;
        try {
    // récupération du fichier en lecture
                jsonFile = new FileReader(JSON_SPELLS_PATH);
}           catch (FileNotFoundException e) {
                 e.printStackTrace();
    }
    JSONParser parser = new JSONParser();
    Object jsonParsed = null;
    try {
            jsonParsed = parser.parse(jsonFile);
}       catch (ParseException | IOException e) {
            e.printStackTrace();
}
    }
    JSONArray root = (JSONArray) jsonParsed;
}




    



























