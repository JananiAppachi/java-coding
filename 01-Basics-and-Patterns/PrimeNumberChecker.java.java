import java.util.Scanner;
public class File3 {
    public static boolean isPrime(int n)
    {
        
        //loop
        if(n<=0)
        {
            return false;
        }
        if(n==1)
        {
            System.out.println("Neither prime nor composite");
            return false;
        }
        for(int i=2;i<=n/2;i++)
        {
            // System.out.println(i);
            // System.out.println(n%i);
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isPrime(n)? "The number "+n+" is prime" : "The number "+n+" is not a prime");
        sc.close();
    }
    
}
