package Fibonaci;

import java.util.*;

public class fib {
    static int fibo(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return (fibo(n - 1) + fibo(n - 2));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(fibo(i) + "");
            s.close();
        }
    }
}
