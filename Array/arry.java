package Array;

import java.util.*;

public class arry {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // String[] k=(s.nextLine().split("\\s+"));
        int[] p = Arrays.stream(s.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        // for(int i=0;i<5;i++){
        // k[i]=s.nextInt();
        // }
        // for(int i : k){
        // System.out.print(i);
        // }
        // System.out.print(Arrays.toString(k));
        // System.out.println(k[1]);
        System.out.print(Arrays.toString(p));

        // System.out.println(k);
        // System.out.print(Arrays.toString(k));
        // System.out.print(k[1]/2);
        s.close();
    }
}
