import java.util.*;
import java.lang.*;
public class Main {
    public static String isDigits(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return "No";
            }
        }
        return "Yes";
    }
    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number or text: ");
        String string = input.next();
        System.out.println(isDigits(string));
    }
}

