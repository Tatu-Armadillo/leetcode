public class OrderByIntegerNumbers {

    public static void main(String[] args) {
        int[] array1 = { 6, 5, 4, 3, 2, 1 };
        int[] array2 = { 10, 7, 8, 9, 1, 5 };
        int[] array3 = { 10, 7, 8, 9, 1, 5, 6, 3, 4, 2 };
        int[] array4 = { 11, 4, 5, 12, 63, 87, 45, 15, 74, 96, 33 };

        showApp(array1);
        showApp(array2);
        showApp(array3);
        showApp(array4);
        System.out.println("---------------------------------------------------------------------");
    }

    private static void showApp(int[] array) {
        System.out.println("---------------------------------------------------------------------");
        System.out.print("Original Array: ");
        printArray(array);

        quickSort(array, 0, array.length - 1);

        System.out.print("Order Array: ");
        printArray(array);
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, high);
        return i + 1;
    }

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
