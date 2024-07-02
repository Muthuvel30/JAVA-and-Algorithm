package MidElement;

import java.util.*;

public class assss {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // System.out.println(num);
        sc.close();
        int copy = num;
        while (num > 0) {
            int rem = num % 10;
            list.add(rem);
            num /= 10;
        }

        int len = list.size();
        if (len % 2 == 0) {
            System.out.println("Invalid Number");
        } else {
            System.out.println("Mid Element: " + list.get(len / 2));
            int digit = (int) Math.pow(10, len - 1);
            System.out.println(digit);
            System.out.println(digit + "th Digit in Given Number: " + copy / digit);
        }

    }
}
