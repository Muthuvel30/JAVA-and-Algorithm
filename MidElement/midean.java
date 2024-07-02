package MidElement;

import java.util.*;

public class midean {
    static int mid(ArrayList<Integer> a) {
        int l = a.size();
        if (l % 2 == 0) {
            return (a.get(l / 2) + a.get(l / 2 - 1)) / 2;
        } else {
            return a.get(l / 2);
        }

    }

    public static void ode(int[] n) {
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> eve = new ArrayList<>();
        for (int i = 0; i < n.length; i++) {
            if (n[i] % 2 == 0) {
                eve.add(n[i]);
            } else {
                odd.add(n[i]);
            }

        }
        Collections.sort(odd);
        Collections.sort(eve);
        System.out.println(mid(odd));
        System.out.println(mid(eve));
        eve.addAll(odd);
        System.out.println(eve);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] n = Arrays.stream(s.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        s.close();
        ode(n);
    }

}
