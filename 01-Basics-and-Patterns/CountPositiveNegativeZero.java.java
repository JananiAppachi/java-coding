import java.util.*;
public class File7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int positive=0;
        int negative=0;
        int zero=0;
        System.out.println("Enter numbers else enter exit to finish: ");
        String input="";
        int number=0;
        int c=0;
        do{
            input=sc.nextLine();
            if(!input.equalsIgnoreCase("exit"))
                number=Integer.parseInt(input);
            else
                c++;
            if(number>=1)
                positive++;
            else if(number==0 && c==0)
                zero++;
            else if(number<0)
                negative++;
            else
                continue;
            
        }while(!input.equalsIgnoreCase("exit"));
        System.out.println("No of +ve :"+positive);
        System.out.println("No of -ve :"+negative);
        System.out.println("No of 0 :"+zero);
    }
}