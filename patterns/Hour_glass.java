package patterns;

import java.util.*;

class Hour_glass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        for (int i = n; i >= 1; i--) {
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (i * 2) - 1; j++) {
                if (j % 2 == 1) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }

            }
            System.out.println();
        }
        for (int i = 2; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (i * 2) - 1; j++) {
                if (j % 2 == 1) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }

            }
            System.out.println();
        }
    }

}
