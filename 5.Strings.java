import java.util.*;

public class Main 
{

    public static void main(String[] args) 
    {
      String name = "Hello John , How are You??";
      String name2 = "What about you?";
      System.out.println(name);
      System.out.println(name.length());
      System.out.println(name.toUpperCase()); 
      System.out.println(name.toLowerCase());
      System.out.println(name.indexOf("How"));
      System.out.println(name.concat(name2));
      
      
      String a= "10";                                      //string sumation
      String b ="20";
       System.out.println(a+b);
      
      
      String txt = "We are the so-called \"Vikings\" from the north.";      //Double quote
      System.out.println(txt);
      String txt2 = "It\'s alright.";                          //Single quote
      System.out.println(txt2);
      String txt3 = "The character \\ is called backslash.";      //backslash
      System.out.println(txt3);
    }
}


//Output
/*
Hello John , How are You??
26
HELLO JOHN , HOW ARE YOU??
hello john , how are you??
13
Hello John , How are You??What about you?
1020
We are the so-called "Vikings" from the north.
It's alright.
The character \ is called backslash.












\n	New Line	
\r	Carriage Return	
\t	Tab	
\b	Backspace	
\f	Form Feed
*/
