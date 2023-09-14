import java.util.Locale;
import java.util.Scanner;

public class WhilePractice {
    public static void main(String[] argument){           //Enter words accept all until 'end'

        //Scanner words = new Scanner(System.in);

        String words = "";

        while(true) {
            System.out.print("Enter the input: ");
            Scanner text = new Scanner(System.in);
            words = text.nextLine().toLowerCase();

        if(words.equals("quit")) {
            break;
        }
        if(words.equals("pass")){
            continue;
        }

        System.out.println(words);


        }

    }
}
