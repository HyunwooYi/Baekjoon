import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    static int[][] dp = new int[15][15]; // 최대 14까지니까 15크기로

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        // 0층 초기화: 1호에 1명, 2호에 2명, ..., n호에 n명
        for (int i = 1; i <= 14; i++) {
            dp[0][i] = i;
        }

        // DP 채우기
        for (int k = 1; k <= 14; k++) { // 층
            for (int n = 1; n <= 14; n++) { // 호
                dp[k][n] = dp[k][n-1] + dp[k-1][n];
            }
        }

        for (int t = 0; t < T; t++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            sb.append(dp[k][n]).append("\n");
        }
        System.out.println(sb);
    }
}
