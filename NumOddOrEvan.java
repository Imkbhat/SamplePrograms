

public class NumOddOrEvan {

  public static boolean oddOrEven(int num) {
 
    return (num % 2 == 0); //bad idea, statistically it may produce bad result over a period of time.
    
    return (num & 1) == 0; //Good Idea.
  
  }
  
  public static void main(String[] args) {
    
    if(oddOrEven(5)) {
      System.out.println("Evan Number");
    } else {
      System.out.println("Odd Number");
    }
  }
}
