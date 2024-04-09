import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int start = Integer.parseInt(br.readLine());
        int end = Integer.parseInt(br.readLine());
        int sum = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        int cnt = end - start + 1;

        for (int i = start; i <= end; i++) {    // 반복 횟수
            boolean bool = true;
             if (i == 1) {
                 continue;
             }

             for (int j = 2; j <= Math.sqrt(i); j++) {

                 if (i % j == 0) {
                     bool = false;
                     break;
                 }

             }

             if (bool) {
                 arr.add(i);
                 sum += i;
             }
        }
        if (arr.size() == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(arr.get(0));
        }
    }
}