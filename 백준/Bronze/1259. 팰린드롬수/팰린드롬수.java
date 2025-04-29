import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> arr;
        StringBuilder sb = new StringBuilder();

        while (true) {
            String str = br.readLine();
            if (str.equals("0")) {
                break;
            } else if (str.length() == 1) {
                sb.append("yes").append("\n");
            } else {
                arr = List.of(str.split(""));
                int len = arr.size() / 2;
                for (int i = 0, j = arr.size() - 1; i < len; i++, j--) {
                    if (arr.get(i).equals(arr.get(j))) {
                        if (i == len - 1) {
                            sb.append("yes").append("\n");
                        }
                    } else {
                        sb.append("no").append("\n");
                        break;
                    }
                }
            }
        }
        System.out.println(sb);
    }
}
