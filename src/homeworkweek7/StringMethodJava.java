package homeworkweek7;

public class StringMethodJava {

    public static void main(String[] args) {
        String name = "This is my String";
        String name1 = "Hello world";   // Non primitive datatype


        // String length(): length of the string
        System.out.println("The length of String is " + name.length());

        //String isEmpty(): checks if this string is empty
        System.out.println("Is this String empty " + name.isEmpty());

        //String charAt(): returns a char value at the given index number
        System.out.println(name.charAt(3));     //index start from zero// output should be s

       // String equals(): compares the contents of two given strings
        System.out.println(name.equals(name1));// false// Compares the contents of two given string

        // String contains():return true if chars are found in the strings

        System.out.println(name.contains("x"));// flase /
        System.out.println(name.contains("i"));// flase

       // String concat(): combines specified string at the end of this string
        System.out.println(name.concat(name1));

        // String startsWith(): check if this string starts with given prefix
        System.out.println(name.startsWith("The"));

       // String endsWith(): checks if this string ends with given suffix
        System.out.println(name.endsWith("String"));

        //String indexOf():returns index of given character value or substring
        System.out.println(name.indexOf('m'));

       // String replace(): returns a string replacing all the old char to new char
        System.out.println(name1.replace(name1,name));

       // String substring(): returns a part of the string
        System.out.println(name.substring(11));

        //String to CharArray(): converts this string into character array
        System.out.println(name1.toCharArray());

        //String toLowerCase(): return the string in lowercase letter
        System.out.println(name.toLowerCase());

        // String toUpperCase(): returns the string in uppercase letetr
        System.out.println(name1.toUpperCase());

      // String trim()- eliminates leading and trailing spaces

        System.out.println(name1.trim());


    }
}