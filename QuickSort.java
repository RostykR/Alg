import java.util.Arrays;
 class Quick {
    public static void main(String args[]) {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 100) + 1);
        }
        System.out.println("Перед сортуванням:");
        System.out.println(Arrays.toString(arr));

        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("Після сортування:");
        System.out.println(Arrays.toString(arr));
    }
}
 class QuickSort {
    int partition(int arr[], int first, int last) {
        int pivot = arr[last];
        int i = (first - 1);
        for (int j = first; j < last; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[last];
        arr[last] = temp;
        return i + 1;
    }

    void sort(int arr[], int first, int last) {
        if (first < last) {
            int pi = partition(arr, first, last);
            sort(arr, first, pi - 1);
            sort(arr, pi + 1, last);
        }
    }
}
