import java.util.Scanner;
public class File10 {
    public static void printFibonacci(int n) {
        int a=0;
        int b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        
        for(int i=3;i<=n;i++) {
       
            int c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printFibonacci(n);
    }
    
}
