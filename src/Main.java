import java.util.*;
import java.lang.*;
public class Main {
    public static long power(int a, int number) {
        if (number == 0) {
            return 1;
        }
        return a * power(a, number - 1);
    }
    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for power: ");
        int a = input.nextInt();
        int number = input.nextInt();
        System.out.println(power(a, number));
    }
}


