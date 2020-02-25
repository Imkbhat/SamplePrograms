import java.lang.Thread;

//order in which the threads are called is changed, the deadlock problem is resolved.
public class DeadlockSolutionDemo {
   public static Object addLock = new Object();
   public static Object subLock = new Object();
 
   public static void main(String args[]) {
 
      MyAdditionThread add = new MyAdditionThread();
      MySubtractionThread sub = new MySubtractionThread();
      add.start();
      sub.start();
   }
 
 
private static class MyAdditionThread extends Thread {
      public void run() {
         synchronized (addLock) {
        int a = 10, b = 3;
        int c = a + b;
            System.out.println("Addition Thread: " + c);
            System.out.println("Holding First Lock...");
            try { Thread.sleep(10); }
            catch (InterruptedException e) {}
            System.out.println("Addition Thread: Waiting for AddLock...");
            synchronized (subLock) {
               System.out.println("Threads: Holding Add and Sub Locks...");
            }
         }
      }
   }
    
   private static class MySubtractionThread extends Thread {
      public void run() {
         synchronized (addLock) {
        int a = 10, b = 3;
        int c = a - b;
            System.out.println("Subtraction Thread: " + c);
            System.out.println("Holding Second Lock...");
            try { Thread.sleep(10); }
            catch (InterruptedException e) {}
            System.out.println("Subtraction  Thread: Waiting for SubLock...");
            synchronized (subLock) {
               System.out.println("Threads: Holding Add and Sub Locks...");
            }
         }
      }
   }
}

Output:
============
=====
Addition Thread: 13
Holding First Lock...
Addition Thread: Waiting for AddLock...
Threads: Holding Add and Sub Locks...
Subtraction Thread: 7
Holding Second Lock...
Subtraction  Thread: Waiting for SubLock...
Threads: Holding Add and Sub Locks...




Ref: https://www.javacodegeeks.com/2015/06/java-programming-tips-best-practices-beginners.html
