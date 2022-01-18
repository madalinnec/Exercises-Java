package exercises;

public class MainForSmallestDifferenceInArray {
    public static void main(String[] args) {
        int[] array = {12,34,25,67,86,42,11,24,5,2,124,6,8,86,89};
        findSmallestDifferenceElements(array);
    }
    public static void findSmallestDifferenceElements(int[] array){
        int smallestDifference = Integer.MAX_VALUE;
        int firstElement = 0;
        int secondElement = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(i != j && array[i]-array[j]<smallestDifference){
                    smallestDifference = array[i] - array[j];
                    firstElement = array[i];
                    secondElement = array[j];
                }
            }
        }
        System.out.println("The elements with the smallest difference, " + smallestDifference +
                            " are " + firstElement + " and " + secondElement);
    }
}
