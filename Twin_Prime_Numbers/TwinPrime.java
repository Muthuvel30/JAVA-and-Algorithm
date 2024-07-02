package Twin_Prime_Numbers;

import java.util.*;

public class TwinPrime {

    static boolean isPrime(int num) {
        for (int i = 2; i <= (num / 2); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int end = sc.nextInt();
        sc.close();

        for (int i = 2; i < end; i++) {

            if (isPrime(i)) {
                // System.out.println("Prime number");
                list.add(i);
            }
        }

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) - list.get(i) == 2) {
                    System.out.println(list.get(i) + " " + list.get(j));
                }
            }
        }
    }
}
