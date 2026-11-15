public class Recursion5 {
    public static int first = -1;
    public static int last = -1;

    public static void findElement(String s, int idx, char element) {

        if (idx == s.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }

        if (s.charAt(idx) == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        findElement(s, idx + 1, element);
    }

    public static void main(String[] args) {
        String s = "abaacdaefaah";
        char element = 'a';
        findElement(s, 0, element);
    }

}
