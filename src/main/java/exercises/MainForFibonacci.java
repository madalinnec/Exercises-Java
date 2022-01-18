package exercises;

public class MainForFibonacci {
    public static void main(String[] args) {
        int highestValueToBeReached = 2000;
        createFibonacci(highestValueToBeReached);
    }

    public static void createFibonacci(int x){
        int firstElement = 0;
        System.out.println(firstElement);
        int secondElement = 1;
        int nextElement = 1;
        while (nextElement <= x ){
            System.out.println(nextElement);
            nextElement = firstElement + secondElement;
            firstElement = secondElement;
            secondElement = nextElement;
        }
    }
}
