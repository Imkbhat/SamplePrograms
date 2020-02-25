import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
 
public class JsonParseTest {
 
    private static final String filePath = "//home//user//Documents//jsonDemoFile.json";
     
    public static void main(String[] args) {
 
        try {
            // read the json file
            FileReader reader = new FileReader(filePath);
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject)jsonParser.parse(reader);
             
            // get a number from the JSON object
            Long id =  (Long) jsonObject.get("id");
            System.out.println("The id is: " + id);         
 
            // get a String from the JSON object
            String  type = (String) jsonObject.get("type");
            System.out.println("The type is: " + type);
 
            // get a String from the JSON object
            String  name = (String) jsonObject.get("name");
            System.out.println("The name is: " + name);
 
            // get a number from the JSON object
            Double ppu =  (Double) jsonObject.get("ppu");
            System.out.println("The PPU is: " + ppu);
             
            // get an array from the JSON object
            System.out.println("Batters:");
            JSONArray batterArray= (JSONArray) jsonObject.get("batters");
            Iterator i = batterArray.iterator();
            // take each value from the json array separately
            while (i.hasNext()) {
                JSONObject innerObj = (JSONObject) i.next();
                System.out.println("ID "+ innerObj.get("id") + 
                        " type " + innerObj.get("type"));
            }
 
            // get an array from the JSON object
            System.out.println("Topping:");
            JSONArray toppingArray= (JSONArray) jsonObject.get("topping");
            Iterator j = toppingArray.iterator();
            // take each value from the json array separately
            while (j.hasNext()) {
                JSONObject innerObj = (JSONObject) j.next();
                System.out.println("ID "+ innerObj.get("id") + 
                        " type " + innerObj.get("type"));
            }
             
 
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ParseException ex) {
            ex.printStackTrace();
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        }
 
    }
 
}

jsonDemoFile.json:
====================
{
    "id": 0001,
    "type": "donut",
    "name": "Cake",
    "ppu": 0.55,
    "batters":
        [
            { "id": 1001, "type": "Regular" },
            { "id": 1002, "type": "Chocolate" },
            { "id": 1003, "type": "Blueberry" },
            { "id": 1004, "type": "Devil's Food" }
        ],
    "topping":
        [
            { "id": 5001, "type": "None" },
            { "id": 5002, "type": "Glazed" },
            { "id": 5005, "type": "Sugar" },
            { "id": 5007, "type": "Powdered Sugar" },
            { "id": 5006, "type": "Chocolate with Sprinkles" },
            { "id": 5003, "type": "Chocolate" },
            { "id": 5004, "type": "Maple" }
        ]
}

Output:
------------
The id is: 1
The type is: donut
The name is: Cake
The PPU is: 0.55
Batters:
ID 1001 type Regular
ID 1002 type Chocolate
ID 1003 type Blueberry
ID 1004 type Devil's Food
Topping:
ID 5001 type None
ID 5002 type Glazed
ID 5005 type Sugar
ID 5007 type Powdered Sugar
ID 5006 type Chocolate with Sprinkles
ID 5003 type Chocolate
ID 5004 type Maple
