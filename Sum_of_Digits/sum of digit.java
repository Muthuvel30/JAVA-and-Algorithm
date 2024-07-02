package Sum_of_Digits;

import java.util.*;

class Hello {
    public int sum(int n) {
        int s = 0;
        while (n != 0) {
            int d = n % 10;
            s = s + d;
            n /= 10;
        }
        if (s >= 10 || s <= -10) {
            s = sum(s);
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        Hello f = new Hello();
        System.out.println(f.sum(n));
    }
}