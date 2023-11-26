package others;

import java.util.Scanner;

public class PowerDemo {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Base: ");
        int base = in.nextInt();

        System.out.print("Enter Exponent: ");
        int exponent = in.nextInt();

        double result = Math.pow(base,exponent);

        System.out.println("Ans : " + result);
    }
}