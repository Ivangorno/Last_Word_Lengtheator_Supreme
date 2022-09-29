import java.util.Scanner;

public class InputString {

    String input() {
        System.out.println("Enter words and spaces:  ");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}
