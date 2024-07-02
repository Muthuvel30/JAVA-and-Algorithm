package Palindrome;

import java.util.*;

public class palidrome {
    public static int pali(int n) {
        int s = 0;
        while (n > 0) {
            int d = n % 10;
            s = (s * 10) + d;
            n /= 10;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        int m = pali(n);
        if (m == n) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
