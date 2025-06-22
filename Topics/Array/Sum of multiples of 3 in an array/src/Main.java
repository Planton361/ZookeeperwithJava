import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // create scanner instance to read input
        Scanner scanner = new Scanner(System.in);

        // read the number of elements
        int n = scanner.nextInt();

        // create your array here
        int[] array = new int[n];
        int result = 0;

        // use a loop to read the array elements
        for (int j : array) {
            array[j] = scanner.nextInt();
            if (array[j] % 3 == 0) {
                result += array[j];
            }
        }
        System.out.println(result);

        // use a loop to calculate the sum of elements that are multiples of 3

        // close the scanner
        scanner.close();
    }
}