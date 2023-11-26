package others;

public class ArrayDemo {

    public static void main(String[] args) {


        //Store/Process marks of student

        int[] marks = {80,60,50,45,55,89};

//        System.out.println(marks[2]);

        int total = 0;

        for(int i = 0 ; i < marks.length ; i++ ) {
            total = total + marks[i];
        }

        System.out.println("total = " + total);
    }
}
