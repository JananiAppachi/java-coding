import java.util.Scanner;
public class File5 {

    public static double printAverage(int a,int b,int c) {
        double average = (a+b+c)/3.0;
        double result = (int) (average*10) / 10.0;
        return result;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        double average = printAverage(a,b,c);
        System.out.println("Average is "+average);
    }

    
}
