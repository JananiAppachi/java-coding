public class Recursion7 {
    // move all x to the end of the string - axbcxxd
    public static String transformedString(String str, int idx, int count, String newStr) {// -1,-1
        if (idx == str.length()) {
            while (count >= 1) {
                newStr += 'x';
                count--;
            }

            return newStr;
        }
        if (str.charAt(idx) == 'x') {
            count++;
        }
        if (str.charAt(idx) != 'x') {
            newStr += str.charAt(idx);
        }
        return transformedString(str, idx + 1, count, newStr);

    }

    public static void main(String[] args) {
        System.out.println(transformedString("axxcxxd", 0, 0, ""));

    }

}
