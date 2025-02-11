import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());

        int sum = 0;
        int start = 1;

        for (int i = 0; i < n; i++) {
            list.add(br.readLine());
        }

        for (String str : list) {
            sum = 0;
            start = 1;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'X') {
                    start = 1;
                } else {
                    sum += start;
                    start++;
                }
            }
            result.add(sum);
        }
        for (Integer answer : result)
            System.out.println(answer);
    }
}
