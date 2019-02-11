import java.util.ArrayList;
import java.util.List;

public class ThrowInsideLambdaException {
	public static void main(String[] args) {

		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(0);

		intList.forEach(i -> {
		if (i == 0) {
			throw new IllegalArgumentException("Zero is not allowed");
		}
		   System.out.println("PI Value of ===> "+i+" =====>"+(Math.PI)/i);
		});
	}
}
