import java.util.*;

//decimalToBinary() & binaryToDecimal() to convert a number from one number system to another.

public class File19 {

    public static void decimalToBinary(int n) {
        int rem = -1;
        StringBuilder str = new StringBuilder();
        StringBuilder res = new StringBuilder();
        if (n == 0) {
            System.out.println("0");
            return;
        }
        while (n > 0) {
            rem = n % 2;
            n = n / 2;
            str.append(rem);
        }
        for (int i = str.length() - 1; i >= 0; i--) {
            res.append(str.charAt(i));
        }
        System.out.println(res);
    }

    public static void binaryToDecimal(String b) { // 1010
        int sum = 0;
        int j = 0;
        for (int i = b.length() - 1; i >= 0; i--) {
            sum += Math.pow(2, j) * Integer.parseInt(b.charAt(i) + ""); // 1
            j++;
        }
        System.out.println(sum);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String b = sc.nextLine();
        decimalToBinary(n);
        binaryToDecimal(b);
    }

}
