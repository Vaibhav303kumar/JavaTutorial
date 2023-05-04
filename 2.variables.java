// String - stores text, such as "Hello". String values are surrounded by double quotes
// int - stores integers (whole numbers), without decimals, such as 123 or -123
//float - stores floating point numbers, with decimals, such as 19.99 or -19.99
// char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
// boolean - stores values with two states: true or false


import java.util.*;

public class Main 
{

    public static void main(String[] args) 
    {
      String name = "John";
      System.out.println(name);                    //John
      
      
      int myNum = 15;
      System.out.println(myNum);                    // 15
      
    //  Final Variables
//If you don't want others (or yourself) to overwrite existing values, use the final keyword 
//(this will declare the variable as "final" or "constant", which means unchangeable and read-only):
     final int myNum = 15;
     
     
     
     
     int myNum = 5;
     float myFloatNum = 5.99f;
     char myLetter = 'D';
     boolean myBool = true;
     String myText = "Hello";
  
    }
}
