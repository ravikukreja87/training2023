package statements;

import java.util.Scanner;

public class ForDemo {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);


        for(int i = 0 ; i < 3 ; i++) {

            System.out.print("Enter First Number: ");
            int numberOne = in.nextInt();

            System.out.print("Enter Operator (+,-,*,/,%) : ");
            String operator = in.next();

            System.out.print("Enter Second Number: ");
            int numberTwo = in.nextInt();

            switch (operator) {
                case "+":
                    System.out.println(numberTwo + numberOne);
                    break;
                case "-":
                    int result = 0;
                    if (numberOne >= numberTwo) {
                        System.out.println("Invoked from nested if");
                        result = numberOne - numberTwo;
                    } else {
                        System.out.println("Invoked from nested else");
                        result = numberTwo - numberOne;
                    }
                    System.out.println(result);
                    break;
                case "*":
                    System.out.println(numberTwo * numberOne);
                    break;
                case "/":
                    System.out.println(numberTwo / numberOne);
                    break;
                case "%":
                    System.out.println(numberTwo % numberOne);
                    break;
                default:
                    System.out.println("Invalid/Unrecognized operator. Use only (+,-,*,/,%)");
            }

        }

        System.out.println("Exiting");

    }
}
