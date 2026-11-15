import java.util.*;
public class File8 {

    public static int printPowerOfTwoNums(int x,int y) {
        int product=1;
        for(int i=1;i<=y;i++)
        {
            product*=x;
        }
        return product;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println(printPowerOfTwoNums(x,y));
    }
}
