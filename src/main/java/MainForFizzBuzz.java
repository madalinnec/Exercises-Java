public class MainForFizzBuzz {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        int[] array2 = {1,2,4,7,8};
        findFizzBuzz(array2);
    }

    public static void findFizzBuzz(int[] array) {
        boolean isThereAFizzBuzz = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0 && array[i] % 5 == 0) {
                System.out.println(array[i] + " -> FizzBuzz");
                isThereAFizzBuzz = true;
            } else {
                if (array[i] % 3 == 0) {
                    System.out.println(array[i] + " -> Fizz");
                    isThereAFizzBuzz = true;
                } else {
                    if (array[i] % 5 == 0) {
                        System.out.println(array[i] + " -> Buzz");
                        isThereAFizzBuzz = true;
                    }
                }
            }
        }
        if(!isThereAFizzBuzz){
            System.out.println("There is no Fizz, Buzz or FizzBuzz in the array :(.");
        }
    }
}
