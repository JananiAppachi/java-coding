import java.util.*;

public class Recursion4 {

    public static void calculateFibonacci(int i1, int i2, int n) {
        // i1=0,i2=1,i3=i1+i2---i1=i2,i2=i3,i3=i1+i2-----i1=i2,i2=i3,i3=i1+i2---if(count==n)
        if (n == 0) {
            return;
        }
        int i3 = i1 + i2;
        System.out.println(i3);
        calculateFibonacci(i2, i3, n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("0");
        System.out.println("1");
        calculateFibonacci(0, 1, n - 2);
    }

}
