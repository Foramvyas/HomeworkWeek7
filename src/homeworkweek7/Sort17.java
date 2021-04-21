package homeworkweek7;

/*
(17) Write a Java program to sort a numeric array and a string array.
 */

import java.util.Arrays;

public class Sort17 {
          // Instance method

    void sortArray(){

        int[] arraydata1= { 27, 45,23,78,12,34,23,41,56,89,67,90};
        String[] arraydata2= { "Foram", "Jyotika","Vrajesh", "Bhumi", "Vaidehi","Ajay","Shivani" };

        System.out.println("Original value:  "+ Arrays.toString(arraydata1));
        Arrays.sort(arraydata1);
        System.out.println("Sorted value:  "+ Arrays.toString(arraydata1));

        System.out.println("Original value:  "+ Arrays.toString(arraydata2));
        Arrays.sort(arraydata2);
        System.out.println("Sorted value:  "+ Arrays.toString(arraydata2));
    }
     // Main method
    public static void main(String[] args) {
        Sort17 ab= new Sort17();   // instance method calling via object
        ab.sortArray();
    }

}



