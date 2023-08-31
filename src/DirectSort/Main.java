package DirectSort;


public class Main {
    public static void main(String args[]) {

        int array[] = {1, 3, 5, 7, 9, 2, 4, 6, 8};

        DirectSort object = new DirectSort();

        System.out.println("Несортированный массив");
        object.printArray(array);

        object.sort(array);

        System.out.println("Сортированный массив");
        object.printArray(array);
    }
}
