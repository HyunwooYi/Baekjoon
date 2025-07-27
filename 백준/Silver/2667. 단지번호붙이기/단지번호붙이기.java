import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    static int N;
    static int[][] arr;
    static boolean[][] visits;
    static int[] dx = {-1, 0, 0, 1};
    static int[] dy = {0, 1, -1, 0};
    static List<Integer> areaSizes = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < N; j++) {
                arr[i][j] = s.charAt(j) - '0';
            }
        }

        visits = new boolean[N][N];
        int block = countAreas();

        Collections.sort(areaSizes);
        System.out.println(block);
        for (int size : areaSizes) {
            System.out.println(size);
        }
    }

    static int countAreas() {
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visits[i][j] && arr[i][j] == 1) {
                    int size = dfs(i, j);
                    areaSizes.add(size);
                    cnt++;
                }
            }
        }
        return cnt;
    }

    static int dfs(int x, int y) {
        visits[x][y] = true;
        int size = 1;

        for (int i = 0; i < 4; i++) {
            int new_x = x + dx[i];
            int new_y = y + dy[i];

            if (new_x < 0 || new_y < 0 || new_x >= N || new_y >= N) continue;
            if (!visits[new_x][new_y] && arr[new_x][new_y] == 1) {
                size += dfs(new_x, new_y);
            }
        }
        return size;
    }
}