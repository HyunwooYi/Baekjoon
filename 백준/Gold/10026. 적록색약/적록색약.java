import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int N;
    static char[][] arr;
    static boolean[][] visits;
    static int[] dx = {-1, 0, 0, 1};
    static int[] dy = {0, 1, -1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new char[N][N];

        for (int i = 0; i < N; i++) {
            String S = br.readLine();
            for (int j = 0; j < N; j++) {
                arr[i][j] = S.charAt(j);
            }
        }

        // 정상인 경우
        visits = new boolean[N][N];
        int normal_cnt = countAreas();

        // 색약인 경우
        GreenToRed();
        visits = new boolean[N][N];
        int abnormal_cnt = countAreas();

        System.out.println(normal_cnt + " " + abnormal_cnt);
    }

    static int countAreas() {
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visits[i][j]) {
                    dfs(i, j, arr[i][j]);
                    cnt++;
                }
            }
        }
        return cnt;
    }

    static void dfs(int x, int y, char target) {
        visits[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int new_x = x + dx[i];
            int new_y = y + dy[i];

            if (new_x < 0 || new_y < 0 || new_x >= N || new_y >= N) continue;
            if (!visits[new_x][new_y] && arr[new_x][new_y] == target) {
                dfs(new_x, new_y, target);
            }
        }
    }

    static void GreenToRed() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i][j] == 'G') arr[i][j] = 'R';
            }
        }
    }
}
