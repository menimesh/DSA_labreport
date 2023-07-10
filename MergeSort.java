public class MergeSort {
    public static void mergeSort(int[] arr, int low, int high) {
        int N = high - low;
        if (N <= 1)
            return;
        int mid = low + N / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid, high);
        int[] temp = new int[N];
        int i = low, j = mid;
        for (int k = 0; k < N; k++) {
            if (i == mid)
                temp[k] = arr[j++];
            else if (j == high)
                temp[k] = arr[i++];
            else if (arr[j] < arr[i])
                temp[k] = arr[j++];
            else
                temp[k] = arr[i++];
        }
        for (int k = 0; k < N; k++)
            arr[low + k] = temp[k];
    }

    public static void main(String[] args) {
        int[] arr = {1, 8, 6, 4, 10, 5, 3, 2, 22, 33, 0};
        System.out.println("Array before sorting:");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        mergeSort(arr, 0, arr.length);
        System.out.println("\nElements after sorting:");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
