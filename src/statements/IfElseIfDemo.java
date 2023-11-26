package statements;

public class IfElseIfDemo {


    public static void main(String[] args) {
        String color = "Orange";

        boolean condition = color.equals("Orange");
        if(condition){
            System.out.println("Color is Orange");
        } else if(color == "Red") {
            System.out.println("Red");
        } else {
            System.out.println("Other Color");
        }
    }
}