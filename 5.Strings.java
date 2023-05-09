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


//String compare
    String str1 = "ABCDE";
    String str2 = "ABCDe";
    System.out.println(str1.equals(str2));
    System.out.println(str1.equalsIgnoreCase(str2));
    System.out.println(str1.compareTo(str2));
    System.out.println(str1.compareToIgnoreCase(str2));
    
    String patt = "[A-Z]{1,}";
    System.out.println(str1.matches(patt));

/*
Output:

false
true
-32
0
true
*/


//String Search

 String str1 = "I love java and Python";
 String str2 = "Java";
 String str3 ="I love Java and love Python and love SQL";
 System.out.println(str1.contains(str2));
 System.out.println(str1.startsWith("I"));
 System.out.println(str1.endsWith("Python"));
 System.out.println(str1.indexOf("love"));
 System.out.println(str3.indexOf("love",3));
 System.out.println(str3.lastIndexOf("love"));

/*
Output:

false
true
true
2
16
32
*/



String str1 = "ABCDEFGH";
System.out.println(str1.charAt(0));
System.out.println(str1.charAt(5));

System.out.println(str1.substring(2));
System.out.println(str1.substring(2,6));

String s3="A_B_C_D_E";
String s2 ="_";
String[] arr = s3.split(s2);
for (String s : arr) {
    System.out.print(s+" ");
}

/*
A
F
CDEFGH
CDEF
A B C D E 
*/




        String str=" Java is a programming language";  
        //replaces all occurrences of "i" to "z"
        String replaceString=str.replaceAll("i","z");
        System.out.println(replaceString); //printing new string
//OUTPUT : Java zs a programmzng language

        String s1="javatpoint is a very good website";  
        String replaceString=s1.replace('a','e');//replaces all occurrences of 'a' to 'e'
//OUTPUT : jevetpoint is e very good website



    int num =100;
    System.out.println(Integer.toString(num));
    System.out.println(Integer.toBinaryString(num));
    System.out.println(Integer.toHexString(num));
    System.out.println(Integer.toOctalString(num));  
    
    System.out.println("------------");
    String s1="100";
    String s2="1100100";
    String s3="64";
    String s4="144";
    System.out.println(Integer.parseInt(s1));
    System.out.println(Integer.parseInt(s1,2));
    System.out.println(Integer.parseInt(s1,16));
    System.out.println(Integer.parseInt(s1,8));
