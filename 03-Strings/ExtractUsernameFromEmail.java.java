import java.util.*;

public class File15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // string array total length calculation
        /**
         * int n = sc.nextInt();
         * sc.nextLine();
         * String[] a = new String[n];
         * for (int i = 0; i < n; i++) {
         * a[i] = sc.nextLine();
         * }
         * int len = 0;
         * for (int i = 0; i < n; i++) {
         * len += a[i].length();
         * }
         * System.out.println(len);
         * 
         * 
         * // string character e to i
         * 
         * String str = sc.nextLine();
         * String result = "";
         * for (int i = 0; i < str.length(); i++) {
         * if (str.charAt(i) == 'e') {
         * result += 'i';
         * } else {
         * result += str.charAt(i);
         * }
         * }
         * System.out.println(result);
         */
        // bring email from user as input and return the name part as output

        String str = sc.nextLine();
        String name = "";

        int i = 0;
        while (str.charAt(i) != '@') {
            name += str.charAt(i);
            i++;
        }

        System.out.println(name);

    }

}
