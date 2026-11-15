public class Recursion10 {

    public static int calcPartition(int[] arr, int low, int high) {

        int pivot = arr[low];
        int i = low;
        int j = high;
        while (i < j) {

            while (arr[i] <= pivot && i < high) {
                i++;
            }

            while (arr[j] > pivot && j > low) {
                j--;
            }
            // swap i and j
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;

    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int pivot = calcPartition(arr, low, high);
        quickSort(arr, low, pivot - 1);
        quickSort(arr, pivot + 1, high);
    }

    public static void main(String[] args) {
        int[] arr = { 4, 6, 2, 5, 7, 9, 1, 3 };
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
