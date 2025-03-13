import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            List<Integer> numberValue = new ArrayList<>();
            String str = br.readLine();
            arr[i] = str;   // String 배열에 괄호 저장

            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == '(') {
                    numberValue.add(1);
                } else {
                    numberValue.add(-1);
                }
            }
            int k = 0;
            while (k < numberValue.size() - 1) {
                if (numberValue.get(k) == 1 && numberValue.get(k + 1) == -1) {
                    numberValue.remove(k + 1);
                    numberValue.remove(k);
                    k = Math.max(0, k - 1);
                } else {
                    k++;
                }
            }
            if (numberValue.isEmpty())
                sb.append("YES\n");
            else
                sb.append("NO\n");
        }
        System.out.println(sb);


    }
}