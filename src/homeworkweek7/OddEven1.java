package homeworkweek7;

/*
Write a java program that tells us that Input number is odd or even?  HINT: use ternary operator (? :)

*/



import java.util.Scanner;

public class OddEven1 {

// Instance Method

    void m1(){

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number");
        int num= sc.nextInt();
       String evenOdd = (num % 2==0) ? "even" : "odd";   // ternary operator: is also known as conditional operator:
        // is used to evaluate boolean expression.The goal of the operator is to decide , which value shoud be assign to the variable.


        System.out.println( num + " is " + evenOdd);
    }
  // Main method
    public static void main(String[] args) {

     OddEven1 obj = new OddEven1();
     obj.m1();    // Calling Instance method via object

    }
}

