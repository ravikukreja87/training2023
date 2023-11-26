package statements;

public class IfStmtDemo {

    public static void main(String[] args) {


        //Identifying whether a number is odd or even.
        //Input
        int number = 11;

        //Logic
        //if(condition) condition is always a boolean. It either returns true or false.
        if(number % 2 == 0) {  //== comparision operator  --> 1ms
            System.out.println("Number is even");
        } else {
            System.out.println("Number is Odd");
        }

        /*if(number % 2 != 0) {  //!= Not equal to            --> 1ms
                System.out.println("Number is Odd");
        }
*/

    }



    public void sum(){
        int numOne = 10;
        int numTwo = 11;
        int res = numOne + numTwo;
    }


}
