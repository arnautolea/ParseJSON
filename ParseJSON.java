package mvn.ParsingJSON;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class ParseJSON {

    @SuppressWarnings("unchecked")
	public static void main(String[] args) {

        JSONParser parser = new JSONParser();

        try {

            Object obj = parser.parse(new FileReader("company123.json"));

            JSONObject jsonObject = (JSONObject) obj;
            System.out.println(jsonObject);
            
            JSONArray com = (JSONArray) jsonObject.get("company");
            Iterator<String> iter = com.iterator();


            while (iter.hasNext()) {
 //?????????????????
                }                
            

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}
