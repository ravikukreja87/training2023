package statements;

import java.util.Scanner;

public class DoWhileDemo {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);


        int i = 0;
        do {
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

            System.out.print("Do you want to continue : ");
            String exitFlag = in.next();
            if (exitFlag.equals("N") || exitFlag.equals("n")) { //true or false = true // true or true = true // false or true = true
                i = 3;
            }
        } while (i < 3);
        System.out.println("Exiting");
    }
}
