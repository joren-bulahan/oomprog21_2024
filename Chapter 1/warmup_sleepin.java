import java.util.Scanner;

public class warmup_sleepin {
    public static boolean sleepIn(boolean weekday, boolean vacation) {
 return !weekday || vacation;
    }
    public static void main(String[] args) {
        warmup_sleepin sleeping = new warmup_sleepin();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("is it Weekday? (true/false)");
        boolean weekends = scanner.nextBoolean();
        
        System.out.println("is it Vacation? (true/false)");
        boolean vacations = scanner.nextBoolean();
        
        boolean result = sleepIn(weekends,vacations);
        
        System.out.println("The sleepIn result is: " + result);
        
    }
}
