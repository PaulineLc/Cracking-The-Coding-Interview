/**
 * Created by pauline on 20/02/17.
 */
public class Ex2 {
    public static void main(String[] args) {
        String str1 = "Test me!";
        // Should print !em tseT
        System.out.println(reverse(str1));
    }

    public static String reverse(String str) {
        StringBuffer normalString = new StringBuffer(str);
        String reversedString = normalString.reverse().toString();
        return reversedString;
    }
}
