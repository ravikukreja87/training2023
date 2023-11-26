package calculator.simple;




import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {

        Math.pow(10,10);

        //+, -, * , /

        Scanner in = new Scanner(System.in);
        int result = 0; //Variable Initialization


        System.out.print("Enter First Number: ");
        int numberOne = in.nextInt();

        System.out.print("Enter Operator (+,-,*,/,%) : ");
        String operator = in.next();

        System.out.print("Enter Second Number: ");
        int numberTwo = in.nextInt();

        if (operator.equals("+")) {
            result = numberOne + numberTwo;
        } else if (operator.equals("-")) {

           //Nested If. If inside an if
            if(numberOne >= numberTwo){
                System.out.println("Invoked from nested if");
                result = numberOne - numberTwo;
            } else {
                System.out.println("Invoked from nested else");
                result = numberTwo - numberOne;
            }

        } else if (operator.equals("*")){
            result = numberOne * numberTwo;
        } else if (operator.equals("/")){
            result = numberOne / numberTwo;
        } else if (operator.equals("%")){
            result = numberOne % numberTwo;
        } else {
            System.out.println("Invalid/Unrecognized operator. Use only (+,-,*,/,%)");
        }
        System.out.println("Result :  " + result);
    }
}

//Always sub smaller number from larger.
