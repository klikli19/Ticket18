import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            double random = Math.random() * 100;
            arr[i] = (int) random;
        }
        System.out.println(Arrays.toString(arr));
        int first = 0;
        int second = 0;
        for (int j : arr)
            if (j > first){
                second = first;
                first = j;
            } else if (j > second) {
                second = j;
            }
        System.out.println(second);

    }
}