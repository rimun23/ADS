import java.util.*;
public class Main {
    public static float findAvg(int[] arr, int number){
        int full = 0;
        for(int i : arr){
            full += arr[i-1];
        }
        float res = (float) full/number;
        return res;
    }
    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for limit an array: ");
        int number = input.nextInt();
        int[] arr = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Enter " + (i+1) + " number in array by index: ");
            arr[i] = input.nextInt();
        }
        System.out.println("average number in this array is " + findAvg(arr, number));
    }
}





