import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

public class JsonEncodeDemo
{
public static void main(String[] args) {
         
        JSONObject obj = new JSONObject();
        obj.put("Novel Name", "Godaan");
        obj.put("Author", "Munshi Premchand");
  
        JSONArray novelDetails = new JSONArray();
        novelDetails.add("Language: Hindi");
        novelDetails.add("Year of Publication: 1936");
        novelDetails.add("Publisher: Lokmanya Press");
         
        obj.put("Novel Details", novelDetails);
         
        System.out.print(obj);
    }

         
 Note: JSON parser has to be installed
  
 Output:
 ===========
 {"Novel Name":"Godaan","Novel Details":["Language: Hindi","Year of Publication: 1936","Publisher: Lokmanya Press"],"Author":"Munshi Premchand"}
