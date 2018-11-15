import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

// Compile : javac -cp .:json-simple-1.1.1.jar WeatherParse.java
// Execute : java -cp .:json-simple-1.1.1.jar WeatherParse

public class SpellInit{
	
	private static String JSON_WEATHER_PATH = "weather.json";

    public static void main(String[] args) {

        FileReader jsonFile = null;
        try {
            // lecture du fichier json
            jsonFile = new FileReader(JSON_WEATHER_PATH);
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

}