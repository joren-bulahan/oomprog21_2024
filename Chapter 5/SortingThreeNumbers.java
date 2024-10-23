import java.util.Scanner;

public class SortingThreeNumbers {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers:");

        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

       
        System.out.print("Numbers in ascending order: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        scanner.close();
    }
}
