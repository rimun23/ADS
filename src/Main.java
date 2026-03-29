import java.util.*;
import java.lang.*;
public class Main {
    public static int Coof(int n1, int n2) {
        if (n2 == 0 || n2 == n1) {
            return 1;
        }
        return Coof(n1 - 1, n2 - 1) + Coof(n1 - 1, n2);
    }
    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number or text: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println(Coof(num1, num2));
    }
}
