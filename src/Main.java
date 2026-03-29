import java.util.*;
import java.lang.*;
public class Main {
    public static int gcd(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return gcd(num2, num1 % num2);
    }
    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number or text: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println(gcd(num1, num2));
    }
}