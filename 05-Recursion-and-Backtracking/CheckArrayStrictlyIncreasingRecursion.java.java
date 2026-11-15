import java.util.*;

public class Recursion6 {
    // check if an array is sorted(strictly increasing) // 1 2 3 4 5, 4 3 5 6

    public static boolean isArraySorted(int[] a, int idx, boolean is) {
        if (idx == a.length - 1) {
            return is;
        }

        if (a[idx] >= a[idx + 1]) {
            is = false;
            return is;
        }
        isArraySorted(a, idx + 1, is);
        return is;
    }

    public static void main(String[] args) {

        int[] a = { 1, 2, 3, 4, 5, 7, 6 };
        boolean is = isArraySorted(a, 0, true);
        System.out.println(is);
    }

}
