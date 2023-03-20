public class InsertionSort {
    public static void main(String[] args){
        double[] array = new double[10];
        array[0] = 3.200;
        array[1] = 2.400;
        array[2] = 4.320;
        array[3] = 2.540;
        array[4] = 1.700;
        array[5] = 1.750;
        array[6] = 5.400;
        array[7] = 7.200;
        array[8] = 4.600;
        array[9] = 5.600;
        double[] sortedArray = insertionSort(array);
        System.out.println("Відсортований список масси автомобілів на парковці автосалону: ");
        for (int i = 0; i < sortedArray.length; i++){
            System.out.println("- " + sortedArray[i] + "; ");
        }

    }
    public static double[] insertionSort(double[] array) {
        for (int i = 1; i < array.length; i++) {
            double newValue = array[i];
            int j = i;
            while (j > 0 && array[j - 1] > newValue) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = newValue;
        }
        return array;
    }
}