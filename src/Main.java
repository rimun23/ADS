import java.util.*;
import java.lang.*;
public class Main {
    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for check to prime: ");
        int number = input.nextInt();
        if (number<2){
            System.out.print("Composite");
        }
        else {
            boolean isPrime = true;
            for(int i = 2; i < Math.sqrt(number)+1; i++){
                if(number % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println("Prime");
            }
            else{
                System.out.println("Composite");
            }
        }
    }
}




