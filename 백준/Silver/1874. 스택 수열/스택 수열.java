import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        int[] goal = new int[n];
        List<Integer> list = new ArrayList<>();  // 비교할 숫자 넣는 리스트
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < n; i++) {
            goal[i] = Integer.parseInt(bf.readLine());
        }
        int goalIndex = 0;
        // 1~n 까지 진행
        for (int value = 1; value <= n; value++) {
            list.add(value);
            sb.append("+\n");

            while (!list.isEmpty() && list.get(list.size() - 1) == goal[goalIndex]) {
                list.remove(list.size() - 1);
                sb.append("-\n");
                goalIndex++;
            }
        }

        // n~1까지 진행
        while (!(list.isEmpty()) && goalIndex <= n) {
            if (list.get(list.size() - 1) == goal[goalIndex]) {
                list.remove(list.size() - 1);
                sb.append("-\n");
            } else {
                sb.setLength(0);
                sb.append("NO");
                break;
            }
            goalIndex++;
        }
        System.out.println(sb);
    }
}