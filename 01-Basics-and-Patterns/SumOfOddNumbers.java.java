import java.util.Scanner;

public class File6 {
    public static int printOddSum(int n) {
        int sum=0;
        for(int i=1;i<=n;i+=2) {
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int sum = printOddSum(n);
        System.out.println(sum);
        
    }
}