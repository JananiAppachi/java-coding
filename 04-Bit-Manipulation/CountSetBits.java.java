import java.util.*;

//to count the no of 1s in the binary representaiton of a number

public class File18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 5
        int count = 0;
        int rem = -1;

        while (n > 0) {
            rem = n % 2; // 1,0,1
            if (rem == 1) {
                count++; // 1,2
            }
            n = n / 2; // 2,1,0
        }
        System.out.println(count);
    }
}
