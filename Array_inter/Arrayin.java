package Array_inter;

import java.util.*;

public class Arrayin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Set<Integer> se = new HashSet<>();
        System.out.print("Enter Length of A1:");
        int n = s.nextInt();
        int[] a1 = new int[n];
        for (int i = 0; i < n; i++) {
            a1[i] = s.nextInt();
        }
        System.out.print("Enter Length of A2:");
        int m = s.nextInt();
        int[] a2 = new int[m];
        for (int i = 0; i < m; i++) {
            a2[i] = s.nextInt();
        }
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a2.length; j++) {
                if (a1[i] == a2[j]) {
                    se.add(a1[i]);

                }
            }

        }
        System.out.println(se);
        s.close();

    }

}
