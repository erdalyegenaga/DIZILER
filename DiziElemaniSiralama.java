import java.util.Arrays;
import java.util.Scanner;

public class DiziElemaniSiralama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Dizinin boyutu (n) : ");
        int elemanSayisi = scan.nextInt();
        int[] array = new int[elemanSayisi];

        System.out.println("Dizinin elemanlarini giriniz..! ");

        for (int i = 0; i < elemanSayisi; i++) {
            System.out.println((i + 1) + ". Elemani : ");
            array[i] = scan.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {

                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println("Siralama : " + Arrays.toString(array));
    }
}