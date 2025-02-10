import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = new String[5];
        double result = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < 5; i++) {
            arr[i] = st.nextToken();
        }

        for(int j = 0; j < 5; j++) {
            result += Math.pow(Double.parseDouble(arr[j]), 2);
        }

        System.out.println((int)(result%10));

    }

}
