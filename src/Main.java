import java.util.*;
import java.lang.*;
public class Main {
    public static int fibonacci(int number) {
        if (number == 0) {
            return 0;
        }
        if (number == 1) {
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }
    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for factorial: ");
        int number = input.nextInt();
        System.out.println(fibonacci(number));
    }
}


