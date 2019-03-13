import java.util.concurrent.CopyOnWriteArrayList; 
import java.util.*; 

/* public class copyOnWriteArrayList {
	public static void main(String[] args) {
		
		CopyOnWriteArrayList<Integer> c  = new CopyOnWriteArrayList<>();
		c.add(1);
		c.add(2);
		c.add(3);
		c.add(4);
		c.add(5);
		
		c.forEach(element -> {
			System.out.println("Element =>" +element);
		});
	}
} */

class copyOnWriteArrayList {
	public static void main(String[] args) 
    { 
  
        // create object of CopyOnWriteArrayList 
        CopyOnWriteArrayList<Integer> ArrLis 
            = new CopyOnWriteArrayList<Integer>(); 
  
        // Add elements 
        ArrLis.add(32); 
        ArrLis.add(67); 
        ArrLis.add(67); 
        ArrLis.add(100); 
  
        // print CopyOnWriteArrayList 
        System.out.println("CopyOnWriteArrayList: " + ArrLis); 
	}
}