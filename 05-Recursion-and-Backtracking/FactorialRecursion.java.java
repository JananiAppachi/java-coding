import java.util.*;

//print factorial of a given number
public class Recursion3 {

    public static int PrintFactorial(int n) {

        if (n == 0) {
            return 1;
        }
        return n * PrintFactorial(n - 1);
    }

    public static void main(String[] args) {
        int result = PrintFactorial(5);
        System.out.println(result);
    }

}
