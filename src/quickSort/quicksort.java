package quickSort;

public class quicksort {

    public static void main(String[] args) {
        int[] array = new int[]{1, 22, 55, 5, 78, 56, 2, 3, 2, 74, 56, 99, 45, 11, 11, 4, 3, 24};
        System.out.println("длинна массива = " + array.length);
        System.out.println("исходный массив");
        printArray(array);
        sort(array, 0, array.length-1);
        System.out.println("отсортированный массив");
        printArray(array);
    }


    public static void sort(int[] array, int startPosition, int endPosition) {
        int leftPosition = startPosition;
        int rightPosition = endPosition;
        int pivot = array[(startPosition + endPosition) / 2];
        do {
            while (array[leftPosition] < pivot) {
                leftPosition++;
            }
            while (array[rightPosition] > pivot) {
                rightPosition--;
            }
            if (leftPosition <= rightPosition) {
                if (leftPosition < rightPosition) {
                    int temp = array[leftPosition];
                    array[leftPosition] = array[rightPosition];
                    array[rightPosition] = temp;
                }
                leftPosition++;
                rightPosition--;
            }
        }
        while (leftPosition <= rightPosition);
        if (leftPosition < endPosition) {
            sort(array, leftPosition, endPosition);
        }
        if (startPosition < rightPosition) {
            sort(array, startPosition, rightPosition);
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+", ");
        }
        System.out.println();
    }


}

