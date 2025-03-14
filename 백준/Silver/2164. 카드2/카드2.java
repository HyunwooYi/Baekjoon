
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        if (queue.size() == 1) {
            System.out.println(queue.peek());
        } else {
            for (int t = 0; t < n - 1; t++) {  // 6번 반복
                queue.remove();
                if (queue.size() == 1) {
                    System.out.println(queue.peek());
                    break;
                } else {
                    queue.add(queue.poll());
                }
            }
        }

    }
}