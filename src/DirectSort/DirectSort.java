package DirectSort;

public class DirectSort {
    public static void sort(int[] array){
        for (int i = 0; i < array.length ; i++) {
            int minPosition = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[minPosition]) {
                    minPosition = j;

                }
            }
            if (minPosition != i){
                int temp = array[i];
                array[i] = array[minPosition];
                array[minPosition] = temp;
            }

        }
    }

    public void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}
