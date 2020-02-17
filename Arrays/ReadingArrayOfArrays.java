public class ReadingArrayOfArrays {
	public static void main(String[] args) {
	  int marksArray[] = new int[] { 60, 80, 80, 90, 75 };
		int prizeArray[] = new int[]{20,30,50,70,90};
		//Array of arrays
		int arrayOfArray[][] =new int[][]{marksArray,prizeArray};
	  System.out.println("----READING  ARRAY OF ARRAY------");
		System.out.println(Arrays.deepToString(arrayOfArray));
		System.out.println("---using Java8 lambda expressions---");
		Arrays.stream(arrayOfArray).flatMapToInt(e->Arrays.stream(e)).forEach(System.out::println);
		System.out.println("---Distinct values----");
		Arrays.stream(arrayOfArray).flatMapToInt(e->Arrays.stream(e)).distinct().forEach(System.out::println);
	}
}

----READING  ARRAY OF ARRAY------
[[60, 80, 80, 90, 75], [20, 30, 50, 70, 90]]
---using Java8 lambda expressions---
60
80
80
90
75
20
30
50
70
90
---Distinct values----
60
80
90
75
20
30
50
70
