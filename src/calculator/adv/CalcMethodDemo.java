package calculator.adv;

import java.util.Scanner;

public class CalcMethodDemo {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int numberOne = in.nextInt();

        System.out.print("Enter Second Number: ");
        int numberTwo = in.nextInt();

        displayOutput(calculate(numberOne,numberTwo,"+"), "Add");
        displayOutput(calculate(numberOne,numberTwo,"-"),"Sub");
        displayOutput(calculate(numberOne,numberTwo,"*"),"Mult");
        displayOutput(calculate(numberOne,numberTwo,"/"), "Div");
        displayOutput(calculate(numberOne,numberTwo,"%"), "Rem");
    }

    public static int calculate(int numberOne, int numberTwo,String operator){ //Return Type (Data)
        int result = 0;

        switch (operator) {
            case "+":
                result = numberOne + numberTwo;
                break;
            case "-":
                result = numberOne - numberTwo;
                break;
            case "*":
                result = numberOne * numberTwo;
                break;
            case "/":
                result = numberOne / numberTwo;
                break;
            case "%":
                result = numberOne % numberTwo;
                break;
            default:
                System.out.println("Invalid/Unrecognized operator. Use only (+,-,*,/,%)");
        }

        return result;
    }

    public static void displayOutput(int result, String resultType) {
        System.out.println("============Welcome to the Calculator - "+ resultType +" Module===============");
        System.out.println("Copyrights with original developer");
        System.out.println(resultType + " is : " + result);
    }

    public static String welcomeMessage() {
        return "Welcome to the Programming World";
    }
}
