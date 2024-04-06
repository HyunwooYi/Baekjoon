import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());


        for (int j = 0; j < n; j++) {
            int[] temp = new int[10];
            String input = br.readLine();

            StringTokenizer st = new StringTokenizer(input, " ");

            for ( int k = 0; k < 10; k++) {
                temp[k] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(temp);
            System.out.println(temp[7]);
        }
        br.close();

    }
}
