import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(bf.readLine());
        StringTokenizer str1 = new StringTokenizer(bf.readLine());
        StringTokenizer str2 = new StringTokenizer(bf.readLine());
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[6];
        int[] order = new int[2];

        int i = 0;
        while (str1.hasMoreTokens()) {
            arr[i++] = Integer.parseInt(str1.nextToken());
        }

        int j = 0;
        while (str2.hasMoreTokens()) {
            order[j++] = Integer.parseInt(str2.nextToken());
        }
        int result = 0;
        for (int k = 0; k < 6; k++) {
            result = result + ((arr[k] + order[0] - 1) / order[0]);
        }
        sb.append(result).append("\n");

        int penBundle = cnt / order[1];
        int penEach = cnt % order[1];
        sb.append(penBundle).append(" ").append(penEach);
        System.out.println(sb);


    }
}