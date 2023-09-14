import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        Scanner value = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = value.nextLine();
        System.out.println("You are " + name );
    }

}
