package Exercise;

import java.util.Scanner;

public class ListofNumber {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter the number of elements: ");
			int count = scanner.nextInt();

			int[] numbers = new int[count];

			System.out.println("Enter the numbers:");

			for (int i = 0; i < count; i++) {
			    numbers[i] = scanner.nextInt();
			}

			System.out.println("Input numbers:");
			for (int i = 0; i < count; i++) {
			    System.out.println(numbers[i]);
			}
		}
    }
}