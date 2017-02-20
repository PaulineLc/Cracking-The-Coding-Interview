/**
 * Created by pauline on 20/02/17.
 */
public class Ex3 {
    public static void main(String[] args) {

        // Should be true
        System.out.println(isPermutation("eleven plus two", "twelve plus one"));

        // Should be false
        System.out.println(isPermutation("something", "somethink"));

    }

    public static boolean isPermutation(String str1, String str2) {
        if (str1.equals(str2) || str1.length() != str2.length()) {
            return false;
        }

        int[] charCount = new int[128];

        for (int i = 0; i < str1.length(); i++) {
            charCount[str1.charAt(i)]++;
            charCount[str2.charAt(i)]--;
        }

        for (int i: charCount) {
            if (i != 0) {
                return false;
            }
        }

        return true;
    }
}
