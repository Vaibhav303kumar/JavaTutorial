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
        
        
        
        
        
        
        
        
        
        int day = 4;
        switch (day) {
        case 1:
             System.out.println("Monday");
             break;
        case 2:
             System.out.println("Tuesday");
             break;
        case 3:
             System.out.println("Wednesday");
             break;
        case 4:
             System.out.println("Thursday");
             break;
        case 5:
             System.out.println("Friday");
             break;
        case 6:
             System.out.println("Saturday");
             break;
        case 7:
             System.out.println("Sunday");
             break;
        default:
             System.out.println("Looking forward to the Weekend");
}
// Outputs "Thursday" (day 4)

        
    }
}
