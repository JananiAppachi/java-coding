import java.util.*;

//power of 2 or not
public class File16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPowerOfTwo = false;
        int rem = 0;
        while (n > 1 && rem == 0) {
            rem = n % 2;
            n = n / 2;
        }
        if (n == 1 && rem == 0)
            isPowerOfTwo = true;
        System.out.println(isPowerOfTwo);
    }

}
