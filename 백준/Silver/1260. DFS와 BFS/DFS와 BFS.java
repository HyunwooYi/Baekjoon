import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[][] arr;
    static boolean[] visits;
    static LinkedHashSet<Integer> mySet;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        mySet = new LinkedHashSet<>();

        int M, V;
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        arr = new int[N + 1][N + 1];

        // 간선 표시
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[x][y] = 1;
            arr[y][x] = 1;
        }

        // dfs
        visits = new boolean[N + 1];
        dfs(V);
        System.out.println();
        // bfs
        visits = new boolean[N + 1];
        bfs(V);

        for (int num : mySet) {
            System.out.print(num + " ");
        }
    }

    static void dfs(int v) {
        visits[v] = true;
        System.out.print(v + " ");

        for (int i = 1; i <= N; i++) {
            if (arr[v][i] == 1 && !visits[i]) {
                dfs(i);
            }
        }
    }

    static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visits[start] = true;

        while (!queue.isEmpty()) {
            int v = queue.poll();
            System.out.print(v + " ");

            for (int i = 1; i <= N; i++) {
                if (arr[v][i] == 1 && !visits[i]) {
                    queue.add(i);
                    visits[i] = true;
                }
            }
        }
    }
}
