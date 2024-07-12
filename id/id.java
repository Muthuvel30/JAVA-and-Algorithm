import java.util.*;

public class id {
    static String key(String fi, String la, int pin, int n) {
        String lar;
        String sm;
        if (fi.length() > la.length()) {
            lar = fi;
            sm = la;
        } else {
            lar = la;
            sm = fi;
        }
        String f = (sm.substring(sm.length() - 1) + lar);
        String l = " ";
        for (char tem : f.toCharArray()) {
            if (Character.isUpperCase(tem)) {
                l = l + (Character.toLowerCase(tem));
            } else {
                l = l + (Character.toUpperCase(tem));
            }

        }
        return l + k(pin, n);
    }

    static String k(int pin, int n) {
        StringBuffer sb = new StringBuffer();
        String p = Integer.toString(pin);
        sb.append(p.charAt(n - 1));
        sb.append(p.charAt(p.length() - n));
        String j = sb.toString();
        return j;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String fi = s.next();
        String la = s.next();
        int pin = s.nextInt();
        int n = s.nextInt();
        s.close();
        System.out.println(key(fi, la, pin, n));
    }
}
