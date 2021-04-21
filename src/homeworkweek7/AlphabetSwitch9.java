package homeworkweek7;
/*
(9) Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
any other alphabet should be invalid entry
 Same as above program-8 using switch statement.
*/

import java.util.Scanner;

public class AlphabetSwitch9 {

     void cityName(){

         Scanner sc=  new Scanner(System.in);   // import Scanner class
         System.out.println("Input Alphabet");
         char city= sc .next().charAt(0);

         switch(city)                                 // switch statement
         {
             case ('A'):
                System.out.println("Amsterdam+");
                break;

            case ('B'):
                System.out.println("Bombay");
                break;

             case ('C'):
                System.out.println("Cochin");
                break;
             case ('D'):
                System.out.println("Delhi");
                break;

             case ('E'):
                System.out.println("Edinbutgh");
                break;

             case ('F'):
                System.out.println("Fatehpura");
                break;

            default:
                System.out.println("Invalid Entry");
                break;
        }

     }
     // main method

    public static void main(String[] args) {
         AlphabetSwitch9 ct= new AlphabetSwitch9();   // calling instance method in main method via object
         ct.cityName();

    }

}
