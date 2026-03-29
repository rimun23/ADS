import java.util.*;
import java.lang.*;
public class Main {
    public static void permute(String string, String space) {
        if (string.length() == 0) {
            System.out.println(space);
            return;
        }

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            String rest = string.substring(0, i) + string.substring(i + 1);
            permute(rest, space + ch);
        }
    }
    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for power: ");
        String string = input.next();
        permute(string, "");
    }
}


