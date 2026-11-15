
//print sum of n natural numbers
import java.util.*;

public class Recursion2 {

    public static int sum = 0;

    public static void printSum(int n) { // 5
        sum += n;
        if (n == 0) {
            System.out.println(sum);
            return;
        }
        printSum(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 5
        printSum(n);
    }
}
