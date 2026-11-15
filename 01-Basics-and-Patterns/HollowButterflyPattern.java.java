import java.util.*;
class file1{
    public static void main(String[] args)
    {
       int n=5;
       //upper part
       for(int i=1;i<=n;i++)
       {
        for(int j=1;j<=n;j++)
        {
            if(j==1 || j==i)
            {
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        for(int j=5;j>=1;j--)
        {
            if(j==1 || j==i)
            {
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
       }
       //lower part
       for(int i=n;i>=1;i--)
       {
        for(int j=1;j<=n;j++)
        {
            if(j==1 || j==i)
            {
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        for(int j=5;j>=1;j--)
        {
            if(j==1 || j==i)
            {
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
       }
       
   
       
    }
}