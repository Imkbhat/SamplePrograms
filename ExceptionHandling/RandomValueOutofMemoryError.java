import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RandomValueOutofMemoryError {
	
	public static void main(String[] args) {
		Random rand = new Random();
		Map<Integer, String> map = new HashMap<>();
		
		while(true) {
		int randomVal = rand.nextInt();
		map.put(randomVal, String.valueOf(randomVal));
		}
	}
}
