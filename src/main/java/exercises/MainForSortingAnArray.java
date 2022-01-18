package exercises;

public class MainForSortingAnArray {
    public static void main(String[] args) {
        int[] array = {5, 3, 2, 65, 647, 23, 12, 7, 974534, 23, 56, 753, 112, 22, 45, 0};
        sortArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }

    public static int[] sortArray(int[] array) {
        int aux1;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i]>array[j]){
                    aux1 = array[j];
                    array[j] = array[i];
                    array[i] = aux1;
                }
            }
        }
        return array;
    }
}
