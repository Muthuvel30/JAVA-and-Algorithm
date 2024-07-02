
public class CharAtExample {
    public static void main(String[] args) {
        String str = "Hello World";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i); // returns the character at the specified index (0)
            System.out.println("Character at index:" + i + " : " + c);
        }
    }
}
