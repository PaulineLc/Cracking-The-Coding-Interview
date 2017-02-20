/**
 * Created by pauline on 20/02/17.
 */
public class Ex1 {
    public static void main(String[] args) {

        String str1 = "Cwm_fjord-bank!glyphs?vext quiz.";
        // Should be true
        System.out.println(hasAllUniqueCharacters(str1));

        String str2 = "Kitty!";
        // Should be false
        System.out.println(hasAllUniqueCharacters(str2));

    }

    public static boolean hasAllUniqueCharacters(String str) {
        boolean[] hasCharacter = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int ch = str.charAt(i);
            if (hasCharacter[ch]) {
                return false;
            }
            hasCharacter[ch] = true;
        }
        return true;
    }
}
