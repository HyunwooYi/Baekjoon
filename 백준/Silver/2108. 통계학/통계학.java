import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int cnt = Integer.parseInt(bf.readLine());
        int[] arr = new int[cnt];
        int[] diffArr = new int[cnt];

        for (int i = 0; i < cnt; i++) {
            arr[i] = Integer.parseInt(bf.readLine());
            diffArr[i] = 0;
        }

        // 1. 산술평균
        int sum = 0;
        int average = 0;
        for (int a : arr) {
            sum += a;
        }
        average = Math.round((float) sum / cnt);
        sb.append(average).append("\n");

        // 2. 중앙값
        Arrays.sort(arr);
        sb.append(arr[cnt / 2]).append("\n");

        // 3. 최빈값
        Map<Integer, Integer> modeMap = new HashMap<>();
        for(int n : arr) {
            modeMap.put(n, modeMap.getOrDefault(n, 0) + 1);
        }

        int max = Collections.max(modeMap.values());
        List<Integer> temp = new ArrayList<>();
        for ( Map.Entry<Integer, Integer> entry : modeMap.entrySet()) {
            if (entry.getValue() == max) {
                temp.add(entry.getKey());
            }
        }

        Collections.sort(temp);
        if (temp.size() == 1) {
            sb.append(temp.get(0)).append("\n");
        } else {
            sb.append(temp.get(1)).append("\n");
        }

        //4. 범위
        int diffValue = arr[cnt - 1] - arr[0];
        sb.append(diffValue);
        System.out.println(sb);
    }
}
