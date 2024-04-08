import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int time = Integer.parseInt(br.readLine());
        String input = br.readLine();
        int cnt = 0;

        StringTokenizer st = new StringTokenizer(input, " ");
        
        for (int i = 0; i < time; i++) {
            boolean bool = true;
            int num = Integer.parseInt(st.nextToken());
            
            if (num == 1) {
                continue;
            }
            
            for (int k = 2; k <= Math.sqrt(num); k++) {
                if (num % k == 0) {
                    bool = false;
                    break;
                }
            }
            
            if (bool) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
