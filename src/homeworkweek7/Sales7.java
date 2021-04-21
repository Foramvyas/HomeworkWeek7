package homeworkweek7;
/*
Write a java program input sales id, seller's name, sales amount, and salary basic and  then fined this sales
Commission
 Sales amount >= 50,000 35%
 Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2%
*/


import java.util.Scanner;

public class Sales7 {

     void mySalesCommission() {

        int salesid;
        String sellername;
        double salesamount, basicsalary, salescommission = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Input sales Id: ");
        salesid = sc.nextInt();
        System.out.println("Enter seller's name");
        sellername = sc.next();
        System.out.println("Enter sales amount");
        salesamount = sc.nextFloat();
        System.out.println("Enter basic salary");
        basicsalary = sc.nextDouble();
        // if condition

        if (salesamount >= 500000.00) {
            salescommission = salesamount * 0.35;
        } else if (salesamount >= 30000.00) {
            salescommission = salesamount * 0.2;
        } else if (salesamount >= 20000.00) {
            salescommission = salesamount * 0.1;
        } else if (salesamount >= 10000.00) {
            salescommission = salesamount * 0.05;
        } else if (salesamount < 10000.00) {
            salescommission = salesamount * 0.02;
        }
        System.out.println("sales Commission: " + salescommission);


    }

    //Main method

    public static void main(String[] args) {

        Sales7 ac= new Sales7();
        ac.mySalesCommission();     //instance method calling via object
    }




}
