import java.util.Arrays;
import java.util.Locale;

public class StringEquals {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = "hi o there hello";
        String s5 = "    hi there hello    ";
        String s6 = "Hello ram,Hello siva";

        // Java String equals() method
        System.out.println("s1 equals to s3: " + s1.equals(s3));
        System.out.println("s1 equals to s2: " + s1.equals(s2));
        System.out.println("s1 equals to hello: " + s1.equals("hello"));
        System.out.println("s1 equals to Hello: " + s1.equals("Hello"));

        // Java String equalsIgnoreCase() method
        System.out.println("s1 equals to Hello: " + s1.equalsIgnoreCase("Hello"));

        // Java String compareToIgnoreCase()
        String book1Name = "python";
        String book2Name = "PYTHON";
        System.out.println(book1Name.compareTo(book2Name));
        System.out.println(book1Name.compareToIgnoreCase(book2Name));
        // java charAt
        System.out.println(s2.charAt(2));
        // String start &end
        System.out.println(s4.startsWith("hi"));
        System.out.println(s4.startsWith("there", 3));
        System.out.println(s4.endsWith("hello"));
        // string trim and hashcode
        System.out.println(s5.hashCode());
        System.out.println("before trim:" + s5);
        System.out.println("After trim:" + s5.trim());
        System.out.println("After trim:" + s5.trim());
        // index java
        System.out.println(s4.indexOf("t"));
        System.out.println(s4.indexOf("h", 5));
        System.out.println(s4.lastIndexOf("e"));
        System.out.println(s4.indexOf("0", 2));
        // substring & boolean contains
        System.out.println(s1.substring(2));
        System.out.println(s1.substring(1, 4));
        System.out.println(s2.concat(book2Name));
        System.out.println(s2.concat("boss"));
        System.out.println(s2.replace('l', 'k'));
        System.out.println(s6.replaceAll("Hello", "hi"));
        System.out.println(s6.replaceFirst("Hello", "hi"));
        System.out.println(s4.contains("hello"));
        System.out.println(s4.contains("Hello"));
        // string case
        System.out.println(s3.toLowerCase());
        System.out.println(s3.toLowerCase(Locale.FRANCE));
        System.out.println(s3.toUpperCase());
        System.out.println(s3.toUpperCase(Locale.US));
        // String intern
        String s8 = new String("Hello");
        String s9 = "Hello";
        System.out.println(s8 == s9);
        String s10 = s8.intern();
        System.out.println(s10 == s9);
        // str empty
        System.out.println(s9.isEmpty());
        String s11 = "";
        System.out.println(s11.isEmpty());
        // str join
        String s12 = String.join("|", "A", "E", "I", "O", "U");
        System.out.println(s12);
        // split
        String str = new String("17/09/2022");
        String strArr[] = str.split("/");
        System.out.println(Arrays.toString(strArr));
        // str format
        int i = 10;
        double d = 10.5;
        System.out.println(String.format("Age is :%d", i));
        System.out.println(String.format("Weight is :%f", d));
        System.out.println(String.format("Message : %s", s1));
        // char array
        char[] s13 = s2.toCharArray();
        for (char c : s13) {
            System.out.println(c);
        }
        // str copy of
        char[] ch1 = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k' };
        String s14 = "Text";
        String s15 = "String";
        System.out.println(s14.copyValueOf(ch1));
        System.out.println(s15.copyValueOf(ch1, 5, 3));
        // boolean contentEquals(StringBuffer sb)
        StringBuffer sb = new StringBuffer("Hello, World!");
        boolean contentEquals = str.contentEquals(sb);
        System.out.println("String content equals StringBuffer" + contentEquals);
        // int length()
        int strLength = str.length();
        System.out.println("length() - Length of the string: " + strLength);

        // boolean matches(String regex)
        boolean matchesRegex = str.matches(".*World.*");
        System.out.println("Matches regex pattern " + matchesRegex);

        // int codePointAt(int index)
        int codePoint = str.codePointAt(0);
        System.out.println("Unicode code point at index 0:" + codePoint);
    }
}
