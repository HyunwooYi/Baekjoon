import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        Integer[] arr = new Integer[num];

        if (num == 0)
            System.out.println(0);
        else {
            for (int i = 0; i < num; i++) {
                arr[i] = Integer.parseInt(bf.readLine());
            }
            Arrays.sort(arr);

            int averageNumber = (int) Math.round(num * 0.15);
            int result= 0;
            for (int i = averageNumber; i < num - averageNumber; i++) {
                result+= arr[i];
            }

            System.out.println((int)Math.round(result /(num-(averageNumber*2.0))));

        }
    }
}