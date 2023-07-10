public class BubbleSort {
    public static void main(String[] args) {
        int data[] = {2, 1, 5, 0, 7, 4};
        int i, j, temp;
        
        for (i = 0; i < data.length - 1; i++) {
            for (j = data.length - 1; j > i; --j) {   
                if (data[j] < data[j - 1]) {
                    temp = data[j];
                    data[j] = data[j - 1];
                    data[j - 1] = temp;
                }
            }
        }
        
        System.out.print("Array after sorting: ");
        for (i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }
}
