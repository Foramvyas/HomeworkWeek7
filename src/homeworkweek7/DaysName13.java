package homeworkweek7;
/*
(13)Write a Java program which input any number between 1 to 7 and it print The Days  name MONDAY, TUESDAY…..SUNDAY
of the week accordingly by using switch.
NOTE: if number is out of selection Print message “Week contains 1 to 7 days”

 */

import java.util.Scanner;

public class DaysName13 {

  static void weekdays(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter number between 1to7");
      int days = sc.nextInt();
     // switch condition

      switch(days)
      {
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
              System.out.println("Satuday");
              break;

          case 7:
              System.out.println("Sunday");
              break;

          default:
              System.out.println("Week contains 1 to 7 days");
              break;
      }

  }
 // main method

    public static void main(String[] args) {


      DaysName13.weekdays();   // calling static method via class name
    }
}
