package Rept_Array;

import java.util.*;

public class rep {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter length of Array: ");
        int n = s.nextInt();
        int[] a = new int[n];
        Set<Integer> se = new HashSet<>();
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] == a[i]) {
                    se.add(a[j]);

                }
            }
        }
        System.out.println(se);
        s.close();
    }
}
