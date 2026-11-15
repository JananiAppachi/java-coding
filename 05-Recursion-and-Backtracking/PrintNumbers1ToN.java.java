import java.util.*;

public class PrintNumbers1ToN {

    public static void printNumb(int n) { // 1 2 3 4 5 -> first call everything from 5 to 1 then print after it so that
        // each function returning print from 1 to 5.
        // base case
        if (n == 0)
            return;

        // print
        printNumb(n - 1); // recursion
        System.out.println(n);
    }

    public static void main(String[] args) {
        int n = 5;
        printNumb(n);
    }

}
