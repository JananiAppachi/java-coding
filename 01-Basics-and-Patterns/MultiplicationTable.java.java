import java.util.Scanner;
public class File4 {
    //function
    public static void printTable(int n) {
        //loop
        for(int i=1;i<=10;i++) {    // 2 * 1 = 2    n * i = result
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printTable(n);
    }
}