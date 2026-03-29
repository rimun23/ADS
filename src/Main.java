import java.util.*;
public class Main {
    public static int findMin(int[] arr){
        int min = arr[0];
        for(int i : arr){
            if(i<min){
                min = i;
            }
        }
        return min;
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
        System.out.println("minimum number in this array is " + findMin(arr));
    }
}





