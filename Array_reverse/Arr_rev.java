package Array_reverse;

import java.util.*;

public class Arr_rev {
    public static void rev(int arr[], int n) {
        for (int i = 0; i < (n / 2); i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        System.out.println("After reversing: ");
        for (int t : arr) {
            System.out.print(t + " ");
        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of Array:");
        int len = s.nextInt();
        int arr[] = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Before reverse:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        rev(arr, arr.length);
        s.close();
    }

}
