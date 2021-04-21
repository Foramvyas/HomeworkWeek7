package homeworkweek7;
/*
Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if  any other alphabet should be invalid entry
 */

import java.util.Scanner;

public class CityName8 {

    void city(){
        Scanner sc=  new Scanner(System.in);
        System.out.println("Input Alphabet");
        char city= sc .next().charAt(0);

        // if else condition

        if (city == 'a'){
            System.out.println("Amsterdam");
        }else if(city == 'b'){
            System.out.println("Bombay");
        }else if( city == 'c'){
            System.out.println("Cochin");
        }else if (city == 'd'){
            System.out.println("Delhi");
        }else if (city == 'e'){
            System.out.println("Edinburgh");
        } else if (city == 'f'){
            System.out.println("Fatehpura");
        }else{
            System.out.println("Invalid entry");

        }
    }

    // main method
    public static void main(String[] args) {
        CityName8 obj = new CityName8();      //calling instance method via object
        obj.city();
    }






}
