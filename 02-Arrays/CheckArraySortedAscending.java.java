import java.util.Scanner;

public class File11 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numbers[] = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        boolean inAscending = true;
        for (int i = 0; i < n - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                inAscending = false;
            }
        }
        if (inAscending) {
            System.out.print("{ ");
            for (int i = 0; i < n; i++) {
                System.out.print(numbers[i] + " ");

            }
            System.out.print("} is sorted in ascending order");
        } else {
            System.out.print("{ ");
            for (int i = 0; i < n; i++) {
                System.out.print(numbers[i] + " ");

            }
            System.out.print(" } is not sorted in ascending order");
        }

    }
}
