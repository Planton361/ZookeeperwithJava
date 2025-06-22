import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxTemperature = 0; // Initialize maximum temperature observed
        int currentTemp = 0;

        // Add your while loop or do-while loop here to process input temperatures
        while(currentTemp < 100){
            currentTemp = scanner.nextInt();
            if(currentTemp > maxTemperature && currentTemp<100){
                maxTemperature = currentTemp;
            }
        }

        // After exiting the loop, print the highest temperature
        System.out.println(maxTemperature);

        scanner.close(); // Close the scanner
    }
}