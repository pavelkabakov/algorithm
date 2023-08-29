package HeapSort2;

public class Main {
    public static void main(String args[]) {

        int array[] = {12, 11, 13, 15, 16, 17, 19, 2, 2, 3, 6, 9, 789, 123, 789};

        HeapSort object = new HeapSort();

        System.out.println("Несортированный массив");
        object.printArray(array);

        object.sort(array);

        System.out.println("Сортированный массив");
        object.printArray(array);
    }
}
