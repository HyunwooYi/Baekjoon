import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");

        int first = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());
        ArrayList<Integer> arr = new ArrayList<>();
        int sum = 0;

        for (int i = 1; i <= 1000; i++) {
            for (int k = i ; k >0; k--) {
                arr.add(i);
            }
        }

        for (int j = first-1; j < second; j++) {
            sum += arr.get(j);
        }
        System.out.println(sum);

    }
}
