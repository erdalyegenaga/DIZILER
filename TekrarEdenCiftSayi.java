import java.util.Arrays;
import java.util.Scanner;

public class TekrarEdenCiftSayi {
    public static void main(String[] args) {
        int[] numbers = {12, 6, 12, 31, 5, 98, 98, 22, 6, 77, 31, 44, 44, 34, 6};
        int[] equalNumbers = new int[numbers.length];
        int counter = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i != j && numbers[i] == numbers[j]) {
                    if (numbers[i] % 2 == 0) {
                        equalNumbers[counter++] = numbers[i];
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(equalNumbers));
    }
}
