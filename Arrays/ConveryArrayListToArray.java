import java.util.ArrayList;
import java.util.List;

public class ConveryArrayListToArray {
	public static void main(String[] args) {
		List<String> flowersList = new ArrayList<>();
		flowersList.add("jasmine");
		flowersList.add("sunflower");
		flowersList.add("marigold");
		flowersList.add("lilly");
		flowersList.add("rose");
		
		String flowersArray[]= new String[flowersList.size()];
		for (int i = 0; i < flowersList.size(); i++) {
			flowersArray[i] = flowersList.get(i);
		}
		
		//display flowers array
		System.out.println("----Flowers Array elements----");
		for (int i = 0; i < flowersArray.length; i++) {
			System.out.println(flowersArray[i]);
		}
	}
}


Output:

----Flowers Array elements----
jasmine
sunflower
marigold
lilly
rose
