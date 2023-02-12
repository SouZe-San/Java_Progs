
import java.util.Scanner;

class CheckClass {
    char storeCh;
    String newString = "";

    void check(String str) {
        for (int i = 0; i < str.length(); i++) {
            storeCh = str.charAt(i);
            newString = storeCh + newString;
        }
        if (str.equals(newString)) {
            System.out.println("given Input is a Palindrome");
        } else {
            System.out.println("Given Input is Not a Palindrome");
        }
    }
}

public class PalindronChaker {
    public static void main(String[] args) {
        System.out.println("Give String or Integer for checking Palindrome");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter: ");
        String input_String = sc.nextLine();
        sc.close();
        CheckClass palCheck = new CheckClass();
        palCheck.check(input_String);

    }
}
