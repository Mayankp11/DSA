import java.util.Scanner;

public class AverageCalculation {
    public static void main(String[] argument){

        Scanner marks = new Scanner(System.in);

        System.out.print("Enter course1 marks: ");
        short course1 = marks.nextShort();

        System.out.print("Enter course2 marks: ");
        short course2 = marks.nextShort();

        System.out.print("Enter course3 marks: ");
        short course3 = marks.nextShort();

        int average = (course1+course2+course3)/3;

        System.out.println(average);

        if(average>=25){
            System.out.println("You got an A grade");
        }
        else if (average<25 &&average>=15) {
            System.out.println("You got a B grade");
        }
        else
            System.out.println("You got a C grade");










    }
}

