import java.util.Scanner;

public class Console {
    private static Scanner value = new Scanner(System.in);

    public static double getValue(String prompt){
        return value.nextDouble();
    }
    public static double getValue(String prompt, double min, double max){
        double input;

        while (true) {

            System.out.print(prompt);

            input = value.nextDouble();
            if(input>=min && input<=max)
                break;
            System.out.println("Enter a value between " +min +"and "+max);

        }
        return input;
    }
}
