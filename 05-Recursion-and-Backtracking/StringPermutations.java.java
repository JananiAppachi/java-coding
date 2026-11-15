import java.util.*;

public class Recursion9_Permutation {

    public static void printPermutations(String str, String perm, int idx) {

        if (str.length() == 0) {
            System.out.println(perm);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPermutations(newStr, perm + currChar, idx + 1);
        }
    }

    public static void main(String[] args) {
        printPermutations("ABC", "", 0);
    }

}
