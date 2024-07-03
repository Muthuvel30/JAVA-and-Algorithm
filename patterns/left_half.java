package patterns;

import java.util.*;

public class left_half {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        for (int i = n; i > 0; i--) {
            for (int j = 0; j <= n; j++) {
                if (j >= i) {

                    System.out.print("*");
                } else {

                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

}
