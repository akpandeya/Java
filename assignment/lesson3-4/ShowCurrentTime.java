import java.util.*;

public class ShowCurrentTime {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int offset;

        System.out.printf("Enter the offset: ");
        offset = input.nextInt();

        // Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();

        // Obtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;

        // Compute the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;

        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;

        // Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;

        // Obtain the total hours
        long totalHours = totalMinutes / 60;

        // Compute the current hour
        long currentHour = (totalHours + offset) % 24;
        
        // Display results
        System.out.printf("Current time is %02d:%02d:%02d GMT%n",  currentHour, currentMinute, currentSecond);
        
    }
    
}