import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N, M, duplication = 0;
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        HashSet<String> setN = new HashSet<>();
        HashSet<String> setM = new HashSet<>();
        HashSet<String> set = new HashSet<>();

        for (int n = 0; n < N; n++) {
            setN.add(br.readLine());
        }

        for (int m = 0; m < M; m++) {
            setM.add(br.readLine());
        }

        for (String s : setN) {
            if (!setM.add(s)) {
                duplication++;
                set.add(s);
            }
        }
        
        System.out.println(duplication);
        List<String> list = new ArrayList<>(set);
        Collections.sort(list);
        for (String str : list) {
            System.out.println(str);
        }
    }
}
