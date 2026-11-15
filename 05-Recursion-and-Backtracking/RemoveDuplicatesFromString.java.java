public class Recursion8 { // abbccdafgghz

    public static void removeDuplicates(String str, String newStr, int idx) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char c = str.charAt(idx);
        if (!newStr.contains(String.valueOf(c))) {
            newStr += c;
        }
        removeDuplicates(str, newStr, idx + 1);
    }

    public static void main(String[] args) {
        removeDuplicates("abbccdafgghz", "", 0);
    }

}
