import java.util.*;
import java.lang.*;
public class Main {
    public static long factorial(int number){
        if(number == 0 || number == 1){
            return 1;
        }
        else{
            return number * factorial(number - 1);
        }
    }
    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for factorial: ");
        int number = input.nextInt();
        System.out.println(factorial(number));
    }
}



