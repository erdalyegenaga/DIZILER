import java.util.Arrays;
import java.util.Scanner;

public class DiziMaxMin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] list = {15,12,788,1,-1,-778,2,0};
        int min = list[0];
        int max = list[0];

        System.out.println(Arrays.toString(list));
        System.out.print("Girilen Sayi : ");
        int num = scan.nextInt();

        Arrays.sort(list);
        for (int i : list){
            if (i<num){
                min = i;
            }else {
                max = i;
                break;
            }
        }
        System.out.println("Girilen sayidan kucuk en yakin sayi : " + min);
        System.out.println("Girilen sayidan buyuk en yakin sayi : " + max);
    }
}
