import java.util.*;

//toggle the bit at given postion of a number
public class File17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 5 - 0101
        int pos = sc.nextInt(); // 1 //2
        // calculate posVal
        int n1 = 1 << pos;
        int n2 = n1 & n;
        int posVal = 1;
        if (n2 == 0) {
            posVal = 0;
        }
        // logic to toggle
        int newVal = 0;
        if (posVal == 0) {
            newVal = n1 | n;
        } else {
            n1 = ~n1;
            newVal = n1 & n;
        }
        System.out.println(newVal);
    }
}
