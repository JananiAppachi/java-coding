import java.util.*;

public class TowerOfHanoi {

    public static void recursionFunction(int n, String src, String helper, String dest) {

        if (n == 1) {
            System.out.println("move the disc " + n + " from " + src + " to " + dest);
            return;
        }

        recursionFunction(n - 1, src, dest, helper);
        System.out.println("move the disc " + n + " from " + src + " to " + dest);
        recursionFunction(n - 1, helper, src, dest);

    }

    public static void main(String[] args) {

        int n = 3;
        recursionFunction(n, "s", "h", "d");
    }
}
