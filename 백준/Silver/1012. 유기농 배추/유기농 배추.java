import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr;
    static boolean[][] visits;
    static int[] dy = {-1, 0, 1, 0}; // 상, 우, 하, 좌
    static int[] dx = {0, 1, 0, -1}; // 상, 우, 하, 좌
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int K;
        for (int c = 0; c < test; c++) {
            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            arr = new int[N][M];
            visits = new boolean[N][M];

            // 배추 심기
            for (int t = 0; t < K; t++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                arr[y][x] = 1;
            }

            int count = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (!visits[i][j] && arr[i][j] == 1) {
                        dfs(i, j);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }

    static void dfs(int x, int y) {
        visits[x][y] = true;
        for (int a = 0; a < 4; a++) {
            int new_x = x + dy[a];
            int new_y = y + dx[a];

            if (new_x < 0 || new_y < 0 || new_x >= N || new_y >= M) continue;

            if (!visits[new_x][new_y] && arr[new_x][new_y] == 1) {
                dfs(new_x, new_y);
            }
        }
    }
}
