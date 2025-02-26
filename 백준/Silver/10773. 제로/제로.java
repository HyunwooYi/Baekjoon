import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        Integer[] arr = new Integer[num];
        int put = 0;
        int k = 0;
        int sum = 0;

        for (int i = 0; i < num; i++) {
            put = Integer.parseInt(bf.readLine());
            if (put != 0) {
                arr[i] = put;
                k = i;
            } else {
                while (arr[k] == 0) {
                    k--;
                }
                arr[k] = put;
                arr[i] = put;
            }
        }
        for (Integer a : arr) {
            sum += a;
        }
        System.out.println(sum);

    }
}
