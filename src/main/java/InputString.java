import java.util.Scanner;

public class InputString {

    String input() {
        System.out.println("Enter words and spaces:  ");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        return s;
    }
}
