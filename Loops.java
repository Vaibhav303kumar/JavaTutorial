//while loop

import java.util.*;

public class Main 
{

    public static void main(String[] args) 
    {
      int i =1;
      while(i<11)
      {
        System.out.println(i + " * 5 = " + i*5);
        i++;
      }
    }
}



//Do-While loop

import java.util.*;

public class Main 
{

    public static void main(String[] args) 
    {
      int i = 0;
      do {
            System.out.println(i);
            i++;
         }
          while (i < 5);
      }
}



//For loop
import java.util.*;

public class Main 
{

    public static void main(String[] args) 
    {
      for (int i = 0; i <= 10; i = i + 2) {
        System.out.println(i);
    }
    }
    
}

//Nested loop
import java.util.*;

public class Main 
{

    public static void main(String[] args) 
    {
      
      
      // Outer loop
      for (int i = 1; i <= 2; i++)  
      {
             System.out.println("Outer: " + i); // Executes 2 times
  
      // Inner loop
      for (int j = 1; j <= 3; j++) 
         {
             System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
          }
      }
      
    }
}

//for each : which is used exclusively to loop through elements in an array:
import java.util.*;

public class Main 
{

    public static void main(String[] args) 
    {
      
      
     String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
     for (String i : cars) 
        {
          System.out.println(i);
       }
     
    }
    
}

