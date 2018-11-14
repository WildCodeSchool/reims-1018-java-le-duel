import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;



public class SortsParse 
{

	private static String JSON_SORTS_PATH = "sorts.json";

	public static void main(String[] args) 
	{

		FileReader jsonFile = null;
		try 
		{
            //
			jsonFile = new FileReader(JSON_SORTS_PATH);
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}




		JSONParser parser = new JSONParser();
		Object jsonParsed = null;
		try {
			jsonParsed = parser.parse(jsonFile);
		} catch (ParseException | IOException e) {
			e.printStackTrace();
		}



		JSONArray root = (JSONArray) jsonParsed;


		

	}
}

