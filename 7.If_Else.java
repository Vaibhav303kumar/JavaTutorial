import java.util.*;

public class Main 
{

    public static void main(String[] args) 
    {
      int time = 22;
      if (time < 10) 
      {
           System.out.println("Good morning.");
      } 
      else if (time < 18) 
      {
           System.out.println("Good day.");
      } 
      else 
      {
            System.out.println("Good evening.");
      }
// Outputs "Good evening.
      
      
      
      //Ternary Operator
      int time = 20;
      String result = (time < 18) ? "Good day." : "Good evening.";
      System.out.println(result);
    }
}
