package Day9_Strings;

import java.sql.SQLOutput;

public class Topic2_StringMethods {
    public static void main(String[] args) {
        String str = "Something";
          /*

Method	              Description                                                     	Return Type
charAt()	          Returns the character at the specified index (position)	        char
concat()	          Appends a string to the end of another string	                    String
contains()	          Checks whether a string contains a sequence of characters	        boolean
endsWith()	          Checks whether a string ends with the specified character(s)	    boolean
equals()	          Compares two strings. Returns true if the strings are equal,
                      and false if not	                                                boolean
equalsIgnoreCase()	  Compares two strings, ignoring case considerations	            boolean
indexOf()	          Returns the position of the first found occurrence
                      of specified characters in a string	                            int
isEmpty()	          Checks whether a string is empty or not	                        boolean
lastIndexOf()	      Returns the position of the last found occurrence of
                      specified characters in a string	                                int
length()	          Returns the length of a specified string	                        int
replace()	          Searches a string for a specified value, and returns
                      a new string where the specified values are replaced	            String
replaceFirst()	      Replaces the first occurrence of a substring that matches the
                      given regular expression with the given replacement	            String

startsWith()	      Checks whether a string starts with specified characters	        boolean
substring()	          Extracts the characters from a string,
                      beginning at a specified start position,
                      and through the specified number of character	                    String
toLowerCase()	      Converts a string to lower case letters	                        String
toUpperCase()	      Converts a string to upper case letters	                        String
trim()	              Removes whitespace from both ends of a string	                    String

     */

     //charAt()	          Returns the character at the specified index (position)	        char
   String str1 = "Tanya"; //Index or Positions: T ==>0, a ==> 1, n ==> 2, y ==>3, a ==> 4

        char ch = str1.charAt(0);
        System.out.println("The char at the position 0 (or index 0): " +ch);
        System.out.println("The char at the position 2 (or index 2): " +str1.charAt(2));

      //  concat()	          Appends a string to the end of another string

       String FirstName = "Tanya";
       String LastName = " Bozyel";
       String FullName = FirstName.concat(LastName);
        System.out.println("The full name is: "+FullName);



        //contains() -  Checks whether a string contains a sequence of characters	        boolean

        String str3 = "This is a test";
        boolean con = str3.contains("test"); //capital letter are different from lowercase - have different values
        System.out.println("Contains the test: "+con);

        String str4 = "Test";
        boolean con1 = str4.contains("test"); //capital letter are different from lowercase - have different values
        System.out.println("Contains the test: "+con1);
        boolean con2 = str4.contains("R");
        System.out.println("Contains the test: "+con2);

       // endsWith()	          Checks whether a string ends with the specified character(s)	    boolean
    String str5 = "this is the String";
    boolean ends = str5.endsWith("ing");
        System.out.println("Does String end with ing: "+ends);
   //equals()	          Compares two strings. Returns true if the strings are equal,
        //                      and false if not                                                     boolean

        String str6 = "Hello";
        String str7 ="Hello";
        boolean eq = str6.equals(str7);
        System.out.println("Are they equal: "+eq);
        String str8 = new String("Hello");
                boolean eq1 = str6.equals(str8);
        System.out.println("Are they Equal in the new keyword as well: "+eq1);
// equalsIgnoreCase()	  Compares two strings, ignoring case considerations	            boolean

        String str9 = "HellO";
        String str10 = "hello";
        boolean eq3 = str9.equals(str10);
        System.out.println("Are they equal: "+eq3);
        boolean eq4 = str9.equalsIgnoreCase(str10);
        System.out.println("Are they Equal when we ignore case: "+eq4);

    //indexOf()	          Returns the position of the first found occurrence
        //                      of specified characters in a string	                            int

        String str11 = "water";
        int pos = str11.indexOf('e');
        System.out.println("The index of e on the string: "+pos);


        //lastIndexOf()	      Returns the position of the last found occurrence of
        //                      specified characters in a string	                                int

String str12 = "hellllo";
int pos1 = str12.lastIndexOf('l');
        System.out.println("The last index of l is: "+pos1);

        //isEmpty()	          Checks whether a string is empty or not	                        boolean

        String str13 = " ";
        System.out.println("Is string Empty: "+(str13.isEmpty())); //NO because the space is a value too

      //  length()	          Returns the length of a specified string	                        int

    }
}
