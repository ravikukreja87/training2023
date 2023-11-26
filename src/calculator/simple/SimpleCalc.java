package calculator.simple;

import java.util.Scanner;

public class SimpleCalc {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int numberOne = in.nextInt();

        System.out.print("Enter Second Number: ");
        int numberTwo = in.nextInt();

//        int numberOne = 10;
//        int numberTwo = 5;

        int add = numberOne + numberTwo;
        int sub = numberOne - numberTwo;
        int mult = numberOne * numberTwo;
        int div = numberOne / numberTwo;
        int rem = numberOne % numberTwo;

        System.out.println("Addition :  " + add);
        System.out.println("Subtraction :  " + sub);
        System.out.println("Multiplication :  " + mult);
        System.out.println("Division :  " + div);
        System.out.println("Remainder :  " + rem);


    }

}
