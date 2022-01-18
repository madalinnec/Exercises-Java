package exercises;

public class MainForSecondMaxInAnArray {
    public static void main(String[] args) {
        int[] array = {5, 3, 2, 65, 647, 23, 12, 7, 974534, 23, 56, 753, 112, 22, 45, 0};
        findSecondMaxInArray(array);
    }

    public static void findSecondMaxInArray(int[] array) {
        int maxValueInArray = array[0];
        int secondMaxValueInArray = array[0];
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j] && maxValueInArray < array[j]) {
                    maxValueInArray = array[j];
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (secondMaxValueInArray < array[i] && maxValueInArray > array[i]) {
                secondMaxValueInArray = array[i];
            }
        }
        System.out.println("The second max value in this array is: " + secondMaxValueInArray);
    }
}