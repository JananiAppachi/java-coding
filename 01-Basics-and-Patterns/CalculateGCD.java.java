import java.util.Scanner;
public class File9 {
    public static int calculateGcd(int a,int b) {
        while(b>0)
        {
            int remainder=a%b;
            a=b;
            b=remainder;
        }
        return a;
    }

public static void main(String[] args) {
     //input
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     int b=sc.nextInt();
     System.out.println(calculateGcd(a,b));
} 
    
}
