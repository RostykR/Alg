import java.util.Arrays;
public class Main {
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
