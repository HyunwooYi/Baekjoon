import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[2];
        int min = 0;

        String n = br.readLine();
        StringTokenizer st = new StringTokenizer(n, " ");

        for(int i = 0; i < 2; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        min = Math.min(arr[0], arr[1]);

        while (true) {
            if ( (arr[0] % min == 0) && (arr[1] % min == 0)) {
                System.out.println(min);
                System.out.println(min * (arr[0] / min) * (arr[1] / min));
                break;
            }
            min--;
        }

    }
}
