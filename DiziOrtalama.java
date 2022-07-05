import java.util.Arrays;

public class DiziOrtalama {
    public static void main(String[] args) {
        double[] list = {3, 8, 4, 12, 5, 5};
        double listAverage= 0.0, listSum=0.0;
        for (int i=0; i<list.length; i++){
            listSum += 1/list[i];
        }
        listAverage = list.length / listSum;
        System.out.println(listAverage);
    }
}
