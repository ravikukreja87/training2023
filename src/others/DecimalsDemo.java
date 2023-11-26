package others;

public class DecimalsDemo {

    public static void main(String[] args) {

        float one = 3.3f;
        float two = 4.4f;
        double ans = one+two; //Implicit type casting
        System.out.println(ans);

        //By default java treats any decimal as double.

        double a = 10.9;
        double b = 1.1;
        float answer = (float) (a+b); //Explicit type casting
        System.out.print(answer);

    }
}
